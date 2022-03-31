package Day2;

import java.lang.reflect.Array;

/*
* 案例:不死神兔
需求:
有一对兔子，从出生后第3个月起每个月都生一对兔子，
小兔子长到第3个月后每个月又生一对兔子，
假如兔子都不死，问第20个月的兔子对数为多少?
*
* 思路：
* 月数   兔子数
* 1         1
* 2         1
* 3         2 第三个月生了一对小兔子a
* 4         3 老兔子又生了一对b
* 5         4+1 小兔子a在第3个月又生了一对兔子c
* 6         8  b生d
* 7         13  c又生了e【我觉得应该是12才对呀】
* 8

* */
public class p92TuZi {
    public static void main(String[] args) {

    int[] month=new int[20];
    month[0]=1;
    month[1]=1;
    method1(month);

    }

    public static void method1(int[] month ){
        for (int i = 2; i < month.length; i++) {
            month[i] = month[i-1]+month[i-2];
        }
        System.out.println("第20个月兔子对数："+month[19]);
    }
}
