package Day6Abstract.p179Interface;

public class Cat extends Animal implements Jumping{
    @Override
    public void eat() {
        System.out.println("猫吃");
    }

    @Override
    public void jumping() {
        System.out.println("猫跳");
    }
}
