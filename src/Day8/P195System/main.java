package Day8.P195System;

/*
 * public static void exit(int status); 终止当前运行的Java虚拟机，非零表示异常终止
 *
 *public status long currentTimeMillis(); 返回当前时间(以毫秒为单位)
 * */
public class main {
    public static void main(String[] args) {

        methodTime();
        //methodExit();
    }

    private static void methodExit() {
        System.out.println("start");
        System.exit(0);//JVM强制退出，结束程序
        System.out.println("over");

    }

    private static void methodTime() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-start)+"毫秒");
    }
}
