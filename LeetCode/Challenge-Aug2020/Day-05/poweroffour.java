class Solution {
    public boolean isPowerOfFour(int num) {
        if(num == 1)
            return true;// 4 power 0 == 1 which should return true
        else
        while(num >= 4)
        {
            if(num==4)
                return true;
            if(num%4 != 0)//not a multiple of 4 it is false
                return false;
            num = num/4;
        }
        return false;
    }
}
