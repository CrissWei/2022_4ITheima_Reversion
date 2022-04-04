package Day7Generic.p251_KTVE;

public class GenericClass<T> {
    private T t; //泛型 Type , Element , Key ,Value
    private T t2;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public T getT2() {
        return t2;
    }

    public void setT2(T t2) {
        this.t2 = t2;
    }

    @Override
    public String toString() {
        return "GenericType{" +
                "t=" + t +
                ", t2=" + t2 +
                '}';
    }
}
