class Solution {
    public void flip(int a[], int k)
    {
        for(int i = 0; i<a.length; i++)
        {
            if(i>k || i == k)
                break;
            else
            {
                int temp = a[i];
                a[i] = a[k];
                a[k] = temp;
                k--;
            }
        }
    }
    public List<Integer> pancakeSort(int[] A) {
        List<Integer> list = new ArrayList<Integer>(); 
        for(int i = A.length-1; i>=0; i--)
        {
            if(A[i]!=i+1)
            {
                for(int j = i; j>=0; j--)
                {
                    if(A[j] == i+1 && i!=0)
                    {
                        flip(A,j);
                        list.add(j+1);
                        flip(A,i);
                        list.add(i+1);
                    }
                    else if(A[j]==i+1)
                    {
                        flip(A, i);
                        list.add(i+1);
                    }
                }
            }
        }
        return list;
    }
}
