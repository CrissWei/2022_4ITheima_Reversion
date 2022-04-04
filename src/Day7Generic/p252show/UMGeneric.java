package Day7Generic.p252show;

public class UMGeneric {


    public static void main(String[] args) {

        Integer[] list1 = {1,2,3,4,5};
        String[] list2={"s1","s2","s3"};

        getArray(list1);
        System.out.println("===");
        getArray(list2);

    }
    public static <E> void getArray(E[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]+" ");
        }
    }
}
