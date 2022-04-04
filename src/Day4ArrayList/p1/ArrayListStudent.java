package Day4ArrayList.p1;

import java.util.ArrayList;

public class ArrayListStudent {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student());
        System.out.println(students);

        Student ss = new Student(1,"张维",20,"成都");
        students.add(ss);

        students.remove(0);
        System.out.println(students);
    }
}
