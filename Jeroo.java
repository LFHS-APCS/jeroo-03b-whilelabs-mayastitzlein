/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    /**
     * moveUntilNet is an example from class.
     * The Jeroo will move until there is a net in front of it
     * Notice the 3 steps for building a while loop:
     * 1.  Identify what is true when the loop is finished
     * 2.  Use the opposite of step 1's result as the <test> for the loop.
     * 3.  Make progress towards the goal within the loop.
     */
    public void moveUntilNet() 
    {
        while (!isNet(AHEAD)) // Step 2: Iterate the opposite of Step 1
        {
            hop();  // Step 3:  Make progress towards the goal
        }
        // Step 1:  At the end, there should be a net in front
    }
    
    /**
     * Clear all the flowers in front of the Jeroo until it there is water in front.
     * There will be zero or one flower in each space.
     * There is no test program for this method.  We will go over it in class.
     * 
     * Follow the 3 steps for building a while loop:
     * 1.  Identify what is true when the loop is finished
     * 2.  Use the opposite of step 1's result as the <test> for the loop.
     * 3.  Make progress towards the goal within the loop.
     */
    public void clearFlowersToWater() 
    {
        // while(<test>) //Step 2: Use the opposite of Step 1's result as the <test>
        {
            // Step 3:  Make progress towards the goal inside the loop
            
        }
        // Step 1:  At the end of the while loop, what should be true?
        
    }

    /** 
     * Using a while loop, make the Jeroo faces north no matter what.
     * Follow the 3 steps for building a while loop:
     * 1.  Identify what is true when the loop is finished
     * 2.  Use the opposite of step 1's result as the <test> for the loop.
     * 3.  Make progress towards the goal within the loop.
     */
    public void faceNorth() {

    }

    /**
     * The Jeroo should move to (0,0) 
     * no matter where it is or which way it is facing.
     */
    public void goToOrigin() {

    }

    /**
     * The Jeroo should follow the path of flowers until its end.  
     * The next flower will either be on its left, right or ahead only.
     * The Jeroo should stop as soon as there is a net in front of it.       
     */
    public void meander() {

    }

    // Do NOT touch the code below here
    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int y, int x) { super(y, x); }

    public Jeroo(int y, int x, CompassDirection direction) { super (y, x, direction);}

    public Jeroo(int y, int x, int flowers) { super (y, x, flowers);}

    public Jeroo(int y, int x, CompassDirection direction, int flowers) { super(y, x, direction, flowers);}
}

