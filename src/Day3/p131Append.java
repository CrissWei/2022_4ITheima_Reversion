package Day3;

import java.util.Arrays;

/*
* 123通过拼接变成[1,2,3]
* */
public class p131Append {
    public static void main(String[] args) {

        int[]arr={1,2,3,4,5,6};

        System.out.println(Append(arr));

    }
    public static String Append(int[] arr){

        String s = Arrays.toString(arr);
        StringBuilder sb = new StringBuilder(s);
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
           /* if (i==arr.length-1){
                System.out.println(arr[i]);
            }else {
                System.out.println(arr[i]);
            }*/
            System.out.println(arr[i]);
        }
        sb.append("]");
        return s;




    }
}
