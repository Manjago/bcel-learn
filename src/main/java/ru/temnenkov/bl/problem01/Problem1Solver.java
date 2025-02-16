package ru.temnenkov.bl.problem01;

import org.apache.bcel.Const;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.Type;
import ru.temnenkov.bl.ClassCreator;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Problem1Solver {

    private static final String CLASS_NAME = "ru.temnenkov.bl.problem01.HelloWorldBcelImpl";
    private static final String METHOD_NAME = "printHelloWorld";

    public void solve() throws IOException {
        final ClassCreator classCreator = new ClassCreator(CLASS_NAME, "HelloWorldBcelImpl.class");
        classCreator.createMethod((cp, instructionFactory, className) -> {
            final InstructionList il = new InstructionList();
            il.append(instructionFactory.createFieldAccess("java.lang.System", "out", new org.apache.bcel.generic.ObjectType("java.io.PrintStream"), Const.GETSTATIC));
            il.append(instructionFactory.createConstant("Hello World!")); // LDC "Hello World!"
            il.append(instructionFactory.createInvoke("java.io.PrintStream", "println", Type.VOID, new Type[]{Type.STRING}, Const.INVOKEVIRTUAL));
            il.append(InstructionFactory.createReturn(Type.VOID));
            final MethodGen methodGen = new MethodGen(Const.ACC_PUBLIC , Type.VOID, Type.NO_ARGS, null, METHOD_NAME, className, il, cp);
            return new ClassCreator.Agent.Result(methodGen, il);
        });
        classCreator.finish();
        classCreator.getAndDumpJavaClass();
    }

    public void test() throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Object instance = clazz.getDeclaredConstructor().newInstance();
        java.lang.reflect.Method method = clazz.getMethod(METHOD_NAME);
        method.invoke(instance);

    }
}
