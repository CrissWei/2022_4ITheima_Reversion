package Day6Abstract.p178Abstract;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
}
