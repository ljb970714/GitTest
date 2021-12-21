package homeWork.homeWork05;

public class Scientist extends Employees {
    private double bonus;
    public Scientist(String occupation, double salary, int workDay) {
        super(occupation, salary, workDay);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void info() {
        System.out.println("员工职称:" + getOccupation() + "\t" + "员工年薪：" + (getSalary() * getWorkDay() + bonus));
    }
}
