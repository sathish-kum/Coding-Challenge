import java.util.*;
class Solution {
    int count = 0;
    ArrayList<Integer>list = new ArrayList<Integer>();
    public int pathSum(TreeNode root, int sum) {
 getSum(root, sum);
        return count;
    }
    public void getSum(TreeNode root, int sum)
    {
        if(root == null)
            return;
        list.add(root.val);
        getSum(root.left, sum);
        getSum(root.right, sum);
        int temp = 0;
        for(int i = list.size()-1;i>=0;i--)
        {
            temp+=list.get(i);
            if(temp == sum)
                count++;
        }
        list.remove(list.size()-1);
    }
}
