class Solution {
    public boolean isPalindrome(String s) {
        String pal = "";
        
            for(int i = 0; i<s.length(); i++)
                if(s.charAt(i) >='a'&&s.charAt(i) <= 'z'||s.charAt(i) >='0'&&s.charAt(i) <= '9'||s.charAt(i) >='A'&&s.charAt(i) <= 'Z')
                  pal = pal+s.charAt(i);
            if(pal.isEmpty() == true)
                return true;
                String p="";
            for(int i = pal.length()-1; i>=0;i--)
                p=p+pal.charAt(i);
            if(p.equalsIgnoreCase(pal)==true)
                return true;
        
        return false;
    }
}
