package Day7Generic.p253Interface;

public class GenericImpl <T> implements Generic<T>{

    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
