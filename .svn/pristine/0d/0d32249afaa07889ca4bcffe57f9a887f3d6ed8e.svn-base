/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacex_lwjgl;

import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author ThomasHerring
 */
public class PlayerEntity {

    //Global Variables 
    //Player Size
    final public static int playerSize = 10;
    //Gravitational Acceleration Constant
    final public static float GRAVITY = 10f;
    //Player Jump Velocity
    final public static float JUMPVELOCITY = 5f;
    //Player weight
    final public static int MASS = 1;
    //Player cords
    public float playerX = 100f;
    public float playerY = 25f + playerSize;
    public float playerSpeedX, playerSpeedY;
    //Player bounds
    public float[] boundArray = new float[4];
    //Display Resolution
    public int WIDTH;
    public int HEIGHT;
    //Delta time
    int DELTA;
    //Total time since startup
    long TIME;
    //Loop counter for gravity and y velocity
    boolean firstLoop = true;
    //Only safe the W key state for gravity method
    boolean WKEY = false;
    //Booleans to stop movement
    boolean RIGHTLIMIT;
    boolean LEFTLIMIT;
    
    
    boolean onPlatform;
    
    
    float finalVelocity;
    float prevVelocity;
    
    float previousGravity;
                float finalGravity;
                long startTime;
    
                
                
                
                
    
    
    
    public void setTime(long time){
        TIME = time;
    }

    public void setDelta(int delta) {
        DELTA = delta;
    }

    //Test void for Y cord
    public void setY(int yInput) {
        playerY = yInput + playerSize;
    }

    public void setRes(int width, int height) {
        WIDTH = width;
        HEIGHT = height;
    }
    
    public void isOnPlatform(){
        
        if(boundArray[3] - 25 < 15){
            onPlatform = true;
            
            
        } else {
            
            onPlatform = false;
            
        }
        
        
    }

    //Add a method to limit the right and left bounds of player movement
    public void limitPlayer(boolean rightBound, boolean leftBound) {

        playerBounds();

        //This iteration will use (0, Y) as the left bound
        if (boundArray[1] >= 0 && boundArray[1] <= 15) {
            LEFTLIMIT = true;
        } else {
            LEFTLIMIT = false;
        }

        if (rightBound) {
            RIGHTLIMIT = true;            
        } else {
            RIGHTLIMIT = false;
        }

       // System.out.println(rightBound);


    }

    public void drawPlayer(float playerX, float playerY) {

        //Set colour
        glColor3f(0.25f, 0.25f, 1f);
        //Draw quad with mouse centered
        glBegin(GL_QUADS);
        glVertex2f(playerX - playerSize, playerY - playerSize);
        glVertex2f(playerX + playerSize, playerY - playerSize);
        glVertex2f(playerX + playerSize, playerY + playerSize);
        glVertex2f(playerX - playerSize, playerY + playerSize);
        glEnd();
        // playerBounds();
    }

    private void playerBounds() {

        //Right
        boundArray[0] = playerX + playerSize;
        //Left
        boundArray[1] = playerX - playerSize;
        //Upper
        boundArray[2] = playerY + playerSize;
        //Lower
        boundArray[3] = playerY - playerSize;



    }

    public void movePlayer(boolean wKey, boolean aKey,
            boolean sKey, boolean dKey) {



        //if (!LEFTLIMIT) {
        if (aKey) {
            playerSpeedX = Math.max(-6f, playerSpeedX - 1);
            //playerSpeedX *= DELTA;
            // playerX += playerSpeedX;
        }
        //}
        //if (!RIGHTLIMIT) {
        if (dKey) {
            playerSpeedX = Math.min(6f, playerSpeedX + 1);
            // playerSpeedX *= DELTA;
            // playerX += playerSpeedX;
        }

        playerX += playerSpeedX;



        if ((!aKey && playerSpeedX < 0) || (!dKey && playerSpeedX > 0)) {
            playerSpeedX *= 0.9;

        }


        if (wKey && onPlatform) {
            
           prevVelocity = JUMPVELOCITY;
           firstLoop = true;
           playerSpeedY = 0;
            
        }
        
        isOnPlatform();               
        
        if(onPlatform && firstLoop){
            
            playerSpeedY = prevVelocity - finalGravity * (DELTA / 1000f);
            gravity();
            
            
        }
        
        if(!onPlatform){
            
            
            
           if(playerSpeedY >= 0){
                
            playerSpeedY = prevVelocity - finalGravity * (DELTA / 1000f);
            gravity();
                
                
            } else{

           
            playerSpeedY = Math.max( -7f, (prevVelocity - finalGravity * (DELTA / 1000f)));
            gravity();
            
        }
         
        } else if (onPlatform && !firstLoop){
            
            
            playerSpeedY = 0;
            //Set player Y to platform y value
            playerY = 35;
            //Reset gravity
            finalGravity = 0;
            previousGravity = 0;
            
            
        }
        
        
          playerY += playerSpeedY;
        isOnPlatform();
    
        if(RIGHTLIMIT){
            playerX = 200;
            
        }

        if(LEFTLIMIT){
            playerX = 0;
                    }




    }

    private void gravity() {

        

        if(!onPlatform){
            if(firstLoop){
                
                 startTime = TIME;
                firstLoop = false;
                previousGravity = 0;
                finalGravity = 0;
                
                
            }
        
        //This is the for gravity adjusted for a mass of 0 and     
         finalGravity = previousGravity + GRAVITY * ((TIME- startTime) / 1000f);
         previousGravity = finalGravity;
        
        
        
        
        }

    }
    
    
    
    
    
    
}
