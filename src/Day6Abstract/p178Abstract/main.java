package Day6Abstract.p178Abstract;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.setAge(20);
        cat.setName("加菲猫");
        System.out.println(cat);
        System.out.println("====");

        Cat c  = (Cat) cat;
        c.eat();
        c.setAge(21);
        c.setName("傻帽");
        System.out.println(c);

        System.out.println();
        System.out.println("===");
        System.out.println();

        Gog gog = new Gog("金毛",2);
        gog.eat();
        System.out.println(gog);
        System.out.println("========");

        Gog g = (Gog) gog;
        g.setAge(50);
        g.setName("二哈");
        System.out.println(g);


    }
}
