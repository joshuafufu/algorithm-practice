package com.daniel.algorithmpractice.graph;

import java.util.List;

public class SquareBoard {

    private static final int SQUARE_LENGTH = 21;

    public static void main(String[] args) {

	Graph graph = initGraph2();

	// graph.printPathFromBegin("(" + 2 + "," + 2 + ")");

	List<String> rets = graph.getPathFromBegin("(" + 20 + "," + 20 + ")");

	for (String ret : rets) {
	    System.out.println(ret);
	}
    }

    private static GraphForShortestPath initGraph() {

	GraphForShortestPath graph = new GraphForShortestPath();

	// add right direction edge.
	for (int i = 0; i < SQUARE_LENGTH; i++) {
	    for (int j = 0; j < SQUARE_LENGTH - 1; j++) {
		String currentVertexName = "(" + i + "," + j + ")";
		String rightVertexName = "(" + i + "," + (j + 1) + ")";

		graph.addEdge(currentVertexName, rightVertexName);
		// System.out.println(currentVertexName + "->" + rightVertexName
		// + " is added");
	    }
	}

	// add left direction edge.
	for (int i = 0; i < SQUARE_LENGTH - 1; i++) {
	    for (int j = 0; j < SQUARE_LENGTH; j++) {
		String currentVertexName = "(" + i + "," + j + ")";
		String downVertexName = "(" + (i + 1) + "," + j + ")";

		graph.addEdge(currentVertexName, downVertexName);
		// System.out.println(currentVertexName + "->" + downVertexName
		// + " is added");
	    }
	}

	return graph;

    }

    private static void printAllPath(GraphForShortestPath g) {
	g.printPath("(" + 20 + "," + 20 + ")");
    }

    private static Graph initGraph2() {

	Graph graph = new Graph();

	// add right direction edge.
	for (int i = 0; i < SQUARE_LENGTH; i++) {
	    for (int j = 0; j < SQUARE_LENGTH - 1; j++) {
		String currentVertexName = "(" + i + "," + j + ")";
		String rightVertexName = "(" + i + "," + (j + 1) + ")";

		graph.addEdge(currentVertexName, rightVertexName);
		// System.out.println(currentVertexName + "->" + rightVertexName
		// + " is added");
	    }
	}

	// add left direction edge.
	for (int i = 0; i < SQUARE_LENGTH - 1; i++) {
	    for (int j = 0; j < SQUARE_LENGTH; j++) {
		String currentVertexName = "(" + i + "," + j + ")";
		String downVertexName = "(" + (i + 1) + "," + j + ")";

		graph.addEdge(currentVertexName, downVertexName);
		// System.out.println(currentVertexName + "->" + downVertexName
		// + " is added");
	    }
	}

	return graph;

    }

}
