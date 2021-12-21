package homeWork.homeWork05;

public class Teacher extends Employees {
    private double classPlay;
    public Teacher(String occupation, double salary, int workDay) {
        super(occupation, salary, workDay);
    }

    public double getClassPlay() {
        return classPlay;
    }

    public void setClassPlay(double classPlay) {
        this.classPlay = classPlay;
    }

    @Override
    public void info() {
        System.out.println("员工职称:" + getOccupation() + "\t" + "员工年薪:" + (getSalary() * getWorkDay() + classPlay * getWorkDay()));
    }
}
