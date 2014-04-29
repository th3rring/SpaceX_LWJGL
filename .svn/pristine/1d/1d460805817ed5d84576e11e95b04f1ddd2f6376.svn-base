/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacex_lwjgl;

/**
 *
 * @author ThomasHerring
 */
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class Input {

    //Global Variables
    boolean wKey = false;
    boolean aKey = false;
    boolean sKey = false;
    boolean dKey = false;

    public int mouseX() {
        return Mouse.getX();
    }

    public int mouseY() {
        return Mouse.getY();
    }

    public void getKeyboardInput() {

        //If the keyboard senses another event (key pushed or released)
        //Run until all events are scanned
        while (Keyboard.next()) {
            //Get if the event was a push or release
            if (Keyboard.getEventKeyState()) {
                //Get the key and compare it to the desired key
//                if (Keyboard.getEventKey() == Keyboard.KEY_W) {
//                
//                    wKey = true;                    
//                    
//                }               
                switch (Keyboard.getEventKey()) {

                    case Keyboard.KEY_W:
                        wKey = true;
                        break;
                    case Keyboard.KEY_A:
                        aKey = true;
                        break;
                    case Keyboard.KEY_S:
                        sKey = true;
                        break;
                    case Keyboard.KEY_D:
                        dKey = true;
                        break;



                }

            } else {


                switch (Keyboard.getEventKey()) {

                    case Keyboard.KEY_W:
                        wKey = false;
                        break;
                    case Keyboard.KEY_A:
                        aKey = false;
                        break;
                    case Keyboard.KEY_S:
                        sKey = false;
                        break;
                    case Keyboard.KEY_D:
                        dKey = false;
                        break;



                }





            }




        }



    }
}
