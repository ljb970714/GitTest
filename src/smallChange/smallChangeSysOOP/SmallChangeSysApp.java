package smallChange.smallChangeSysOOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysApp {
    boolean flag = true;
    Scanner scanner = new Scanner(System.in);
    String det = "";
    String dec = "-----------------零钱通明细-----------------------";
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dex = "";
    String deb = "";

    public void details() {
        System.out.println(dec);
    }

    public void addMoney() {
        date = new Date();
        System.out.print("零钱通收益入账：");
        money = scanner.nextDouble();
        if (money < 0) {
            System.out.println("零钱通收益入账今额有误!");
            return;
        }
        balance += money;
        dec += "\n收益入账" + "\t" + money + "\t" + sdf.format(date) + "\t" + balance;
        System.out.println(dec);
    }

    public void subtracts() {
        date = new Date();
        System.out.print("消费明细:");
        dex = scanner.next();
        System.out.print("消费金额:");
        money = scanner.nextDouble();
        if (money < 0 || money > balance) {
            System.out.println("消费金额有误！");
            return;
        }
        balance -= money;
        dec += "\n" + dex + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
        System.out.println(dec);
    }

    public void exit() {
        while (true) {
            System.out.println("是否确定退出? y/n");
            System.out.print("请输入:");
            deb = scanner.next();
            if (deb.equals("y") || deb.equals("n")) {
                break;
            }
        }

        if ("y".equals(deb)) {
            System.out.println("退出成功-------------");
            flag = false;
        }
    }

    public void run() {
        do {
            System.out.println("=================OOP零钱通账单==================");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退  出");
            System.out.print("请选择(1-4):");
            det = scanner.next();

            switch (det) {
                case "1":
                    this.details();
                    break;
                case "2":
                    this.addMoney();
                    break;
                case "3":
                    this.subtracts();
                    break;

                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("输入数字有误:");
                    break;
            }
        } while (flag);
    }

}
