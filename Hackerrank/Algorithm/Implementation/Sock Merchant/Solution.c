#include<stdio.h>
int main()
{
    int i,j,n;
    int t=0;
    scanf("%d",&n);
    int a[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    for(i=0;i<n;i++)
    {

        if(a[i]==a[i+1])
        {
            t++;
            i++;
        }
    
    }
    printf("%d",t);
    return 0;
}
