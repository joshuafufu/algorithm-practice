package com.daniel.algorithmpractice.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;

public class Graph {
    private HashMap<String, Vertex> vertexMap = new HashMap<String, Vertex>();

    public void addEdge(String sourceName, String destName) {
	Vertex v = getVertex(sourceName);
	Vertex w = getVertex(destName);

	v.adjacent.add(w);
	w.path.add(v);
    }

    private Vertex getVertex(String vertexName) {
	Vertex v = (Vertex) vertexMap.get(vertexName);

	if (v == null) {
	    v = new Vertex(vertexName);
	    vertexMap.put(vertexName, v);
	}

	return v;
    }

    public void printPathFromBegin(String destName) {
	Vertex dest = (Vertex) vertexMap.get(destName);

	if (dest == null) {
	    throw new NoSuchElementException("Destination vertex not found");
	} else {
	    printPath(dest);
	}
    }

    private void printPath(Vertex dest) {

	// if (dest.path.isEmpty()) {
	// System.out.println();
	// System.out.print(dest.name);
	// }
	// for (Vertex p : dest.path) {
	// printPath(p);
	// System.out.print("->");
	// System.out.print(dest.name);
	// }
	Vertex start = (Vertex) vertexMap.get("(" + 0 + "," + 0 + ")");

	Stack<Vertex> printStack = new Stack<Vertex>();
	printStack.push(dest);
	dest.instack = true;

	while (!printStack.empty()) {

	    while (printStack.peek() != start) {
		for (Vertex vertex : printStack.peek().path) {
		    if (vertex.instack == false) {
			printStack.push(vertex);
			vertex.instack = true;
		    }
		    break;
		}
	    }

	    printStackElement(printStack);

	    ((Vertex) printStack.peek()).instack = false;
	    printStack.pop();

	}

    }

    public List<String> getPathFromBegin(String destName) {
	Vertex dest = (Vertex) vertexMap.get(destName);

	List<String> rets;

	if (dest == null) {
	    throw new NoSuchElementException("Destination vertex not found");
	} else {
	    rets = getPathByRecursion(dest);
	}

	return rets;
    }

    public List<String> getPathByRecursion(Vertex dest) {
	List<String> current_list = new ArrayList<String>();
	if (dest.path.isEmpty()) {
	    current_list.add(dest.name);
	    return current_list;
	}

	for (Vertex p : dest.path) {
	    for (String ret : getPathByRecursion(p)) {
		ret = ret + "->" + dest.name;
		current_list.add(ret);
	    }
	}

	return current_list;

    }

    private void printStackElement(Stack stack) {
	System.out.print(((Vertex) stack.pop()).name);

	while (!stack.isEmpty()) {
	    System.out.print("->");
	    System.out.print(((Vertex) stack.pop()).name);
	}
    }
}
