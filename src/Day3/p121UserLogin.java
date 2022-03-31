package Day3;

import java.util.Scanner;

/*
* 案例:用户登录
需求:已知用户名和密码，请用程序实现模拟用户登录。
     总共给三次机会，登录之后，给出相应的提示
思路:
    已知用户名和密码，定义两个字符串表示即可
    键盘录入要登录的用户名和密码，用Scanner 实现
    拿键盘录入的用户名、密码和已知的用户名、密码进行比较，给出相应的提示。
    * 字符串的内容比较，用equals(方法实现)
    用循环实现多次机会，这里的次数明确，采用for循环实现，
    并在登录成功的时候，使用break结束循环
    *
    * 【自己独立完成的，100分】

* */
public class p121UserLogin {
    public static void main(String[] args) {
        String account = "Cris";
        String password = "123456";

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入账号：");
            String at = scanner.next();
            System.out.println("请输入密码：");
            String pd = scanner.next();

            if (account.equals(at) && password.equals(pd)){
                System.out.println("登录成功！");
                break;
            }else if (i-2==0){
                System.out.println("您的账号被锁定，请5分钟后再试");
            }

            else {
                System.out.println("错误！您还有"+(2-i)+"次机会！请重新输入：");
            }
        }



    }
}
