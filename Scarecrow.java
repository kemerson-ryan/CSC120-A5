/*
 * Scarecrow class 
 * Assignment 5: Bringing it All Together
 * @author Ryan (K) Emerson
 * @version 21 October 2022
 */

class Scarecrow {

    /* Parts of the Scarecrow
     */
    private Pumpkin head;
    private Shirt body;
    private Pants legs;
    // private Hat hat;
    private Boot leftFoot;
    private Boot rightFoot;
    private Banner sign;
    //public String message;

    /* Constructor
     * Initializes parts
     */
    public Scarecrow(Banner banner, Pumpkin h, Shirt b, Pants l, Boot lf, Boot rf) {
        sign = banner;
        head = h;
        body = b;
        legs = l;
        leftFoot = lf;
        rightFoot = rf;
    }

    /* Displays the Scarecrow 
    */
    public void display() {
        sign.display();
        head.display();
        body.display();
        legs.display();
        leftFoot.display();
        rightFoot.display();
    }

    /* Main method (for testing) */
     public static void main(String[] args) {

        // If a message was passed in on the command line, extract and store it
        // Passes this value along to your Banner constructor. If args empty, display default message
        String message = "happy fall everybody!";
        if (args.length > 0) {
            message = args[0];
        }
    
        Scarecrow myScarecrow = new Scarecrow(new Banner(message), new Pumpkin(), new Shirt(), new Pants(), new Boot("left"), new Boot("right"));

        myScarecrow.display();
    }
    

}
