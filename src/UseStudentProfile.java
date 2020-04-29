
public class UseStudentProfile {
    public static void main(String[] args) {
        StudentProfile student1 = new StudentProfile("Sally", "Salmon", "Film", 3.75, 2022);
        StudentProfile student2 = new StudentProfile("Max", "Tiffen", "Computer Science", 3.45, 2021);

        student2.incrementExpectedGraduationYear();
        System.out.println(student1.getExpectedYearToGraduate());

    }

}