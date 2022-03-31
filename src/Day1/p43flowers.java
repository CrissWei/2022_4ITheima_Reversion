package Day1;

//求所以水仙花数,3个数的3次方之和等于那个数本身。
//如153，，1^3 + 5^3 +3^3 = 153
public class p43flowers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i <= 999; i++) {
            //个位数3次方
            int ge =(i%10)*(i%10)*(i%10);
            //十位数3次方
            int shi = ((i/10)%10)*((i/10)%10)*((i/10)%10);
            //百位数3次方
            int bai =((i/100)%10)*((i/100)%10)*((i/100)%10);

            if (i == ge+shi+bai){
                System.out.println("水仙花数有："+i);
                sum ++;
            }
        }

        System.out.println("共有个数："+sum);
    }
}
