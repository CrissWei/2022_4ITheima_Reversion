package Day2;
/*
案例：百钱百鸡
* 需求:
* 我国古代数学家张丘建在《算经》一书中提出的数学问题:
鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。
百钱买百鸡，问鸡翁、鸡母、鸡雏各几何?

【自己的思路】：用穷举法，把所有的可能都写出来
x+y+z=100只鸡
5x+3y+z/3=100文钱

0<=x<=20 最多20只公鸡，因为只有100文钱
0<=y<=33
0<=x<=100
=======================================
【老师思路】
思路:
第1层循环，用于表示鸡翁的范围，初始化表达式的变量定义为x=0，判断条件是x<=20
第2层循环，用于表示鸡母的范围，初始化表达式的变量定义为y=0，判断条件是y<=33
这个时候，用于表示鸡雏的变量z=100 - x-y
判断表达式z%3==0和表达式5*x + 3*y + z/3 = 100是否同时成立，
如果成立，输出对应的x， y，z的值，
就是对应的鸡翁，鸡母，鸡雏的值

* */
public class p93Chicken {
    public static void main(String[] args) {

       int x = 0;
       while (x<=3){
           System.out.println("鸡"+x);
           x++;

           int y=0;
           while (y<=4){
               System.out.println("母==="+y);
               y++;
           }


       }

       //GetChicken();
    }
    public static void GetChicken(){
        System.out.println("====");

        for (int x = 0; x <= 20; x++) {
            for (int y = 0; y <= 33; y++) {
                int z = 100-x-y;
                if ((100 - x-y)%3==0 && 5*x + 3*y + z/3 == 100 ){
                    System.out.println("公鸡："+x);
                    System.out.println("母鸡："+y);
                    System.out.println("小鸡："+z);
                    System.out.println("======");
                }
            }
        }

    }
}

