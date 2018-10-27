import java.util.Scanner;

public class sy3_1 {
    public static void main(String[] args) {
        int i = 0;
        class User {
            String name = "ww";
            String pwd = "w40838";
        }
        User ww = new User();
        Scanner in = new Scanner(System.in);
        while (i < 3) {
            System.out.println("请输入用户名：");
            String username = in.next();
            System.out.println("请输入密码：");
            String password = in.next();
            if (!(username.equals(ww.name) & password.equals(ww.pwd))) {
                System.out.println("输入有误，还有" + (3 - i - 1) + "次机会。");
                i++;
            } else {
                System.out.println("登陆成功，再见！");
                break;
            }
        }
        if (i == 3)
            System.out.println("输入异常，你已被禁止登陆");
    }
}
