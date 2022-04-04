package Day6Abstract.p178Abstract;

public class Gog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public Gog() {
    }

    public Gog(String name, int age) {
        super(name, age);
    }
}
