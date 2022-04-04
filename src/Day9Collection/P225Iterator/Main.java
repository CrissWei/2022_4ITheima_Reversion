package Day9Collection.P225Iterator;

import Day8.P192Inter.Inter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //List类型通配符?
        Collection<Student<?>> al = new ArrayList<>();
        //Collection<Student> al = new ArrayList<>();

        //Integer <-----> String相互转换
        Student<String> ss1 = new Student<>("张维","20");
        //Student<Integer> ss2 = new Student<>(2,20);
        Student<String> ss2 = new Student<>("小凤","18");
        Student<String> ss4 = new Student<>("小小",String.valueOf(19));
        Student<Integer> ss3 = new Student<>(Integer.parseInt("007"),19);

        al.add(ss1);
        al.add(ss2);
        al.add(ss3);
        al.add(ss4);
        System.out.println("=========");

        //增强for遍历...它的底层是包装了iterator
        for (Student<?> student : al) {
            System.out.println(student);
        }
        System.out.println("========");

        //迭代器遍历
        Iterator<Student<?>> it = al.iterator();
        while (it.hasNext()){
            Student<?> next = it.next();
            System.out.println(next);
        }
    }
}
