class Solution {
    public int[] sortArrayByParity(int[] A) {
        int i, j;
        for(i = 0; i< A.length; i++)
            if(A[i]%2 != 0)
                for(j = i+1; j< A.length; j++)
                    if(A[j]%2 == 0)
                    {
                        int temp;
                        temp = A[i];
                        A[i] = A[j];
                        A[j] = temp;
                    }
        return A;
    }
}
