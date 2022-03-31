package Day3;

import java.util.Arrays;
import java.util.Scanner;
/*
* 需求:键盘录入一个字符串，使用程序实现在控制台遍历该字符串
    思路:
        键盘录入一个字符串,用Scanner 实现
        遍历字符串，首先要能够获取到字符串中的每一个字符
        public char charAt(int index):返回指定索引处的char值，字符串的索引也是从0开始的

* */
public class p122String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        String str = scanner.next();

        //方法一：把很长的String变成单个的char
        char[] chars = str.toCharArray();
        System.out.println("fori:"+ Arrays.toString(chars));

        //方法二：
        for (char aChar : chars) {
            System.out.println("增强for:"+aChar);
        }

        //方法三：
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
