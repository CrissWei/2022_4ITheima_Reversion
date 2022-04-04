package Day8.P203Integer;

import java.util.ArrayList;

/*
* Integer 和 String相互转化:
*
* Integer-->String :方法是String.valueOf(int num);返回得到是String
* String --->int: Integer.parseInt(String str);返回得到的是一个int
* */
public class IntToString {
    public static void main(String[] args) {
        Integer a = 10;
        String s = "200";


        //【方法1：】把int --->String
        // 以后主要用这个valueOf(int num)方法
        String s2 = String.valueOf(a);
        System.out.println(s2);

        //【方法2：】Integer-->String
        String s1 = Integer.toString(a);
        System.out.println(s1);
        System.out.println("===");
        System.out.println(Integer.toString(a));

        //【方法3：】把int --->String
        String str = a+"";
        System.out.println(str);

        ////////////////////////////////

        //String--->Integer / int(可以省略这个Integer-->int)
        Integer num = Integer.valueOf(s);
        System.out.println(num);

        //【主要用这个parseInt(String str)方法】String --->int
        int num2 = Integer.parseInt(s1);
        System.out.println(num2);

    }
}
