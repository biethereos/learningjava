import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while (isOnRepeat) {
            System.out.println("Play current song.");
            System.out.println("Would you like to take" + 
            " this song off of repeat? If so, answer yes.");
            String userInput = input.next();
            if (userInput.equals("yes")) {
                isOnRepeat = false;
            }
        }
        System.out.println("Play next song");
        input.close();
    }
}