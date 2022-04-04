package Day8.P192Inter;

public class main {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method(new Inter() {
            @Override
            public void show() {
                System.out.println("重写show");
            }
        });
        System.out.println("===");

        //匿名内部类  写一个newInter()
        // 【快捷方法】然后使用alt+Enter回车键就行
        new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类重写接口show方法");
            }
        }.show();
        System.out.println("=====");

        //匿名对象
        Inter i = new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类再次重写接口show方法222");
            }
        };
        i.show();
        i.show();

        System.out.println("===============");

        InterImpl in = new InterImpl();
        in.show();
    }
}
