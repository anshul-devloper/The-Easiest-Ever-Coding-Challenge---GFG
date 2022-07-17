Question 7, Array Game

// java Solution
// code is enough, for Explanation.

class Solution {
    public static int min_operations(int n, int[] a, int[] b) {
        
        int ans = n;
        
        for(int i=0;i<n-1;i++)
        {
            ans+=rotation(i,n-1,a,b[i]);    
        }
        
        return ans;
    }
    
    
   static int rotation(int l , int h , int a[], int val)
     {   
         int i=0;
         while(true)
         {  
             if (a[l+i] == val) break; 
             i++;
         }
         
        if(i==0) return i;
         
         reverse(l,l+i-1,a);
         reverse(i+l,h,a);
         reverse(l,h,a);
         
        return i;
     }
    
 static  void reverse(int s,int e,int a[])
    {
        while(s<e)
        {
            int c = a[s];
            a[s]= a[e];
            a[e]=c;            
            s++;
            e--;
        }
    }
}
        
