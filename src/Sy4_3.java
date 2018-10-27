import java.util.Scanner;

public class Sy4_3 {
    static class Human{
        void speak(){
            System.out.println("我是好人");
        }
        int jisuan(int s){
            int sum = 0;
            for (int i=0;i<s;++i){
                sum+=(i+1);
            }
            return sum;
        }
        void add(int a, int b){
            System.out.println("两数之和："+ (a+b) );
        }
    }

    public static void main(String[] args) {
        Human h1=new Human();
        h1.speak();
        Scanner in = new Scanner(System.in);
        System.out.println("输入一个数n，将计算1+2+3+...+n");
        System.out.println("结果："+h1.jisuan(in.nextInt()));
        System.out.println("输入两个数，将求和,用回车隔开");
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        h1.add(in1.nextInt(),in2.nextInt());
        in.close();
        in1.close();
        in2.close();
    }
}
