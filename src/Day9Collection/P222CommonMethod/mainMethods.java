package Day9Collection.P222CommonMethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* Collection集合常用方法:
    boolean add(E e) :添加元素
    boolean remove(Object o): 从集合中移除指定的元素
    void clear():清空集合中的元素
    boolean contains(object o) :判断集合中是否存在指定的元素
    boolean isEmpty() :判断集合是否为空
    int size():集合的长度，也就是集合中元素的个数

* */
public class mainMethods{
    public static void main(String[] args) {
        Collection<String> ss = new ArrayList<>();

        ss.add("hello");
        ss.add("java");
        ss.add("world");
        System.out.println(ss);

      /*  ss.remove("hello");
        ss.contains("world");
        ss.isEmpty();
        ss.size();
        ss.clear();*/

        Iterator<String> it = ss.iterator();
        while (it.hasNext()){
            //System.out.println(it.next());
            String next = it.next();
            System.out.println(next);
        }
    }
}
