package Day5.pp155Override;

public class Zi extends Fu {

    @Override
    public void showFu() {
        System.out.println("zi重写show fu @Override");
    }

    @Override
    public void show22(int age) {
        System.out.println(age);
    }
}
