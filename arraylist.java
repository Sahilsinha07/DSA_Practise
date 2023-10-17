import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;

public class arraylist {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list2 = new ArrayList<String>();
        list.add(0);
        list.add(1);
        list.add(4);
        System.out.println(list);
        int element = list.get(2);
        System.out.println(element);
        list.add(1, 9);
        System.out.println(list);
        list.set(2, 34);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());
        // iterating on the array list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }
        System.out.println();
        Collections.sort(list);
        System.out.println(list);
    }
}
