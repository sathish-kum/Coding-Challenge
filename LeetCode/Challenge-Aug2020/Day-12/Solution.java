class Solution
{
public List<Integer> getRow(int rowIndex) {
	List<Integer> list = new ArrayList<Integer>();
    int arr[] = new int[40];
    int k = 0;
    for(int i = 0; i<= rowIndex; i++)
    {
        if(i==0)
            list.add(1);
        else if(i==1)
        {
            list.clear();
            list.add(1);
            list.add(1);
        }
        else
        {
            arr[0] = 1;
            k =1;
            for(int j = 1; j<i;j++)
                arr[k++] = list.get(j-1)+list.get(j);
            list.clear();
            for(int c = 0; c< k ; c++)
                list.add(arr[c]);
            list.add(1);
        }
    }
    return list;
}
}
