package ru.temnenkov.bl.problem01;

import org.apache.bcel.Const;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.Type;
import ru.temnenkov.bl.ClassCreator;

import java.io.IOException;

public class Problem1Solver {
    public void solve() throws IOException {
        ClassCreator classCreator = new ClassCreator("ru.temnenkov.bl.problem01.HelloWorldBCelImpl", "HelloWorldBCelImpl.class");
        classCreator.createMethod((cp, instructionFactory, className) -> {
            InstructionList il1 = new InstructionList();
            il1.append(instructionFactory.createFieldAccess("java.lang.System", "out", new org.apache.bcel.generic.ObjectType("java.io.PrintStream"), Const.GETSTATIC));
            il1.append(instructionFactory.createInvoke("java.io.PrintStream", "println", Type.VOID, new Type[]{Type.STRING}, Const.INVOKEVIRTUAL));
            il1.append(instructionFactory.createReturn(Type.VOID));
            MethodGen methodGen1 = new MethodGen(Const.ACC_PUBLIC | Const.ACC_STATIC, Type.VOID, Type.NO_ARGS, null, "printHelloWorld", className, il1, cp);
            return new ClassCreator.Agent.Result(methodGen1, il1);
        });
        classCreator.getAndDumpJavaClass();
    }
}
