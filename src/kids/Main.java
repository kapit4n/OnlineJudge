package kids;

import java.util.*;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int t = in.nextInt();

      while(--t >= 0) {
    	  int n = in.nextInt();
    	  int k = in.nextInt();
    	  int total = 0;
    	  while (--n >= 0) {
    		  int aux = in.nextInt();
    		  total += aux / k;
    	  }
    	  System.out.println(total);
      }
   }
}