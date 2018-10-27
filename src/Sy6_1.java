public class Sy6_1 {
    public static void main(String[] args) {
        System.out.println("创建长方体对象调用构造方法，初始化长宽高...");
        Cuboid c1 = new Cuboid(6, 4, 5);
        //计算体积
        System.out.println("长宽高为:"+c1.l+","+c1.w+","+c1.h);
        System.out.println("体积:"+c1.volume());
    }
}
class Cuboid {
    //长宽高变量
    int l, w, h;
    //构造方法，初始化长宽高
    Cuboid(int a, int b, int c) {
        l = a;
        w = b;
        h = c;
    }
    //体积计算
    int volume() {
        return l*w*h;
    }
}