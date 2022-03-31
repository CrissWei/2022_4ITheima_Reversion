package Day3;
/*
* 案例:拼接字符串
需求:定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，
调用该方法，并在控制台输出结果。
* 例如，数组为int[] arr ={1,2,3};，执行方法后的输出结果为:[1,2,3]
*
* 【我自己的方法，有点麻烦】
*/
public class p124 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,10,8,555};
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i== arr.length-1){
                //System.out.print(arr[arr.length-1]);
                System.out.print(arr[i]);
            } else {
               System.out.print(arr[i]+",");
           }
        }
        System.out.print("]");
    }
}
