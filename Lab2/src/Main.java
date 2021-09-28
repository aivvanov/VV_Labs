import Operation.ExecuteAnimals;
import Operation.ExecuteStudents;

public class Main {
    public static void main(String[] args) {
        new ExecuteAnimals().PerformProcess();
        System.out.println("\n-------------------------------------");
        new ExecuteStudents().PerformProcess();
    }
}