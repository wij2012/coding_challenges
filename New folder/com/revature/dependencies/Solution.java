package com.revature.dependencies;


import javafx.util.Pair;
import java.util.ArrayList;

public class Solution {

    ArrayList<Pair> dependencies = new ArrayList<>();

    Solution(ArrayList<Pair> dependencies){
        this.dependencies.addAll(dependencies);
    }

    boolean hasOrIsADependency(Character project){
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

    boolean isADependency(Character project){
        for(int i=0; i<dependencies.size(); i++){
            if(dependencies.get(i).getKey() == project){
                return true;
            }
        }
        return false;
    }

    boolean hasADependency(Character project){
        for(int i=0; i<dependencies.size(); i++){
            if(dependencies.get(i).getValue() == project){
                return true;
            }
        }
        return false;
    }

    ArrayList<Character> findDependencyOrder(ArrayList<Character> projects){

        ArrayList<Character> moreOutput = new ArrayList<>();

        //first, find anything that has no dependencies but is a dependency itself
        for(Character c : projects){
            for(int i=0; i<dependencies.size(); i++){

            }
        }

        return moreOutput;
    }

}
