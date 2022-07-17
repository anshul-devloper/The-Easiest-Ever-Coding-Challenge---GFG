Question 1. - Maximum Number

// JAVA Solution
// just have to change first "7" with "9"

class Solution {
    public int maximumNumber(int n) {
        
        String s = n+"";
        
        char a[] = s.toCharArray();
        
        for(int i=0;i<a.length;i++) {
            if(a[i]=='7'){
                a[i]='9';
                break;
            }
        }
        
        return Integer.parseInt(new String(a));
    }
}
