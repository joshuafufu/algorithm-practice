package com.daniel.algorithmpractice.graph;

import java.util.LinkedList;

public class Vertex {
    String name;
    LinkedList<Vertex> adjacent;
    LinkedList<Vertex> path; // list of the previous vertex
    boolean printed;
    boolean instack;

    public Vertex(String name) {
	this.name = name;
	this.adjacent = new LinkedList<Vertex>();
	this.path = new LinkedList<Vertex>();
	this.printed = false;
	this.instack = false;
    }
}
