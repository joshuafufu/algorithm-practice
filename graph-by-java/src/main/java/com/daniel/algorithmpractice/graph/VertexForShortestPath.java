package com.daniel.algorithmpractice.graph;

import java.util.LinkedList;

public class VertexForShortestPath {

    String name;
    LinkedList<VertexForShortestPath> adjcent;
    VertexForShortestPath path; // previous vertex on the shortest path
    int dist; // cost

    public VertexForShortestPath(String name) {
	this.name = name;
	this.adjcent = new LinkedList<VertexForShortestPath>();
	reset();
    }

    public void reset() {
	dist = GraphForShortestPath.INFINITY;
	path = null;
    }

}
