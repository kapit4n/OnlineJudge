package hallPreparation;
import java.util.*;

public class Main
{
   public static void main(String[] args)
   {
	  int[][] teams;
	  Scanner in = new Scanner(System.in);
	  int t = in.nextInt();
	  int n;
	  int m;
	  Map<Integer, Integer> result;

      while(--t>= 0) {
    	  n = in.nextInt();
    	  m = in.nextInt();

    	  teams = new int[n][m];
    	  for (int i = 0; i < n; i++) {
    		  for (int j = 0; j < m; j++) {
    			  teams[i][j] = in.nextInt();
    		  }
    	  }
    	  result = new HashMap<Integer, Integer>();
    	  int sumAddiacents = 0;
    	  for ( int i = 0; i < n; i++) {
    		  for (int j = 0; j < m; j++) {
    			  sumAddiacents = 0;
    			  int left = i - 1;
    			  int right = i + 1;
    			  int top = j - 1;
    			  int bottom = j + 1;
    			  if (left >= 0 && teams[left][j] == teams[i][j]) {
    				  ++sumAddiacents;
    			  }
    			  if (right < n && teams[right][j] == teams[i][j]) {
    				  ++sumAddiacents;
    			  }
    			  if (top >= 0 && teams[i][top] == teams[i][j]) {
    				  ++sumAddiacents;
    			  }
    			  if (bottom < m && teams[i][bottom] == teams[i][j]) {
    				  ++sumAddiacents;
    			  }
    			  if (left >= 0 && top >= 0 && teams[left][top] == teams[i][j]) {
    				  ++sumAddiacents;
    			  }
    			  if (left >= 0 && bottom < 0 && teams[left][bottom] == teams[i][j]) {
    				  ++sumAddiacents;
    			  }
    			  if (right < n && top >= 0 && teams[right][top] == teams[i][j]) {
    				  ++sumAddiacents;
    			  }
    			  if (right < n && bottom < m && teams[right][bottom] == teams[i][j]) {
    				  ++sumAddiacents;
    			  }
    			  if (sumAddiacents > 1 && !result.containsKey(teams[i][j])) {
    				  result.put(teams[i][j], sumAddiacents);
    			  }
    		  }
    	  }
    	  System.out.println(result.size());
      }
      in.close();
   }
}