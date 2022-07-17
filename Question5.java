Question 5, Problem Setting at GFG

// java Solution
// do just , what question asked.

class Solution {
    public static int maximum_problems(int n, int[] a) {
          
          int max = 1,count=1;
          
          for(int i=1;i<n;i++)
          {
              if(a[i]>a[i-1] && a[i]<=a[i-1]*1L*2) count++;
              else count=1;
              
              max = Math.max(max,count);
          }
         return max ;
    }
}