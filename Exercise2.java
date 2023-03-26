import java.util.Arrays;
import java.util.List;

public class Exercise2 {

   public static <T extends Number> T getMax(List<T> list) {
      if (list == null || list.size() == 0)
         return null;

      T max = list.get(0);

      for (T value : list) {
         if (max.doubleValue() < value.doubleValue())
            max = value;
      }

      return max;
   }

   public static void main(String[] args) {
      List<Integer> integers = Arrays.asList(10, 20, 30, 40);
      System.out.println("Max integer: " + getMax(integers));

      List<Long> longs = Arrays.asList(10L, 20L);
      System.out.println("Max long: " + getMax(longs));

      List<Double> doubles = Arrays.asList(10.1, 10.2, 10.3, 10.4);
      System.out.println("Max double: " + getMax(doubles));
   }
}
