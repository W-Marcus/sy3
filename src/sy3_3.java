import java.util.Scanner;

public class sy3_3 {
    public static void main(String[] args) {
        int i, j;
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("输入0-999999的一个数");
        sb.append(in.next());
        System.out.println("这是一个" + sb.length() + "位数");
        if (sb.length() % 2 != 0) {
            //把中间数两边的数切开
            i = (sb.length() / 2);
            j = (sb.length() / 2 + 1);
        }else{
            //.substring(start,end) 顾头不顾尾
            i = (sb.length() / 2);
            j = (sb.length() / 2);
        }
        String b = sb.substring(j, sb.length());
        StringBuilder sb1 = new StringBuilder();
        sb1.append(b);
        //反转右边的字段
        sb1 = sb1.reverse();
        //判断两边是否对称
        if (sb.substring(0, i).equals(sb1.substring(0)))
            System.out.println("这是个回文数");
        else
            System.out.println("这不是个回文数");
    }
}

