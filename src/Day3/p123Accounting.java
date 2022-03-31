package Day3;

import java.util.Arrays;
import java.util.Scanner;

/*
* 案例:统计字符次数
需求:键盘录入一个字符串，统计该字符串中出现的次数：
    * 大写字母字符，
    * 小写字母字符，
    * 数字字符
    * (不考虑其他字符)

* */
public class p123Accounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        String line = scanner.next();

        char[] chars = line.toCharArray();
        String s = Arrays.toString(chars);
        System.out.println(s);

        int big=0;
        int small=0;
        int numbers=0;
        int others=0;

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            //System.out.println(c);
            if ('a'<=c && c<='z' ){
                small++;
            }else if ('A'<=c && c<='Z'){
                big++;
            }else if ('0'<=c && c<='9'){
                numbers++;
            }else {
                others++;
            }
        }
        System.out.println("大写："+big);
        System.out.println("小写："+small);
        System.out.println("数字："+numbers);
        System.out.println("其他："+others);
    }
}
