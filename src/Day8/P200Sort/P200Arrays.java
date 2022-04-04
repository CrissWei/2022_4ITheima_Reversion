package Day8.P200Sort;


import java.util.Arrays;

public class P200Arrays {
    public static void main(String[] args) {
        int[] arr={5,2,3,8,4,6,4,154,35,32};

        System.out.println("排序前："+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后："+Arrays.toString(arr));

        int i = Arrays.binarySearch(arr, 4);
        System.out.println("首次出现key的索引号："+i);


        //没看太明白compare方法，底层源码好像是比较return a.length - b.length;
        int[] arr2={5,23,54,64,5,451};
        int co = Arrays.compare(arr, arr2);
        int co2 = Arrays.compare(arr2,arr);
        System.out.println(co);
        System.out.println(co2);


    }
}
