package homeWork.homeWork04;

public class Employees01 extends Employees {
    private double money;
    public Employees01(String name, double salary, int day, double rank) {
        super(name, salary, day, rank);
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public void info() {
        System.out.print("经理" + "\t" + (getDay() * getSalary() * getRank() + money));
    }
}
