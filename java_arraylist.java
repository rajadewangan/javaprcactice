import java.util.ArrayList;

public class java_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(0,1);
        a.add(1,2);
        a.add(3);
        b.addAll(0,a);
        //System.out.println(a.contains(3));
        //System.out.println(a.equals(b));
        //a.remove(0);
        a.removeAll(b);
        for (Integer i : a) {
            System.out.print(i + ", ");
        }
        System.out.println();
       /*
         System.out.println(a.hashCode());
        System.out.println(a.indexOf(2));
        System.out.println(a.isEmpty());
        System.out.println(a.listIterator());
        */
    }
}
