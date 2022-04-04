package Day8.P204StringBuilder;

import java.util.Arrays;

/*
* 案例:字符串中数据排序
需求:有一个字符串:“91 25 74 63 85 90”，请写程序实现最终输出结果是:"25 63 74 85 90 91"
思路:
    ①定义一个字符串
    ②把字符串中的数字数据存储到一一个int类型的数组中
        ●得到字符串中每一个数字数据?
            public String[] Split(String regex)
        ●定义一个int数组，把String数组中的每一个元素存储到 int数组中
            public  static int parseInt(String s)
    ③对int数组进行排序 Arrays.sort();
    ④把排序后的int数组中的元素进行拼接得到一个字符串，这里拼接采用StringBuilder来实现
    ⑤输出结果

* */
public class Split {
    public static void main(String[] args) {
        String str="91 25 74 63 85 90";

        //用空格来分隔，变成String数组
        String[] ss = str.split(" ");


        int[] arr = new int[ss.length];
       /* //遍历
        for (String s1 : s) {
            System.out.println(s1);
        }
        //排序
        Arrays.sort(s);
        //遍历
        System.out.println("==");
        for (String s1 : s) {
            System.out.println(s1);
        }*/

        //把String[]中的每一个元素存储到 int[]
        for (int i = 0; i < arr.length; i++) {
            //把String --->int类型
            arr[i] = Integer.parseInt(ss[i]);
            System.out.println(arr[i]);
        }
        //排序
        Arrays.sort(arr);
        System.out.println("排序后：==");
        for (int i : arr) {
            System.out.println(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            /*if (i==arr[0]){
                sb.append("[").append(arr[i]);
            }else*/ if (i==arr.length-1){
                sb.append(arr[i]).append("]");
            }else {
                sb.append(arr[i]).append(",");
            }
        }
        String s = sb.toString();
        System.out.println(s);
    }

}
