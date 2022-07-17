Question 2, Count the Substrings

// java Solution
// go to all substrings and just check for the given condition.

class Solution 
{ 
    int countSubstring(String s) 
    { 
          int count = 0;
          int n =s.length();
         
         for(int i=0;i<n;i++)
         {
             int uc = 0 , lc = 0;
             
             for(int j=i;j<n;j++)
             {   char ch = s.charAt(j);
                 if(ch>='a' && ch<='z') uc++;
                 if(ch>='A' && ch<='Z') lc++;
                  if(uc == lc) count++; 
             }
         }
         
         return count;
    }
} 
