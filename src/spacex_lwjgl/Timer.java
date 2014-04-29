/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacex_lwjgl;

/**
 *
 * @author ThomasHerring
 */
import org.lwjgl.Sys;

public class Timer {

    //Global Variables
    long lastFrame;
    long totalTime;
    long initTime;

    public int getDelta() {
        long time = getTime();
        int delta = (int) (time - lastFrame);
        lastFrame = time;

        return delta;
    }
    
    public void initTime(){
        
        initTime = (Sys.getTime() * 1000) / Sys.getTimerResolution();
        
    }

    public long getTime() {

        return (Sys.getTime() * 1000) / Sys.getTimerResolution() - initTime;

    }
}
