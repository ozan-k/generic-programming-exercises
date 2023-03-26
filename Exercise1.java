public class Exercise1 {
   public static <T> boolean isItNull(T var) {
      return var == null;
   }

   public static <T> T returnSame(T var) {
      return var;
   }

   public static void main(String[] args) {
      Integer i = null;
      System.out.println(isItNull(i));
      i = 123;
      System.out.println(isItNull(i));

      String s = null;
      System.out.println(isItNull(s));
      s = "Something";
      System.out.println(isItNull(s));

      Integer i2 = returnSame(i);
      System.out.println(i2);

      String s2 = returnSame(s);
      System.out.println(s2);
   }
}
