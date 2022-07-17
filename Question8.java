Question 8 , Geek and Buildings

// java Solution
// Stack based soln,

class Solution {
    public static long maximum_energy(int n, int[] arr) {
        
     Stack<Long> sum  = new Stack<>();
     Stack<Integer> val = new Stack<>();
     long ans  = 0, max = 0;
    
    for(int i=n-1; i>=0; i--){

    if(val.isEmpty() || arr[i] < val.peek()){
        val.push(arr[i]);
        ans = ans ^ arr[i];
        sum.push(ans);
    }
    else{
        while(!val.isEmpty()){
           if(arr[i] > val.peek()) {
               val.pop();
               sum.pop();
           }
           else
               break;
        }
        if(val.isEmpty()){
            ans = arr[i];
            sum.push(ans);
            val.push(arr[i]);
        }
        else {
            ans = arr[i] ^ sum.peek();
            sum.push(ans);
            val.push(arr[i]);
        }
     }
      if(ans > max){
        max = ans;
       }
   }   
    
 return max;
        
    }    
    
}
        