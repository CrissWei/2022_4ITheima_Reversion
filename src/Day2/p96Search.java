package Day2;

import java.util.Scanner;

/*
* 需求:已知一个数组arr = {19,28,37,46,50};
* 键盘录入一个数据，查找该数据在数组中的索引，
* 并在控制台输出找到的索引值。

* */
public class p96Search {
    public static void main(String[] args) {
        int[] arr ={19,28,37,46,50};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字:");

        int num = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                System.out.println(num+"索引是："+i);
                break;
            }
        }

        //调用方法
        method_Teacher();
        System.out.println("====");
        System.out.println("索引是"+ Search(arr,num));
    }

    public static void method_Teacher(){
        int[] arr ={19,28,37,46,50};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字:");

        int num = scanner.nextInt();

        int index = -1;//-1代表不存在索引
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                index=i;
            }
        }
        System.out.println(num+"的索引是："+index);

    }


    public static int Search(int[] arr,int num){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字:");

         num = sc.nextInt();

        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                index=i;
            }
        }
        //System.out.println(num+"的索引是"+index);


        return index;
    }
}
