package ru.temnenkov.bl;

import ru.temnenkov.bl.problem02.Problem2Solver;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        Problem2Solver problem2Solver = new Problem2Solver();
        problem2Solver.solve();
    }
}
