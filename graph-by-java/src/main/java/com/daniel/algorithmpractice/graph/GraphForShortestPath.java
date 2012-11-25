package com.daniel.algorithmpractice.graph;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class GraphForShortestPath {

    public static final int INFINITY = Integer.MAX_VALUE;

    private HashMap<String, VertexForShortestPath> vertexMap = new HashMap<String, VertexForShortestPath>();

    public void addEdge(String sourceName, String destName) {
	VertexForShortestPath v = getVertex(sourceName);
	VertexForShortestPath w = getVertex(destName);

	v.adjcent.add(w);
    }

    public void printPath(String destName) throws NoSuchElementException {
	VertexForShortestPath w = (VertexForShortestPath) vertexMap.get(destName);
	if (w == null) {
	    throw new NoSuchElementException("Destination vertex not found");
	} else if (w.dist == INFINITY) {
	    System.out.print(destName + " is unreachable");
	} else {
	    printPath(w);
	    System.out.println();
	}
    }

    private void printPath(VertexForShortestPath dest) {
	if (dest.path != null) {
	    printPath(dest.path);
	    System.out.print(" -> ");
	}

	System.out.print(dest.name);
    }

    private VertexForShortestPath getVertex(String vertexName) {
	VertexForShortestPath v = (VertexForShortestPath) vertexMap.get(vertexName);

	if (v == null) {
	    v = new VertexForShortestPath(vertexName);
	    vertexMap.put(vertexName, v);
	}

	return v;
    }

    private void clearAll() {
	for (Iterator itr = vertexMap.values().iterator(); itr.hasNext();) {
	    ((VertexForShortestPath) itr.next()).reset();
	}
    }

    public void unweighted(String startName) {
	clearAll();

	VertexForShortestPath start = (VertexForShortestPath) vertexMap.get(startName);

	if (start == null) {
	    throw new NoSuchElementException("Start vertex not found");
	}

	LinkedList q = new LinkedList();
	q.addLast(start);
	start.dist = 0;

	while (!q.isEmpty()) {
	    VertexForShortestPath v = (VertexForShortestPath) q.removeFirst();

	    for (Iterator itr = v.adjcent.iterator(); itr.hasNext();) {
		VertexForShortestPath w = (VertexForShortestPath) itr.next();
		if (w.dist == INFINITY) {
		    w.dist = v.dist + 1;
		    w.path = v;
		    q.addLast(w);
		}
	    }
	}
    }

}
