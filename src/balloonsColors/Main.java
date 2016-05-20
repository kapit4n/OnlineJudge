package balloonsColors;
import java.util.*;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int t = in.nextInt();
      while(--t >= 0) {
    	  int n = in.nextInt();
    	  int x = in.nextInt();
    	  int y = in.nextInt();
    	  int i = 0;
    	  boolean easy = false;
    	  boolean harder = false;
    	  while(--n >= 0) {
    		i++;
    		int p = in.nextInt();
    		if (i == 1 && p == x) {
    			easy= true;
    		}
    		if (n == 0 && p == y) {
    			harder = true;
    		}
    	  }
    	  if (easy && harder) {
    		  System.out.println("BOTH");
    	  } else if (easy) {
    		  System.out.println("EASY");
    	  } else if (harder) {
    		  System.out.println("HARD");
    	  } else {
    		  System.out.println("OKAY");
    	  }

      }
      in.close();
   }
}