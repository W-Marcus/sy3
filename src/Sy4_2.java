import java.util.Scanner;

public class Sy4_2 {


    public static void main(String[] args) {
        //定义用户类
        class Customer{
            int credit;
            String cardType;
            void out(){
                System.out.println("积分："+credit+",卡类型："+cardType);
                if ((cardType.equals("金卡")&credit>1000)||(cardType.equals("普通")&credit>5000)){
                    credit+=500;
                    System.out.println("积分回馈500分！");
                }else
                    System.out.println("未达反馈标准");
            }
        }
        //创建客户对象
        Customer c1=new Customer();
        Scanner in = new Scanner(System.in);
        System.out.println("积分为");
        c1.credit=in.nextInt();
        System.out.println("卡类型为");
        c1.cardType=in.next();
        c1.out();
        in.close();
    }
}