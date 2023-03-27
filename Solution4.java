import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Solution4 {

    public static void main(String[] args) {
       ArrayList<Integer> numbers = new ArrayList<>();
       numbers.add(15);
       numbers.add(5);
       numbers.add(10);
       numbers.add(0);
       System.out.println("Before sorting: " + numbers);
       sort(numbers);
       System.out.println("After sorting: " + numbers + "\n");

       ArrayList<String> names = new ArrayList<>();
       names.add("Jane");
       names.add("Jamie");
       names.add("John");
       System.out.println("Before sorting: " + names);
       sort(names);
       System.out.println("After sorting: " + names + "\n");
    }


    public static <T extends Comparable> void sort(List<T> list) {
      boolean sorted = false;

      while (!sorted) {
        sorted = true;
        for (int i = 0; i < list.size() - 1; i++) {
          if (list.get(i).compareTo(list.get(i + 1)) > 0) {
            T temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
            sorted = false;
          }
        }
      }
    }
}
