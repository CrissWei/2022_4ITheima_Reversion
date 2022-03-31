package Day3;

import java.util.Arrays;
import java.util.Scanner;

/*
* 需求:定义一个方法，实现字符串反转。
* 键盘录入一个字符串，调用该方法后，在控制台输出结果
* 例如，键盘录入abc，输出结果cba

 * */
public class p125Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        String line = scanner.next();

        //把String变成数组，然后倒序打印
        char[] chars = line.toCharArray();
        System.out.println("原本："+(Arrays.toString(chars)));
        System.out.println("==");

        //冒泡排序
        for (int start = 0, end = chars.length - 1; start <= end; start++, end--) {
            int temp = chars[start];
            chars[start] = chars[end];
            chars[end] = (char) temp;
        }
        System.out.println("反转："+(Arrays.toString(chars)));

        System.out.println("==");

        //sort工具排序
        Arrays.sort(chars);
        //System.out.println(chars);
        System.out.println("正序："+Arrays.toString(chars));

        System.out.println("===");

        //冒泡排序
        for (int start = 0, end = chars.length - 1; start <= end; start++, end--) {
            int temp = chars[start];
            chars[start] = chars[end];
            chars[end] = (char) temp;
        }
        //System.out.println(chars);
        System.out.println("倒序:"+ Arrays.toString(chars));


        //调用方法
        System.out.println("==");
        Reverse(line);
        System.out.println("==");
        StringBuilderReverse(line);
    }


    public static void Reverse(String ss){
        for (int i = ss.length()-1; i >= 0; i--) {
            char c = ss.charAt(i);
            System.out.println("老师反转方法："+c);
        }
    }

    public static void StringBuilderReverse(String line){
        StringBuilder re = new StringBuilder().append(line).reverse();
        //把StringBuilder 转换为 String
        String ss = re.toString();
        System.out.println("StringBuilder的reverse方法："+ss);

    }
}
