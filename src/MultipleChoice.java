import java.util.Scanner;

/**
 * MultipleChoice
 */
public class MultipleChoice {

    public static void main(String[] args) {
        String question = "What is the largest planet in our solar system?";
        String choiceOne = "Earth";
        String choiceTwo = "Jupiter";
        String choiceThree = "Saturn";
        String correctAnswer = choiceTwo;
        System.out.println(question);
        System.out.println("Choose one of the following: " + 
                            choiceOne + " , " + choiceTwo + " or " + choiceThree);
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        if (correctAnswer.equalsIgnoreCase(answer)) {
            System.out.println("Congrat! That's the correct answer.");
        }else {
            System.out.println("You are incorrect. The correct answer is " + correctAnswer);
        }
        input.close();
    }
}