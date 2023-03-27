import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Solution3List {

    public static void main(String[] args) {
      ArrayList<Integer> numbersList = new ArrayList<>();
      numbersList.add(15);
      numbersList.add(10);
      numbersList.add(5);

      sort(numbersList); // => This does not compile!

      ArrayList<Comparable> comparablesList = new ArrayList<>(numbersList);
      System.out.println("Before sorting: " + comparablesList);
      sort(comparablesList);
      System.out.println("After sorting: " + comparablesList + "\n");
    }


    public static void sort(List<Comparable> list) {
      boolean sorted = false;
      while (!sorted) {
        sorted = true;
        for (int i = 0; i < list.size() - 1; i++) {
          if (list.get(i).compareTo(list.get(i + 1)) > 0) {
            Comparable temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
            sorted = false;
          }
        }
      }
    }
}
