package Day6Abstract.p179Interface;
/*
* 1.4类和接口的关系
  类和类的关系
    继承关系，只能单继承，但是可以多层继承类和接口的关系
    实现关系，可以单实现，也可以多实现，还可以在继承一个类的同时实现多个接口和接口的关系
    继承关系，可以单继承，也可以多继承

* */
public class main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.jumping();
    }
}
