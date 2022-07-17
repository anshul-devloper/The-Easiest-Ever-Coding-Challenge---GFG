Question 4 , Complete the Staircase

// java Solution
// Binary search - ceil and floor concept

class Solution {
    public int completeRows(int n) {
        
         long s=1,e=n,lastminone=1;
         
         while(s<=e)
         {
            long mid =s+(e-s)/2;
            long sum = (mid*(mid+1))/2;
            if(sum<=n)
             {
                 s=mid+1;
                 lastminone=mid;
                 if(sum==n) break;
             }
            else  e=mid-1;
         }
        return (int)lastminone;
    }

}