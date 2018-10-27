import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sy6_2 {
    public static void main(String[] args) {
        //flag用于判断是否继续输入
        String flag = "y";
        Scanner in = new Scanner(System.in);
        //创建客户对象
        Customer cstm = new Customer();
        //初始化客户名单列表
        cstm.nameList = new ArrayList<>();
        while ("y".equals(flag)) {
            System.out.println("请输入客户名称：");
            cstm.addMember(in.next());
            System.out.println("是否继续输入？y/n");
            flag = in.next();
        }
        cstm.display();
        System.out.println("查找你要寻找的客户名:");
        cstm.query(in.next());
        in.close();
    }
}

class Customer {
    //声明客户名单列表
    List<String> nameList;

    void addMember(String name) {
        nameList.add(name);
    }

    void display() {
        System.out.println("********客户名单********");
//        for (int i=0;i<nameList.size();++i){
//            System.out.print(nameList.get(i)+"\t");
        for (String name : nameList
                ) {
            System.out.println(name);
        }
        System.out.println();
    }

    void query(String name) {
        System.out.println("********查找结果********");
        if (nameList.contains(name))
            System.out.println("找到了！");
        else
            System.out.println("不存在");
    }
}
