package ru.temnenkov.bl;

import ru.temnenkov.bl.problem03.Problem3Solver;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        Problem3Solver problem3Solver = new Problem3Solver();
        problem3Solver.test();
    }
}
