package omar;
import java.util.*;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      while(--number >= 0) {
    	  int a = in.nextInt();
    	  int b = in.nextInt();
    	  if ( a <= 100 && a > 0 && b > 0 && b <= 100) System.out.println(a + b);
      }
      in.close();
   }
}