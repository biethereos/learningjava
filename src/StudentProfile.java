
public class StudentProfile {
    private String firstName;
    private String lastName;
    private String declareMajor;
    private double gpa;
    private int expectedYearToGraduate;

    public StudentProfile(String firstName, String lastName, String declareMajor, double gpa,
            int expectedYearToGraduate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.declareMajor = declareMajor;
        this.gpa = gpa;
        this.expectedYearToGraduate = expectedYearToGraduate;
    }

    public void incrementExpectedGraduationYear(){
        this.expectedYearToGraduate++;
    }
    
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the declareMajor
     */
    public String getDeclareMajor() {
        return declareMajor;
    }

    /**
     * @return the gpa
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * @return the expectedYearToGraduate
     */
    public int getExpectedYearToGraduate() {
        return expectedYearToGraduate;
    }
}