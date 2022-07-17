Question 3, Beautiful Number

// Java Solution
// Just have to detect the loop.    
// leetcode - 202. Happy Number (same question)

class Solution {
    public boolean beautifulNumber(int n) {
     int slow=n,fast=n;    
         do{
            slow=digitSquareSum(slow);
            fast=digitSquareSum(digitSquareSum(fast));
            }while(slow!=fast);
      return slow==1; 
    }
    
  int digitSquareSum(int n){
    int sum = 0, tmp;
    while (n!=0) {
        tmp = n % 10;
        sum += tmp * tmp;
        n /= 10;
     }
    return sum;
   }

}