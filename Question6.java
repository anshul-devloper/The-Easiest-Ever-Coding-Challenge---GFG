Question 6, String Matching

// java Solution
// generate all pairs.

class Solution {
    public static int minimum_difference(int n, String[] a) {

        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
               int sum =0;   
               for(int k=0;k<a[i].length();k++)
               {
                    sum += Math.abs(a[i].charAt(k)-a[j].charAt(k)); 
                   
               }
              min = Math.min(min,sum);      
            }
        }
        
        return min;
    }
}