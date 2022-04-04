package Day4ArrayList.p1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentCRUD {
    public static void main(String[] args) {

        ArrayList<Student> stu= new ArrayList<>();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("======欢迎来到学生管理系统======");
            System.out.println("1.添加学生");
            System.out.println("2.查看所有学生");
            System.out.println("3.更新学生");
            System.out.println("4.删除学生");
            System.out.println("5.退出");
            System.out.println("======请输入你的选择======");

            int index = scanner.nextInt();

            switch (index) {
                case 1:
                    System.out.println("=====添加学生页面=====");
                    addStudent(stu);
                    break;
                case 2:
                    System.out.println("=====查看学生页面=====");
                    findAllStudent(stu);
                    break;
                case 3:
                    System.out.println("=====更新学生页面=====");
                    updateStudent(stu);
                    break;
                case 4:
                    System.out.println("=====删除学生页面=====");
                    deleteStudent(stu);
                    break;
                case 5:
                    System.out.println("=====退出成功！=====");
                    quitStudent();
                    break;
            }
        }

//        System.out.println("==");
//        addStudent(stu);
//        System.out.println("==");
//        findAllStudent(stu);
//        System.out.println("==");
//        deleteStudent(stu);
//        System.out.println("==");
//        updateStudent(stu);

    }

    private static void updateStudent(ArrayList<Student> stu) {
        Scanner sc = new Scanner(System.in);
        


        if (stu.isEmpty()){
            System.out.println("对不起，暂无数据，请先添加数据");
        }else {
            System.out.println("请输入要修改的学生的学号：");
            int SID = sc.nextInt();
            //先判断学号是否输入正确才行========================
            //先判断学号是否输入重复才行========================


            System.out.println("请输入添加的学生新姓名：");
            String name = sc.next();
            System.out.println("请输入添加的学生新年龄：");
            int age = sc.nextInt();
            System.out.println("请输入添加的学生新地址：");
            String address = sc.next();

            Student student = new Student(SID,name,age,address);
            stu.add(student);

            for (int i = 0; i < stu.size(); i++) {
                Student student1 = stu.get(i);
                if (student1.getID()==SID){
                    stu.set(i,student);
                    break;
                }
            }
            System.out.println();
            System.out.println("修改成功！");


        }


    }

    private static void deleteStudent(ArrayList<Student> stu) {
//问题：如果一开始没有数据怎么办？

        if (stu.isEmpty()){
            System.out.println("对不起，暂无数据，请先添加数据");
        }else {
        System.out.println("请输入要删除的学生的学号：");
        Integer SID = new Scanner(System.in).nextInt();
        for (int i = 0; i < stu.size(); i++) {
            Student student = stu.get(i);
            if (student.getID() == SID) {
                stu.remove(i);
                System.out.println("删除成功！");
            } else {
                System.out.println("学号错误，请重新输入：");
                break; //不会重复

                //重新调用方法
                //deleteStudent(stu);
                }
            }
        }
    }

    private static void findAllStudent(ArrayList<Student> stu) {

        //System.out.println("学号"+ "\t  姓名" +"\t  年龄" +"\t  地址");

     /*//普通for遍历ArrayList即可
     for (int i = 0; i < stu.size(); i++) {
            Student studentAll = stu.get(i);
            System.out.println("学生："+studentAll);
        }*/

        if (stu.isEmpty()){
            System.out.println("对不起，暂无数据，请先添加数据");
        }else {
            //增强for遍历ArrayList即可
            System.out.println();
            System.out.println();
            System.out.println("=====学生信息=====");
            for (Student studentAll : stu) {
                System.out.println(studentAll);
            }
        }
    }

    private static void addStudent(ArrayList<Student> stu) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入添加的学生学号：");
        int ID = sc.nextInt();
        System.out.println("请输入添加的学生姓名：");
        String name = sc.next();
        System.out.println("请输入添加的学生年龄：");
        int age = sc.nextInt();
        System.out.println("请输入添加的学生地址：");
        String address = sc.next();

        Student student = new Student(ID,name,age,address);
        stu.add(student);

        System.out.println();
        System.out.println(student);
        System.out.println("添加成功！");

    }

    public static void quitStudent(){
        System.exit(0);//JVM虚拟机退出程序
    }

    public static boolean IsSameID(ArrayList<Student> stu , Integer SID){
        boolean flag=false;
        for (int i = 0; i < stu.size(); i++) {
            Student student = stu.get(i);

            if (SID == student.getID()){
                flag=true;
                break;
            }
        }
        return false;
    }
}
