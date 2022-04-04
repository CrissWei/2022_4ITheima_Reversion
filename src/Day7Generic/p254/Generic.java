package Day7Generic.p254;

import java.util.ArrayList;
import java.util.List;

/*
* 4.泛型
4.5类型通配符
    为了表示各种泛型List的父类，可以使用类型通配符
    * 类型通配符:<?>
        List<?>:表示元素类型未知的List，它的元素可以匹配任何的类型
        这种带通配符的List仅表示它是各种泛型List的父类，并不能把元素添加到其中

    * 如果说我们不希望List <?>是任何泛型List的父类，只希望它代表某一类泛型List的父类，可以使用类型通配符的上限
        类型通配符上限: <? extends类型>
        List<? extends Number> :它表示的类型是Number或者其子类型


    * 除了可以指定类型通配符的上限，我们也可以指定类型通配符的下限
        * ·类型通配符下限: <?super类型>
        * List<? super Number>: 它表示的类型是Number或者其父类型

* Object>Number>Integer
* */
public class Generic {
    public static void main(String[] args) {
        List<?> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();

        //【通配符上限extends】
        //继承谁（如Object, Number等等），那么谁就是上限，不超过就行，同理，如果是继承
        List<? extends Object> list4 = new ArrayList<Object>();
        List<? extends Object> list5 = new ArrayList<Number>();
        List<? extends Object> list6 = new ArrayList<Integer>();

        //最高是Integer,由于Number比Integer要大，所以报错
//        List<? extends Integer> list7 = new ArrayList<Number>();报错


        //【通配符下限super】
        // 最低是Number，只能是大于Number的类型
        List<? super Number> list8 = new ArrayList<Object>();
        List<? super Number> list9 = new ArrayList<Number>();
//        List<? super Number> list10 = new ArrayList<Integer>();



    }
}
