package Day2;

import java.util.Arrays;

/*
* 需求:
* 已知一个数组arr = {19,28,37,46,50};用程序实现把数组中的元素值交换，
* 交换后的数组arr = {50,46,37,28,19};并在控制台输出交换后的数组元素。

        arr[0]=arr[arr.length-1];
        arr[1]=arr[arr.length-2];
        arr[2]=arr[arr.length-3];
        arr[3]=arr[arr.length-4];
* */
public class p97Reverse {
    public static void main(String[] args) {

        int[] arr = new int[]{19, 28, 37, 46, 50};


        System.out.println("反转前:"+Arrays.toString(arr));
        System.out.println("===");
        ReverseTeacher(arr);
        System.out.println("反转后:"+Arrays.toString(arr));
    }

    private static void ReverseMe() {
        int[]arr = {19,28,37,46,50};
        System.out.println(Arrays.toString(arr));
        System.out.println("===");

        int temp;
        for (int i = 0,j= arr.length-1; i < arr.length; i++,j--) {
            if (arr[i]<=arr[j]){

                temp=arr[i];
                arr[i]=arr[j];//把最大的给了最小的
                arr[j]=temp;

                System.out.println("遍历反转："+arr[i]);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void ReverseTeacher(int[] arr) {
        int temp;
        for (int i = 0,j= arr.length-1;i<=j; i++,j--) {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        //System.out.println("反转后:"+Arrays.toString(arr));





    }
}
