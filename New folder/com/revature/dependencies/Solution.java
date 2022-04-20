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
        //ArrayList<Character> itemsToRemove = new ArrayList<>();

        //first, find anything that has no dependency and is not a dependency
        for(Character c : projects){
            //!isadependency && !hasadependency
            if(isADependency(c) == false && hasADependency(c) == false){
                moreOutput.add(c);
            }
        }

        //now, find anything that has no dependencies but is a dependency itself
        for(Character c : projects){
            //isadependency && !hasadependency
            if(isADependency(c) && !hasADependency(c)) {
                moreOutput.add(c);
                //itemsToRemove.add(c);
            }

        }
        //projects.removeAll(itemsToRemove);
        //itemsToRemove.clear();

        //now, find anything that is both a dependency and has a dependency
        for(Character c : projects){
            //isadependency && hasadependency
            if(isADependency(c) && hasADependency(c)) {
                moreOutput.add(c);
                //itemsToRemove.add(c);
            }

        }

        //now, find anything that has a dependency that is not a dependency
        for(Character c : projects){
            //!isadependency && hasadependency
            if(!isADependency(c) && hasADependency(c)) {
                moreOutput.add(c);
                //itemsToRemove.add(c);
            }

        }
        //projects.removeAll(itemsToRemove);
        //itemsToRemove.clear();




        return moreOutput;
    }

}
