package Day1;

import java.util.ArrayList;
import java.util.Random;

//求三个随机数的最大值
public class p28 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            Random random = new Random();
            int height = random.nextInt(50) + 150;
            System.out.println("身高："+height);
            arrayList.add(height);
        }
        System.out.println("-----");
        System.out.println(arrayList);
        System.out.println("-----");

        Integer a = arrayList.get(0);
        Integer b = arrayList.get(1);
        Integer c = arrayList.get(2);

        //调用方法
        Max(a,b,c);
    }
    public static void Max(int a,int b,int c){

        int tep = a>b? a:b;
        int max = c>tep? c:tep;
        System.out.println("最高的是："+max);
    }
}
