import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> a = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i  =1; i< nums.length; i++)
        if(nums[i-1]==nums[i] )
            if(!a.contains(nums[i]))
            a.add(nums[i]);
        return a;
    }
}
