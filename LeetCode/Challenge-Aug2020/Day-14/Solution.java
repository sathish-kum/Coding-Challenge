class Solution {
    public int longestPalindrome(String s) {
    
        int even = 0, lodd = 0, flag = 0;
             int[] a =  new int[128];
             for(char c : s.toCharArray())
               a[c]++;
             
             for(int d : a)
                 if(d%2 == 1 && lodd < d)
                     lodd = d;
             for(int e : a)
             {
                 if(e%2 == 0)
                     even=  even + e;
                 else if(e%2 ==1)
                 {
                     if(e == lodd && flag == 0)
                         flag  = 1;
                     else
                         even=  even + (e-1);
                 }
             }
        return even+lodd;
    }
}
