/*
 * Pants class 
 * Assignment 5: Bringing it All Together
 * @author Ryan (K) Emerson
 * @version 21 October 2022
 */
public class Pants {

    /*
     * Print ASCII Art Pants
     */
    public void display() {
        System.out.println("          _________");
        System.out.println("         |    `    |");
        System.out.println("         |         |");
        System.out.println("         |    |    |");
        System.out.println("         |    |    |");
        System.out.println("         |    |    |");
        System.out.println("         |    |    |");
        System.out.println("         |____|____|");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Pants myPants = new Pants();
        myPants.display();
    }
}
