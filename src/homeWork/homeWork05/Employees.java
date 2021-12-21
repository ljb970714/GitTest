package homeWork.homeWork05;

public class Employees {
    private String Occupation;//职业
    private double salary;//天工资
    private int workDay; //工作天数

    public Employees(String occupation, double salary, int workDay) {
        Occupation = occupation;
        this.salary = salary;
        this.workDay = workDay;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String occupation) {
        Occupation = occupation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    public void info(){
        System.out.println("员工职业:" + Occupation + "\t" + "员工年薪:" + (salary * workDay));
    }
}
