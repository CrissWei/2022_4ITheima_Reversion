package Day7Generic.p253Interface;

public class main {
    public static void main(String[] args) {
        GenericImpl<String > s1 = new GenericImpl<>();
        s1.show("张维");

        GenericImpl<Integer> i1 = new GenericImpl<>();
        i1.show(999);

        GenericImpl<Boolean> b1 = new GenericImpl<>();
        b1.show(true);
    }
}
