package homeWork.homeWork04;

public class Employees {
    //员工属性:姓名,单日工资,工作天数
    private String name;
    private double salary;
    private int day;
    private double rank;

    public Employees(String name, double salary, int day, double rank) {
        this.name = name;
        this.salary = salary;
        this.day = day;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }

    //(4)员工方法:打印工资
    public void info() {
        System.out.println("员工名字:" + name + " " + "员工工资:" + salary * day * rank);
    }
}
