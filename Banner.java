/*
 * Banner class
 * Assignment 5: Bringing it All Together
 * @author Ryan (K) Emerson
 * @version 21 October 2022
 */
public class Banner {
    
    /* Message to print on Banner */
    private String message;
    int l;
    
    /* Constructor */
    public Banner(String m) {
        this.message = m;
        l = message.length();
    }

    /*
     * Print a decorative banner, resized to fit the message
     */
    public void display() { 

        int firslas = l*2/3;
        int midintro = l/4;
        int mid = l*3/2;

        for(int i=0; i<firslas; i++){
            System.out.print(" ");
        }
        for(int i=0; i<firslas; i++){
            System.out.print("~");
        }
        System.out.println();
        for(int i=0; i<midintro; i++){
            System.out.print(" ");
        }
        for(int i=0; i<mid; i++){
            System.out.print("~");
        }
        System.out.println();
        for(int i=0; i<l/2; i++){
            System.out.print("~");
        }
        System.out.print(this.message);
        for(int i=0; i<l/2; i++){
            System.out.print("~");
        }
        System.out.println();
        for(int i=0; i<midintro; i++){
            System.out.print(" ");
        }
        for(int i=0; i<mid; i++){
            System.out.print("~");
        }
        System.out.println();
        for(int i=0; i<firslas; i++){
            System.out.print(" ");
        }
        for(int i=0; i<firslas; i++){
            System.out.print("~");
        }
        System.out.println();
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("Hello world");
        myBanner.display();
    }
}
