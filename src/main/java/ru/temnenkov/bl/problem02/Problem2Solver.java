package ru.temnenkov.bl.problem02;

import org.apache.bcel.Const;
import org.apache.bcel.generic.InstructionConst;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.Type;
import ru.temnenkov.bl.ClassCreator;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Problem2Solver {

    private static final String CLASS_NAME = "ru.temnenkov.bl.problem02.AddBcelImpl";
    private static final String METHOD_NAME = "add";

    public void solve() throws IOException {
        final ClassCreator classCreator = new ClassCreator(CLASS_NAME, "AddBcelImpl.class");
        classCreator.createMethod((cp, inf, className) -> {
            final InstructionList il = new InstructionList();
            il.append(InstructionFactory.createLoad(Type.INT, 1));
            il.append(InstructionFactory.createLoad(Type.INT, 2));
            il.append(InstructionConst.IADD);
            il.append(InstructionFactory.createReturn(Type.INT));
            final MethodGen methodGen = new MethodGen(Const.ACC_PUBLIC , Type.INT, new Type[]{Type.INT, Type.INT}, new String[] {"a", "b"}, METHOD_NAME, className, il, cp);
            return new ClassCreator.Agent.Result(methodGen, il);
        });
        classCreator.finish();
        classCreator.getAndDumpJavaClass();
    }

    public void test() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Object instance = clazz.getDeclaredConstructor().newInstance();
        java.lang.reflect.Method method = clazz.getMethod(METHOD_NAME, int.class, int.class);
        int result = (int) method.invoke(instance, 5, 3);
        System.out.println("add: " + result);
    }
}
