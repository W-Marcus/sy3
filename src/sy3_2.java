import java.util.Scanner;

public class sy3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (1 == 1) {
            System.out.println("1: 输出直角三角形");
            System.out.println("2: 输出等腰三角形");
            System.out.println("3: 输出菱形");
            int s = in.nextInt();
            switch (s) {
                case 1:
                    System.out.println("输入直角三角形的行数");
                    RTrangle(in.nextInt());
                    break;
                case 2:
                    System.out.println("输入等腰三角形的行数");
                    Trangle(in.nextInt());
                    break;
                case 3:
                    System.out.println("输入菱形大小:");
                    Diamond(in.nextInt());
                    break;
            }
            if (s == 4)
                break;
        }
        in.close();
    }

    static void RTrangle(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 1; j <= 2 * i + 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    static void Trangle(int high) {
        for (int i = 1; i <= high; i++) {
            for (int j = 1; j <= 2 * high - 1; j++) {
                if ((i >= -j + high + 1) && (i >= j - high + 1))
                    System.out.print("*");
                else System.out.print(' ');
            }
            System.out.println("");
        }

    }

    static void Diamond(int size) {
        if (size % 2 == 0) {
            size++; // 计算菱形大小
        }
        int i;
        int j;
        for (i = 0; i < size / 2 + 1; i++) {
            for (j = 0; j < size / 2 - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < 2 * (i + 1) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 0; i < size / 2; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < 2 * (size / 2 - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
