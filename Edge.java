/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kylegreenfield
 */
public class Edge {
    
    private final Vertex TAIL;
    private final Vertex HEAD;
    private final double EDGE_LENGTH;
    
    public Edge(Vertex tail, Vertex head, double length) {
        TAIL = tail;
        HEAD = head;
        EDGE_LENGTH = length;       
    }
    
    public Vertex getHead() {
        return HEAD;
    }
    
    public double getEdgeLength() {
        return EDGE_LENGTH ;
    }
    
}
