package com.revature.dependencies;


import javafx.util.Pair;
import java.util.ArrayList;

public class Solution {

    ArrayList<Pair> dependencies = new ArrayList<>();

    Solution(ArrayList<Pair> dependencies){
        this.dependencies.addAll(dependencies);
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

        //first, find anything that has no dependency and is not a dependency
        for(Character c : projects){
            //!isadependency && !hasadependency
            if(!isADependency(c) && !hasADependency(c)){
                moreOutput.add(c);
            }
        }

        //now, find anything that has no dependencies but is a dependency itself
        for(Character c : projects){
            //isadependency && !hasadependency
            if(isADependency(c) && !hasADependency(c)) {
                moreOutput.add(c);
            }

        }

        //now, find anything that is both a dependency and has a dependency
        for(Character c : projects){
            //isadependency && hasadependency
            if(isADependency(c) && hasADependency(c)) {
                moreOutput.add(c);
            }

        }

        //now, find anything that has a dependency that is not a dependency
        for(Character c : projects){
            //!isadependency && hasadependency
            if(!isADependency(c) && hasADependency(c)) {
                moreOutput.add(c);
            }

        }




        return moreOutput;
    }

}
