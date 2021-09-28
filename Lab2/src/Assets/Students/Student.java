package Assets.Students;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getAverageMark() {
        return this.averageMark;
    }

    public double getScholarship() {
        if (this.averageMark == 5.0) {
            return 100.0;
        } else {
            return 80.0;
        }
    }
}
