import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        A.add("к");
        A.add("лев");
        A.add("хомяк");
        A.add("шоколад");
        A.add("сохранять");
        System.out.println(A);
        ArrayList<String> B = new ArrayList<>();
        B.add("кинозвезда");
        B.add("вещество");
        B.add("собака");
        B.add("гриб");
        B.add("да");
        Collections.reverse(B);
        ArrayList<String> C = new ArrayList<>();
        ListIterator<String> listIter = A.listIterator();
        ListIterator<String> listter = B.listIterator();
        while (listIter.hasNext()){
            C.add(listIter.next());
            C.add(listter.next());
        }
        System.out.println(C);
        for (String ret : C) {
            System.out.println(ret);
        }
    }
}