package com.vaibhavsahu.TopologicalSort;

public class Main {

    public static void main(String[] args) {
	// write your code here

        TopologicalSort topologicalSort = new TopologicalSort();

        vertex vertexA = new vertex("A");
        vertex vertexB = new vertex("B");
        vertex vertexC = new vertex("C");
        vertex vertexD = new vertex("D");


        vertexA.addNeighbor(vertexB);
        vertexA.addNeighbor(vertexC);

        vertexB.addNeighbor(vertexD);


        topologicalSort.doTopologicalSort(vertexA);
        //topologicalSort.printStack();

        for (vertex v: topologicalSort.getStack()){
            System.out.println(v.getData());
        }
    }
}
