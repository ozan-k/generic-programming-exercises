import java.util.Arrays;

public class Solution2RunTimeException {

    public static void main(String[] args) {
      Integer[] numbers = new Integer[] {5, 10, 15, 0};
      System.out.println("Before sorting: " + Arrays.toString(numbers));

      sort(numbers);
      System.out.println("After sorting: " + Arrays.toString(numbers) + "\n");

      Person[] people = new Person[] {new Person("John", 31), new Person("Jamie", 33), new Person("Jane", 0)};
      System.out.println("Before sorting: " + Arrays.toString(people));

      sort(people); // This will throw an exception!
      System.out.println("After sorting: " + Arrays.toString(people) + "\n");
    }


    public static void sort(Object[] array) {
      boolean sorted = false;
      while (!sorted) {
        sorted = true;
        for (int i = 0; i < array.length - 1; i++) {
          Comparable current = (Comparable) array[i];
          Comparable next = (Comparable) array[i + 1];
          if (current.compareTo(next) > 0) {
            array[i] = next;
            array[i + 1] = current;
            sorted = false;
          }
        }
      }
    }
}
