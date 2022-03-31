package Day1;

public class p39 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Cris"+i);
        }

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i%2==0){
                sum +=i;
            }
        }
        System.out.println(sum);
    }
}
