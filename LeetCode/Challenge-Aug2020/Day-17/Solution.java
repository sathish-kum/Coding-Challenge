class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int i = 0;
        //no. of candies to give
        int c = 1;
        //total count of candies issued
        int t = 0;
        int[] a = new int[num_people];
        while(true)
        {
            t = t+c;
            if(t <= candies)
                a[i] = a[i] + c;
            //if candies goes beyond the limit
            else
            {
                t = t - c;
                a[i] = a[i] + Math.abs(t-candies);
                break;
            }
            c++;
            i++;
            if(i==num_people)
                i=0;
        }
        return a;
    }
}
