/*
 * Shirt class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Shirt {

    /*
     * TODO: Modify this method to print ASCII Art Shirt
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
