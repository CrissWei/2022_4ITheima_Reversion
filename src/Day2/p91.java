package Day2;

/*满足其一即可：
* 个位是7
* 十位是7
* 倍数是7
* */
public class p91 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i%7==0 | i/10 %10==7 | (i%10)==7  ){
                System.out.println(i);
            }
        }
        System.out.println("====");
        System.out.println(79/10);
        System.out.println(75/10);
        System.out.println(71/10);
        System.out.println(5/10);
    }
}
