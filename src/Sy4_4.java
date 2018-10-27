import java.util.Scanner;

public class Sy4_4 {

    public static void main(String[] args) {
        class ScoreCalc{
            float sum(float a,float b, float c){
                return a+b+c;
            }
            float average(float a,float b, float c){
                return (a+b+c)/3;
            }
        }
        int s1,s2,s3;
        Scanner in = new Scanner(System.in);
        System.out.println("输入java成绩：");
        s1=in.nextInt();
        System.out.println("输入C#成绩：");
        s2=in.nextInt();
        System.out.println("输入DB成绩：");
        s3=in.nextInt();
        ScoreCalc sc=new ScoreCalc();
        System.out.println("总成绩是："+sc.sum(s1,s2,s3));
        System.out.println("平均分是："+sc.average(s1,s2,s3));
    }
}
