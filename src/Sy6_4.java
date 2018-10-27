import java.util.Scanner;

public class Sy6_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Account account = new Account();
        int choice = 0;
        while (choice != 4) {
            System.out.println("1：存款");
            System.out.println("2：取款");
            System.out.println("3：查询余额");
            System.out.println("4：退出");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("存款:");
                    account.deposit(in.nextFloat());
                    break;
                case 2:
                    System.out.println("取款:");
                    account.withdraw(in.nextFloat());
                    break;
                case 3:
                    System.out.println("账户余额:");
                    account.showBalance();
                    break;
            }
            if (choice == 4) {
                System.out.println("使用结束");
                break;
            }
        }
        in.close();
    }
}

class Account {
    Float balance = 0f;

    void showBalance() {
        System.out.println(balance);
    }

    //存款
    void deposit(float number) {
        balance += number;
        System.out.println("存款成功，余额为" + balance + "元");
    }

    //取款
    void withdraw(float number) {
        if (number < 0)
            System.out.println("数额不合法");
        else if (number <= balance) {
            balance -= number;
            System.out.println("已取出" + number + "元，" + "余额为：" + balance);
        } else
            System.out.println("余额不足，取款失败");

    }
}