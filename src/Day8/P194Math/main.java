package Day8.P194Math;
/*
* 1.2 Math 类的常用方法
方法名
说明
public static int abs(int a)返回参数的绝对值
*
public static double ceil(double a)返回大于或等于参数的最小double值，等于—个整数
*
public static double floor(double a)返回小于或等于参数的最大double值，等于—个整数
*
public static int round(float a)按照四舍五入返回最接近参数的int
*
public static int max(int a,int b)返回两个int值中的较大值
*
public static int min(int a,int b)返回两个int值中的较小值
*
public static double pow(double a,double b)返回a的b次幂的值
*
public static double random()返回值为double的正值，[0.0,1.0)

* */
public class main {
    public static void main(String[] args) {
        System.out.println(Math.abs(-10.2));
        System.out.println(Math.abs(10.2));

        System.out.println(Math.ceil(-10.2));
        System.out.println(Math.ceil(10.2));

        System.out.println(Math.floor(-10.2));
        System.out.println(Math.floor(10.2));

        //四舍五入
        System.out.println(Math.round(-10.2));
        System.out.println(Math.round(10.8));

        System.out.println(Math.max(1,2));
        System.out.println(Math.min(1,2));

        //a的b次幂
        System.out.println(Math.pow(2,3));

        //搞不懂啊
        System.out.println(Math.round(10));
        System.out.println(Math.round(100));


    }
}
