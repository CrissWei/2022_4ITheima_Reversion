package Day5.p154Extends;

public class Zi extends Fu{
    public Zi(){
        //super();
        System.out.println("ZI无参");
    }
    public Zi(int age ){
        //super();
        System.out.println("ZI有参");
    }
    public void showZi(){
        System.out.println("zi show");
    }

    @Override
    public void showFu() {
        System.out.println("zi重写show fu @Override");
    }
}
