// import math to use random tool
import java.lang.Math;

public class Magic8 {

    // declaring the random instance, use static to "save" the value when using in main
    static int rand= (int)(Math.random() * 8);

    public static void main(String[] args) {

        // run the code in main and print out the randomly decided fortune-telling
        switch(rand) {

            case 0:
                System.out.println("It is certain.");
                break;
            case 1:
                System.out.println("As I see it, yes.");
                break;
            case 2:
                System.out.println("Reply hazy, try again");
                break;
            case 3:
                System.out.println("Don't count on it.");
                break;
            case 4:
                System.out.println("It is decidedly so.");
                break;
            case 5:
                System.out.println("Most likely.");
                break;
            case 6:
                System.out.println("Better not tell you now.");
                break;
            case 7:
                System.out.println("My reply is no.");
                break;
            default:
                System.out.println("try again");
                break;
        }
    }
}