/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kylegreenfield
 */
public class Vertex {
    private final Edge[] EDGE_TAILS ;
    private double greedyScore ;
    private boolean pathChecked ;
    
    public Vertex(Edge[] tails ) {
        EDGE_TAILS = tails ;
        greedyScore = Double.POSITIVE_INFINITY;
        pathChecked = false ;
    }
    
    public void setGreedyScore( double score ) {
        greedyScore = score ;
    }
    
    public double getGreedyScore() {
        return greedyScore;
    }
    
    public void setPathChecked( boolean value ){
        pathChecked = value;
    }
    
    public void updateEdgeScores() {
        double currentScore;
        double newScore;
        for (int i = 0; i < EDGE_TAILS.length ; i++ ) {
            currentScore = EDGE_TAILS[i].getHead().getGreedyScore();
            newScore = greedyScore + EDGE_TAILS[i].getEdgeLength();
            if ( newScore < currentScore )
                EDGE_TAILS[i].getHead().setGreedyScore(newScore);
        }
    }
}
