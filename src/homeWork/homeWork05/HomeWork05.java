package homeWork.homeWork05;

public class HomeWork05 {
    public static void main(String[] args) {
        //设计父类--员工类, 子类:工人类(Worker)  农名类(Peasant) 教师类(Teacher) 科学家类(Scientist) 服务生类(Waiter)
        //其中工人,农名,服务生只有基本工资
        //教师除基本工资外还有课酬(元/天)
        //科学家除基本工资外,还有年终奖
        //编写一个测试类,将各种员工的全年工资打印出来
        Teacher teacher = new Teacher("教师",170,280);
        teacher.setClassPlay(35);
        teacher.info();

        Scientist scientist = new Scientist("科学家",230,290);
        scientist.setBonus(100000);
        scientist.info();


    }
}
