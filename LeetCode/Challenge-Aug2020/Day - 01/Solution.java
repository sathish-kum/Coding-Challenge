class Solution {
    public boolean detectCapitalUse(String word) {
        //if length = 1
        if(word.length()==1)
            return true;
        else
        {
            //if the string contains "aA" ->small and caps
            if((word.charAt(0) >= 'a'&& word.charAt(0) <= 'z') && (word.charAt(1) >= 'A'&& word.charAt(1) <= 'Z'))
                return false;
            else
            {//checking for correctness in "AA-----"
                if((word.charAt(0) >= 'A'&& word.charAt(0) <= 'Z')&&(word.charAt(1) >= 'A'&& word.charAt(1) <= 'Z'))
                {
                    for(int i = 2; i < word.length(); i++)
                    {
                        if((word.charAt(i) >= 'a'&& word.charAt(i) <= 'z'))
                            return false;
                    }
                }
                else if((word.charAt(0) >= 'A'&& word.charAt(0) <= 'Z')&&(word.charAt(1) >= 'a'&& word.charAt(1) <= 'z'))
                {//checking for correctness in "Aa-----"
                    for(int i = 2; i < word.length(); i++)
                    {
                        if((word.charAt(i) >= 'A'&& word.charAt(i) <= 'Z'))
                            return false;
                    }
                }
                else if((word.charAt(0) >= 'a'&& word.charAt(0) <= 'z')&&(word.charAt(1) >= 'a'&& word.charAt(1) <= 'z'))
                {//checking for correctness in "aa-----"
                    for(int i = 2; i < word.length(); i++)
                    {
                        if((word.charAt(i) >= 'A'&& word.charAt(i) <= 'Z'))
                            return false;
                    }
                }
            }
        }
        return true;
    }
}
