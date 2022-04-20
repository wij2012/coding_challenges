package com.revature.dependencies;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {
        ArrayList<Character> projects = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'));
        Pair p1 = new Pair<>('a', 'd');
        Pair p2 = new Pair<>('f', 'b');
        Pair p3 = new Pair<>('b', 'd');
        Pair p5 = new Pair<>('f', 'a');
        Pair p4 = new Pair<>('d', 'c');

        ArrayList<Pair> dependencies = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5));
        ArrayList<Character> output = new ArrayList<>();
        Solution solution = new Solution(dependencies);

        output.addAll(solution.findDependencyOrder(projects));

        System.out.println(projects);
        System.out.println(output);
    }
}
