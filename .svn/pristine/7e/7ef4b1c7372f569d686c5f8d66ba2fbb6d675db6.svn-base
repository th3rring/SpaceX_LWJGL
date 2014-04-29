/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacex_lwjgl;

/**
 *
 * @author ThomasHerring
 */

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.GL11;
import java.awt.Font;

import org.newdawn.slick.TrueTypeFont;


public class Graphics {
    
    //Global Variables
   public int WIDTH;
   public int HEIGHT;
   TrueTypeFont font;
  
    
    
    public void setRes(int width, int height){
        WIDTH = width;
        HEIGHT = height;                  
}
    
    public void initDisplay(){
    
        try{
            
            Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
            Display.create();
            
        } catch (LWJGLException e){
            e.printStackTrace();
            System.exit(0);
        } 
}
    
    public void initGl(){
        
        //Init shaders
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glShadeModel(GL11.GL_SMOOTH);
        GL11.glDisable(GL11.GL_DEPTH_TEST);
        GL11.glDisable(GL11.GL_LIGHTING);

        //Clear color and depth
        GL11.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GL11.glClearDepth(1);

        //Enable blending
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

        //Set viewport
        GL11.glViewport(0, 0, WIDTH, HEIGHT);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);


        //Set matrix to project
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glLoadIdentity();
        //Init orthographic projection
        GL11.glOrtho(0, WIDTH, 0, HEIGHT, 1, -1);
        //Switch to viewing
        GL11.glMatrixMode(GL11.GL_MODELVIEW);        
        
        
        
    }
    

    
    public void initFont(){
        
        //Load from file to allow rendering with openGL
        Font tempFont = new Font("Times New Roman", Font.PLAIN, 18);
        
        font = new TrueTypeFont(tempFont, false);
    
    
    
    
}
    
    
    
    
    
}
