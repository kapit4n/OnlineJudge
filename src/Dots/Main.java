package Dots;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int t = in.nextInt();
      int nextRow;

      while(--t >= 0) {
    	  int n = in.nextInt();
    	  nextRow = 1;
    	  while (n > 0) {
    		  n -= nextRow;
    		  nextRow += 1;
    	  }
    	  if (n == 0) System.out.println("Yes");
    	  else System.out.println("No");
      }
      in.close();
   }
}