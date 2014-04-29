/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacex_lwjgl;

/**
 *
 * @author ThomasHerring
 */
import static org.lwjgl.opengl.GL11.*;



public class Stage {

    //Global Variables
    int WIDTH;
    int HEIGHT;
    
    //Boolean to track if a color has been set by the user.
    boolean colorSet = false;
    //Float values to hold the user inputed color
    float RED;
    float BLUE;
    float GREEN;
    //Variables to store postition of the platform after it has been drawn
    public int RIGHTBOUND;
    public int LEFTBOUND;
    public int UPPERBOUND;
    public int LOWERBOUND;
    //Array to store all bounds
    public float[] boundArray = new float[4];
    
    

    public void setRes(int width, int height) {

        WIDTH = width;
        HEIGHT = height;


    }
    
    private void convertToArray(){
        for(int i =0; i < boundArray.length; i++){
            
            boundArray[i] = 0;
            
        }
        boundArray[0] = RIGHTBOUND;
        boundArray[1] = LEFTBOUND;
        boundArray[2] = UPPERBOUND;
        boundArray[3] = LOWERBOUND;
        
        

    }
    
    public void setColor(float red, float blue, float green){
        
        colorSet = true;
        RED = red;
        BLUE = blue;
        GREEN = green;
        
    }

    //Draw floor
    public void drawPlatform(int rightBound, int leftBound, int upperBound,
            int lowerBound, boolean defaultColor) {

        if(defaultColor){
        //Set colour
        glColor3f(1f, 0.5f, 0.5f);
        } else {
            
            if(colorSet){
                glColor3f(RED, BLUE, GREEN);
            } else {
                System.out.println("COLOR NOT SET ERROR");
                glColor3f(1f, 0.5f, 0.5f);
                //Input error throw code
            }
            
        }
        
        RIGHTBOUND = rightBound;
        LEFTBOUND = leftBound;
        UPPERBOUND = upperBound;
        LOWERBOUND = lowerBound;
       
       

        //Draw
        glBegin(GL_QUADS);       
        glVertex2f(leftBound, lowerBound);
        glVertex2f(rightBound, lowerBound);
        glVertex2f(rightBound, upperBound);
        glVertex2f(leftBound, upperBound);
        glEnd();

        convertToArray();


    }
}
