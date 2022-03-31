package Day2;

import java.util.Arrays;
import java.util.Scanner;

/*
* 需求:
* 在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
* 选手的最后得分为:去掉一个最高分和一个最低分后的4个评委平均值(不考虑小数部分)。

* */
public class p98Scores {
    public static void main(String[] args) {
        int[] score = new int[6];

        int number;
        int sum=0;//总分
        Scanner scanner = new Scanner(System.in);
        System.out.println(score.length);

        for (int i = 0; i <= score.length-1; i++) {
            System.out.println("请输入第：" + (i+1) + "个评为的分数");
            number = scanner.nextInt();
            score[i] = number;

            sum+=score[i];//sum=sum+score[i];

        }
        int a =getMin(score);
        int b =getMax(score);

        System.out.println("评委分数依次为：" + Arrays.toString(score));
        System.out.println("总和为："+sum);
        System.out.println("最大值为："+b);
        System.out.println("最小值为："+a);

        //System.out.println("大+小a+b："+a+b);不行啊，加括号啊
        System.out.println("大+小a+b："+(a+b));

        double sumLeft=sum-a-b;////
        System.out.println("余下总和为："+sumLeft);
        System.out.println("平均值为："+sumLeft/(score.length-2));
    }

    public static int getMax(int[] score) {
        int max = score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }
        return max;
    }

    public static int getMin(int[] score) {
        int min =score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i] < min) {
                min = score[i];
            }
        }
        return min;
    }
}

