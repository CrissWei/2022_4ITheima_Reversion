package Day5.p154Extends;

public class Main {
    public static void main(String[] args) {
        Zi zi = new Zi();
        System.out.println("==");
        Fu fu = new Fu();
        System.out.println("======");


        Zi zi1 = new Zi(10);
        System.out.println("==");
        Fu fu1 = new Fu(20);

        System.out.println("-------");
        zi.showZi();
        System.out.println("-------");
        zi.showFu();
        System.out.println("-------");

        fu.showFu();

    }
}
