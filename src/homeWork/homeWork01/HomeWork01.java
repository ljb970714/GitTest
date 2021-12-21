package homeWork.homeWork01;

import java.util.Arrays;

public class HomeWork01 {
    public static void main(String[] args) {
        Sort[] sort = new Sort[3];
        sort[0] = new Sort("刘俊彬", 23, "写代码");
        sort[1] = new Sort("刘俊彬", 22, "演员");
        sort[2] = new Sort("薛之谦", 45, "歌手");
        Sort temp = null;
        for (int i = 0; i < sort.length - 1; i++) {
            for (int j = 0; j < sort.length - 1 - i; j++) {
                if (sort[j].getAge() < sort[j + 1].getAge()) {
                    temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                }
            }

        }
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i]);
        }

    }
}

class Sort {
    private String name;
    private int age;
    private String job;

    public Sort(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Sort{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
