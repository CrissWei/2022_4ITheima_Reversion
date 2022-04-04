package Day5.p2.p155Override;

public class main {
    public static void main(String[] args) {
        //多态。左父 =  new 右子
        Fu fu = new Zi();
        fu.showFu();
        System.out.println("===");
        fu.show22(20);
    }
}
