package Day7Generic.p252show;

public  class GenericMethod {
    //泛型方法,没有指定类型，直到调用的那一刻才知道传什么类型就是什么类型的数据
    public <T> void show(T t){
        System.out.println(t);
    }
}
