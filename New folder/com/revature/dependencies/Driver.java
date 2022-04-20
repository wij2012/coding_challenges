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
        //ArrayList<Character> itemsToRemove = new ArrayList<>();
        Solution solution = new Solution(dependencies);

        //look for anything that neither has a dependency nor is a dependency
        for(Character c : projects){
            if(!solution.hasOrIsADependency(c)){
                output.add(c);
            }
        }
        projects.removeAll(output);

        output.addAll(solution.findDependencyOrder(projects));

        System.out.println(projects);
        System.out.println(output);
    }
}
