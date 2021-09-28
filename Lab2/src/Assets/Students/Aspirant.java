package Assets.Students;

public class Aspirant extends Student {
    private String titleOfScientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String titleOfScientificWork) {
        super(firstName, lastName, group, averageMark);
        this.titleOfScientificWork = titleOfScientificWork;
    }

    @Override
    public double getScholarship() {
        if (this.getAverageMark() == 5.0) {
            return 200.0;
        } else {
            return 180.0;
        }
    }
}
