class Graphy {
    int row;

    Graphy(int row) {
        this.row = row;
    }

    void print(char c) {
        for (int i = 0; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

public class Sy6_3 {
    public static void main(String[] args) {
        Graphy g1 = new Graphy(9);
        g1.print('>');
    }
}
