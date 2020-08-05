class Solution {
    public boolean isPowerOfFour(int num) {
        if(num == 1)
            return true;
        else
        while(num >= 4)
        {
            if(num==4)
                return true;
            if(num%4 != 0)
                return false;
            num = num/4;
        }
        return false;
    }
}
