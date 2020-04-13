import java.util.Scanner;

public class Decision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 10: ");
        int inputtedNum = input.nextInt();

        if (inputtedNum < 5) {
            System.out.println("Enjoy the good luck the friend brings you.");
        } else {
            System.out.println("Your shoe selection will make you very happy today");
        }
        input.close();
    }
}