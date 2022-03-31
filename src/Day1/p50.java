package Day1;
/*
* 内循环完全包裹在外层循环的里面，最开始和最结束的sout语句一定是最外围的for循环
* */
public class p50 {
    public static void main(String[] args) {
       Time();
    }
    public static void Time(){
        int account=0;
        for (int hour = 0; hour <= 23; hour++) {
            for (int minutes = 0; minutes <= 59; minutes++) {
                for (int second = 0; second <= 59; second++) {
                    account++;
                    System.out.println("现在是："+hour+"点"+minutes+"分"+second+"秒");
                }

                //System.out.println("现在是："+hour+"点"+minutes+"分");

            }

        }
        System.out.println("一共次数/秒数："+account);

    }
    public static void Test1(){
        for (int i = 0; i < 5; i++) {
            for (int i1 = 0; i1 < 3; i1++) {
                System.out.println(i1);
            }
            System.out.println("--");
        }

    }
}
