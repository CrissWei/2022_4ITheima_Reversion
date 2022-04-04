package Day7Generic.p251_KTVE;

public class main {
    public static void main(String[] args) {
        GenericType<String> str = new GenericType<>();
        str.setT("张维");
        String t = str.getT();
        System.out.println(t);
        System.out.println("===");

        GenericType<Integer> num = new GenericType<>();
        num.setT(20);
        num.setT2(222);
        System.out.println(num);

        GenericType<String> s2 = new GenericType<>();
        s2.setT2("str222");
        System.out.println(s2.getT2());
    }
}
