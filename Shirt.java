/*
 * Shirt class 
 * Assignment 5: Bringing it All Together
 * @author Ryan (K) Emerson
 * @version 21 October 2022
 */
public class Shirt {

    /*
     * Print ASCII Art Shirt
     */
    public void display() {
        System.out.println("          __      __");
        System.out.println("        /|  \\___/  |\\");
        System.out.println("       / |         | \\");
        System.out.println("      /__|         |__\\");
        System.out.println("         |         |");
        System.out.println("         |         |");
        System.out.println("         |_________|");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        myShirt.display();
    }
}
