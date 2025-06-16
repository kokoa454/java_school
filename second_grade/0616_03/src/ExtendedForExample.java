import java.util.LinkedList;
import java.util.Iterator;

public class ExtendedForExample {
    public static void main(String[] args) throws Exception {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        // for (String str: list) {
        //     System.out.println(str);
        // }

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
    }
}
