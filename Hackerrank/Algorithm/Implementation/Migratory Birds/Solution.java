import java.util.*;
public class migratory 
{ static int migratory(int ar[], int n)
{
    Arrays.sort(ar);
  return ar[n-1];  
}
public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int ar[] = new int[n];
    int arr[] = new int[n];
    Arrays.fill(ar, 0);
    for(int i = 0; i < n; i++)
    {
        int temp = in.nextInt();
        ar[temp]++;
        arr[temp]++;
    }
    int max = migratory(ar,n);
    //System.out.println(Arrays.toString(arr));
    for(int i = 0; i < n ;i++)
    {
        if(arr[i] == max)
        {
            System.out.println(i);
        break;
    }
}
}
}
