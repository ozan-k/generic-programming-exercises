import java.util.List;
import java.util.ArrayList;
class OrderedList<T extends Comparable<T>> {
   List<T> list = new ArrayList<>();
   public void add(T element){
      for (int i = 0; i < list.size(); i++) {
         T value = list.get(i);

         // if element is smaller than value
         if (element.compareTo(value) <= 0) {
            List<T> smallerValues = list.subList(0, i);
            List<T> higherValues = list.subList(i, list.size());

            list = new ArrayList<>();
            list.addAll(smallerValues);
            list.add(element);
            list.addAll(higherValues);
            return;
         }
      }

      list.add(element);
   }

   public void remove(T element){
      list.remove(element);
   }

   @Override
   public String toString() {
      return list.toString();
   }
}
