/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacex_lwjgl;

/**
 *
 * @author ThomasHerring
 */
public class CollisionDetect {

    //Entity 1 position
    public float ent1_rightBound;
    public float ent1_leftBound;
    public float ent1_upperBound;
    public float ent1_lowerBound;
    //Entity 2 position
    public float ent2_rightBound;
    public float ent2_leftBound;
    public float ent2_upperBound;
    public float ent2_lowerBound;
    //Main collision matrix
    boolean[] collisionMatrix = new boolean[5];

    public void setFirstEntity(float[] bounds ) {
        ent1_rightBound = bounds[0];
        ent1_leftBound = bounds[1];
        ent1_upperBound = bounds[2];
        ent1_lowerBound = bounds[3];
    }

    public void setSecondEntity(float[] bounds) {
        ent2_rightBound = bounds[0];
        ent2_leftBound = bounds[1];
        ent2_upperBound = bounds[2];
        ent2_lowerBound = bounds[3];
    }

    //Note: Detect is the entities are inside of each other
    public void determineCollisions(int buffer) {

        //Buffer increases the size of the hit box for all collision detections


        //Reset collisionMatrix
        for (int i = 0; i < collisionMatrix.length; i++) {
            collisionMatrix[i] = false;
        }

        /*Determine whether the first entity is directly above the second entity
         *Or if the second entity is directly below the first entity                   
         * First entities lower bound with the second entities upper bound
         */
        if (ent1_lowerBound >= ent2_upperBound && ent1_lowerBound <= ent2_upperBound + buffer) {
            collisionMatrix[0] = true;
        }

        /*Determine whether the first entity is directly below the second entity
         *Or if the second entity is directly above the first entity  
         * First entities upper bound with second entities lower bound
         */
        if (ent1_upperBound <= ent2_lowerBound && ent1_upperBound >= ent2_lowerBound - buffer) {
            collisionMatrix[1] = true;
        }

        /*Determine whether the first entity is directly to the right of the second entity        
         * Or if the second entity is directly to the left othe the first entity
         *  First entities left bound with second entities right bound
         */
        if (ent1_leftBound >= ent2_rightBound && ent1_leftBound <= ent2_rightBound + buffer) {
            collisionMatrix[2] = true;
        }
        
        /*Determine whether the first entity is directly to the left of the second entity        
         * Or if the second entity is directly to the right othe the first entity
         *  First entities right bound with second entities left bound
         */
        if (ent1_rightBound <= ent2_leftBound && ent1_rightBound >= ent2_leftBound - buffer) {
            collisionMatrix[3] = true;
        }
        
        /*Determine whether the first entity is within the X values of the second entity
         * First entity is within the right and left bounds of the second entity 
         */
                
        if((ent1_leftBound > ent2_leftBound && ent1_leftBound < ent2_rightBound) 
                && (ent1_rightBound < ent2_rightBound && ent1_rightBound > ent2_leftBound)){
            collisionMatrix[4] = true;

        }
                
        
    }
}
