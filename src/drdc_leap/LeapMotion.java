package drdc_leap;

import java.io.IOException;

import com.leapmotion.leap.*;

public class LeapMotion {

    public static void main(String[] args) {
    	
    	// Connecting to the Leap service/Daemon.
    	Controller cont = new Controller();
    	
    	// Listener for the Swipe gesture
    	SwipeListener swipeListener = new SwipeListener();
    	
    	cont.addListener(swipeListener);

        // Keep this process running until Enter is pressed
        System.out.println("Press Enter to quit...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        cont.removeListener(swipeListener);
    }
       
}
