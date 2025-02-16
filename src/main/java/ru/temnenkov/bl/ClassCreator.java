package ru.temnenkov.bl;

import org.apache.bcel.Const;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.MethodGen;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class ClassCreator {

    private final ClassGen classGen;
    private final ConstantPoolGen cp;
    private final InstructionFactory instructionFactory;
    private final String className;
    private final String fileName;

    public interface Agent {
        class Result {
            final MethodGen methodGen;
            final InstructionList il;

            public Result(MethodGen methodGen, InstructionList il) {
                this.methodGen = methodGen;
                this.il = il;
            }
        }

        Result createMethod(ConstantPoolGen cp, InstructionFactory instructionFactory, String className);
    }

    public ClassCreator(@NotNull String className, @NotNull String fileName) {
        this.className = className;
        this.fileName = fileName;
        classGen = new ClassGen(className,
                "java.lang.Object",
                fileName, Const.ACC_PUBLIC | Const.ACC_SUPER, null);

        cp = classGen.getConstantPool();
        instructionFactory = new InstructionFactory(classGen, cp);
    }

    public void createMethod(Agent agent) {
        final Agent.Result result = agent.createMethod(cp, instructionFactory, className);
        result.methodGen.setMaxStack();
        result.methodGen.setMaxLocals();
        classGen.addMethod(result.methodGen.getMethod());
        result.il.dispose();
    }

    public void finish() {
        classGen.addEmptyConstructor(Const.ACC_PUBLIC);
    }

    public JavaClass getAndDumpJavaClass() throws IOException {
        final JavaClass javaClass = classGen.getJavaClass();
        javaClass.dump(fileName);
        return javaClass;
    }
}
