package Day7Generic.p250Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        //多态
        Collection<String> co = new ArrayList<>();
        co.add("hello");
        co.add("java");
        co.add("world");

        //遍历
        Iterator<String> it = co.iterator();

        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
    }
}
