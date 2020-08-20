class Solution {
    public String toGoatLatin(String s) {
        String output  ="";
        String append  ="ma";
        String co = "";
        for(int i = 0; i< s.length(); i++)
        {
            
            if(i == s.length()-1 || s.charAt(i) == ' ')
            {
                append = append+'a';
                 if(i == s.length()-1)
                    output = output+s.charAt(i)+co+append;
                else
                {
                    output = output+co+append+' ';
                    co = "";
                }
            }
            else if(i==0||s.charAt(i-1)==' ')
            {
                if(!(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'))
                {
                    co = co+s.charAt(i);
                }
                else
                    output = output+s.charAt(i);
            }
            else
                output = output+s.charAt(i);
        }
        return output;
    }
}
