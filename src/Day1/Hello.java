package Day1;

public class Hello {
    public static void main(String[] args) {
        System.out.println("helloWorld");
        int i =10;

        System.out.println(i);//10
        int j = i++;//先赋值j=i，下次再是j = i+1
        System.out.println(j);//10
        System.out.println(i);//11
        System.out.println("-----");

        int b =10;
        int f = ++b;
        System.out.println(f);

    }
}
