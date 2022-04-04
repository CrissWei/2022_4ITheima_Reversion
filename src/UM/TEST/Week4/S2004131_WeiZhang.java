package UM.TEST.Week4;

public class S2004131_WeiZhang <T>{
   private T t;

   public <T> void Method (T t){
        //泛型方法

    }

    public S2004131_WeiZhang(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "S2004131_WeiZhang{" +
                "t=" + t +
                '}';
    }
}
