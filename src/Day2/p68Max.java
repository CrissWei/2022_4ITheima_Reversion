package Day2;

public class p68Max {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 4, 55, 66, 44,3};
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            System.out.println("遍历：" + array[i]);
            //最小值改一下if (array[i] < max){ max = array[i];}
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("===");
        System.out.println("最大值：" + max);
        System.out.println("===");

        int max1 = getMin(array);
        System.out.println("最小值："+max1);
    }


    public static int getMin(int[] array) {
        int min = array[0];
        for (int i=1 ;i< array.length;i++) {
            if (min > array[i]){

                min = array[i];
            }

        }
        return min;
    }
}
