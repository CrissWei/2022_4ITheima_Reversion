package TestCode;

public class p1 {
    //无惨构造，专门用来创建对象，然后最终目的为了调用方法
    public p1() {
    }

    public int method1(){
        return 11;
    }
    public void method2(){
        System.out.println(22);

    }
    public <E> void method3(E e){
        System.out.println(e);
    }



    public static void main(String[] args) {
        p1 p1 = new p1();
        System.out.println(p1.method1());

        p1.method2();

        p1.method3("泛型方法3");
        p1.method3(33);
        p1.method3(3.33);


    }
}
