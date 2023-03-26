public class Exercise3 {
   public static void main(String[] args) {
      OrderedList<String> orderedStringList = new OrderedList<>();
      orderedStringList.add("Rick");
      System.out.println(orderedStringList);

      orderedStringList.add("Morty");
      orderedStringList.add("Beth");
      orderedStringList.add("Beth");
      orderedStringList.add("Jerry");
      orderedStringList.add("Snuffles");
      System.out.println(orderedStringList);

      orderedStringList.remove("Beth");
      System.out.println(orderedStringList);
   }
}
