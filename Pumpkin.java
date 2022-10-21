/*
 * Pumpkin class
 * Assignment 5: Bringing it All Together
 * @author Ryan (K) Emerson
 * @version 21 October 2022
 */
public class Pumpkin {
    
    /*
     * Prints ASCII art depicting a jack-o'-lantern to the console
     */
    public void display() {
        System.out.println("             ___");
        System.out.println("        ____|___|____");
        System.out.println("      /               \\");
        System.out.println("     /     /|   |\\     \\ ");
        System.out.println("    |     /o|   |o\\     |");
        System.out.println("    |   _____________   |");
        System.out.println("    |   \\^^^V^^^V^^^/   |");
        System.out.println("     \\   \\_________/   /");
        System.out.println("      \\_______________/  ");
    }
    
    /* main method (for testing) */
    public static void main(String[] args) {
        Pumpkin myPumpkin = new Pumpkin();
        myPumpkin.display();
    }

}
