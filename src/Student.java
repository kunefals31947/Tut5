import java.util.ArrayList;
import java.util.Date;
import java.util.List;
class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String indexNumber;
    private Date dateOfBirth;
    private String status;
    private int currentSemester;

    public Student(String firstName, String lastName, String email, String address, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        // Generate unique index number automatically
        this.indexNumber = generateIndexNumber();
        this.status = "Candidate";
        this.currentSemester = 1;
    }

    private String generateIndexNumber() {
        // Logic to generate unique index number
        return "s" + StudentIndexGenerator.getNextIndex();
    }

    public void enrollStudent(StudyProgramme studyProgramme) {
        // Logic to enroll student in a study program
    }

    public void addGrade(int grade, String course) {
        // Logic to add a grade for a course
    }

    public void promoteToNextSemester() {
        // Logic to promote student to the next semester
    }
}
