package Day7Generic.p255getSum;

public class sum {
    public static void main(String[] args) {
        System.out.println(getSum(1));
        System.out.println(getSum(1,2));
        System.out.println(getSum(1,2,3));
        System.out.println(getSum(1,2,3,4));
        System.out.println(getSum(1,2,3,4,5));
        System.out.println(getSum(1,2,3,4,5,6));
        System.out.println(getSum(1,2,3,4,5,6,7,8,9,10,99));

        System.out.println("=====");

        System.out.println(getSum2(10,2));
        System.out.println(getSum2(10,2,3));
        System.out.println(getSum2(10,2,3,4));
        System.out.println(getSum2(10,2,3,4,5,6,7,8,9));
    }
    //可变参数求和
    public static int getSum(int... x){
        int sum = 0 ;
        /*for (int i = 0; i < x.length; i++) {
            sum+=i;
        }*/
        for (int i : x) {
            sum+=i;
        }
       return sum;
    }
    public static int getSum2(int a, int... x){
        int sum = 0 ;
        /*for (int i = 0; i < x.length; i++) {
            sum+=i;
        }*/
        for (int i : x) {
            sum+=i+a;
            //sum+=i;
        }
        return sum;
    }

}
