package Day7Generic.p251_KTVE;

public class main {
    public static void main(String[] args) {
        GenericClass<String> str = new GenericClass<>();
        str.setT("张维");
        String t = str.getT();
        System.out.println(t);
        System.out.println("===");

        GenericClass<Integer> num = new GenericClass<>();
        num.setT(20);
        num.setT2(222);
        System.out.println(num);

        GenericClass<String> s2 = new GenericClass<>();
        s2.setT2("str222");
        System.out.println(s2.getT2());
    }
}
