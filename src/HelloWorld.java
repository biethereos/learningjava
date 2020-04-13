import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hellow World, I am Biethereos Nguyen");
        int studentAge = 15;
        double studentGPA = 3.45;
        boolean hasPerfectAttendance = true;
        String studentFirstName = "Biethereos";
        String studentLastName = "Nguyen";
        char studentFistInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);
        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFistInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);
        System.out.println(studentFirstName);
        System.out.println(studentLastName);
        System.out.println(studentFirstName + " " + studentLastName + 
        " has a GPA of " + studentGPA);
        System.out.println("What do you want to update it to?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName + 
        " has a GPA of " + studentGPA);
        input.close();
    }

}