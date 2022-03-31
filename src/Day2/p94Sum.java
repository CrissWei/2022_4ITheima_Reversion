package Day2;

import java.util.Arrays;

/*
* 案例:数组元素求和
需求:有这样的一个数组，元素是{68,27,95,88,171,996,51,210}
* 求出该数组中满足要求的元素和，
* 要求是:求和的元素个位和十位都不能是7，并且只能是偶数

* */
public class p94Sum {
    public static void main(String[] args) {

        int sum=0;
        int[] array1={68,27,95,88,171,996,51,210};
        for (int i = 0; i < array1.length; i++) {
            // array1[i]%2==0 && (array1[i]/10)%10!=0 && (array1[i]%10!=7)
            if (array1[i]%2==0 && (array1[i]-7)%10!=0 && (array1[i]/10!=7)){
                System.out.println(array1[i]);
                sum+=array1[i];
            }
        }
        System.out.println("总和："+sum);//1362 正确
        //[68, 27, 95, 88, 171, 996, 51, 210]
        System.out.println(Arrays.toString(array1));


    }
}
