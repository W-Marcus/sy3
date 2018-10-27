import java.util.Scanner;

public class Ｓｙ４＿１ {
    static class YouRen {
        String name;
        int age;
        int price=20;

        public void out() {
            if (age < 14)
                price = 0;
            System.out.println(name + "的年龄为：" + age + ",门票价格为：" + price);
        }
    }
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            YouRen z3=new YouRen();
            System.out.println("请输入姓名：");
            z3.name=in.next();
            System.out.println("请输入年龄：");
            z3.age=in.nextInt();
            z3.out();
            YouRen xl=new YouRen();
            System.out.println("请输入姓名：");
            xl.name=in.next();
            System.out.println("请输入年龄：");
            xl.age=in.nextInt();
            xl.out();
            in.close();
        }

    }


