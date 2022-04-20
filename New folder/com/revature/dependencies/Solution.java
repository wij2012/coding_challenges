package com.revature.dependencies;


import javafx.util.Pair;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {

    boolean hasOrIsADependency(Character project, ArrayList<Pair> dependencies){
        for(int i=0; i<dependencies.size(); i++){
            //System.out.println(dependencies.get(i));
            //System.out.println(dependencies.get(i).getKey());
            //System.out.println(dependencies.get(i).getValue());
            if(dependencies.get(i).getKey() == project || dependencies.get(i).getValue() == project){
                return true;
            }
        }
        return false;
    }

    ArrayList<Character> findDependencyOrder(ArrayList<Character> projects, ArrayList<Pair> dependencies){

        ArrayList<Character> moreOutput = new ArrayList<>();

        return moreOutput;
    }

}
