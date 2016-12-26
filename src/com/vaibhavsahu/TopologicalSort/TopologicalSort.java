package com.vaibhavsahu.TopologicalSort;

import java.util.Stack;

/**
 * Created by vaibhavsahu on 12/25/16.
 */
public class TopologicalSort {

    private Stack<vertex> stack;

    public TopologicalSort(){
        this.stack = new Stack<>();
    }

    public void doTopologicalSort(vertex source){
        source.setVisited(true);
        //pre visit, but here pre visit is not needed for topological sorting
        //stack.push(source);

        for (vertex v: source.getNeighborList()){
            if(!v.isVisited()){
                v.setVisited(true);
                v.setPredecessor(v);
                doTopologicalSort(v);
            }
        }

        stack.push(source);//post visit

    }

    public Stack<vertex> getStack(){
        return this.stack;
    }
}
