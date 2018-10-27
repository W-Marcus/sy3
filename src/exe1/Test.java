package exe1;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by Marcus_w on 2018/10/23.
 */
public class Test {
    public static void main(String[] args) {
        String petName;
        String petVariety;
        int petIntimacy=0;
        int petHealth;
        int petChoice;
        int petSex;
        Scanner in = new Scanner(System.in);
        System.out.println("欢迎您来到宠物店 :(");
        System.out.println("请输入要领养的宠物名字:");
        petName = in.next();
        System.out.println("请选择要领养的宠物类型(1.狗/2.企鹅)");
        petChoice = in.nextInt();
        if (petChoice == 1){
            System.out.println("请选择狗的品种:（1.聪明的拉布拉多犬 2.酷酷的雪瑞纳）");
            int dogChoice = in.nextInt();
            if (dogChoice==1)
                petVariety = "聪明的拉布拉多犬";
            else
                petVariety = "酷酷的雪瑞纳";
            System.out.println("请输入狗狗的健康值:");
            petHealth = in.nextInt();
            if (petHealth<0||petHealth>100)
                System.out.println("输入有误，按照默认60");
            else
                petHealth = 60;
            Dog dog = new Dog(petName,petHealth,petIntimacy,petVariety);
            System.out.println("宠物的自白:");
            System.out.print("我的名字叫");
            System.out.print(dog.name);
            System.out.print("，我的健康值是");
            System.out.println(dog.health);
            System.out.print("我和主人的亲密度是");
            System.out.print(dog.intimacy);
            System.out.print(",我的类型是");
            System.out.println(dog.variety);

        }else if (petChoice==2){
            Penguin penguin = new Penguin(petName,100,20,"雌");

            System.out.println("请选择企鹅的性别(1.Q仔/2.Q妹)");
            petSex = in.nextInt();
            if (petSex==1){
                penguin.SEX_MALE = "雄";
            }else if (petSex == 2)
                penguin.SEX_FEMALE="雌";
            System.out.println("宠物的自白:");
            System.out.print("我的名字叫");
            System.out.print(penguin.name);
            System.out.print("，我的健康值是");
            System.out.println(penguin.health);
            System.out.print("我和主人的亲密度是");
            System.out.print(penguin.intimacy);
            System.out.print("，我的性别是");
            System.out.println(penguin.sex);

        }


    }
}
