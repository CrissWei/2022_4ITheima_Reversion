package Day4ArrayList.p2;

import Day4ArrayList.p1.ArrayListStudent;
import Day4ArrayList.p1.Student;

import java.util.ArrayList;

public class ArrayListStudent2 {
    public static void main(String[] args) {

        ArrayList<Student> stuList = new ArrayList<>();
        stuList.add(new Student());
        System.out.println(stuList);

        Student s1 = new Student(2,"小凤",18,"成都");
        Student s2 = new Student(3,"大凤",19,"成都");
        stuList.add(s1);

        stuList.remove(0);
        System.out.println(stuList);

        //是否包含s1
        boolean flag = stuList.contains(s1);
        System.out.println(flag);

        //返回元素所在的指定索引
        int i = stuList.indexOf(s1);
        System.out.println(i);

        //s1和 s2是否相等
        System.out.println(s1.equals(s2));

        //问题：stuList.removeAll();

    }
}
