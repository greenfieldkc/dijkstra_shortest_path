/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kylegreenfield
 */

import java.util.PriorityQueue;

public class DijkstrasGraph {
    private final Edge[] ALL_EDGES;
    private final Vertex[] ALL_VERTICES;
    private PriorityQueue uncheckedNodes;
    
    
    public DijkstrasGraph( Edge[] edges, Vertex[] vertices) {
        ALL_EDGES = edges;
        ALL_VERTICES = vertices;
        for (int i = 0; i < ALL_VERTICES.length ; i++) {
            uncheckedNodes.add(ALL_VERTICES[i]);
        }
    }
    
    public double findShortestPath( Vertex start, Vertex end) {
        while (start != end ) {
            if (start.getGreedyScore() == Double.POSITIVE_INFINITY) {
                start.setGreedyScore(0);
                start.setPathChecked(true);
            }
            start.updateEdgeScores() ;
            Vertex v = uncheckedNodes.poll() ;
            v.setPathChecked(true);
            findShortestPath( v, end ) ;
        }
        return end.getGreedyScore();
    }
}
