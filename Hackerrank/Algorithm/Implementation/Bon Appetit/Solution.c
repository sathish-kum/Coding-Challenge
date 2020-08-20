#include<stdio.h>
int main()
{
    int n,k,i;
    scanf("%d%d",&n,&k);
    int a[n];
    int sum=0;
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        if(i==k)
        {
            sum=sum;
        }
        else
        {
            sum=sum+a[i];
        }
    }
    int half=sum/2;
    int c;
    scanf("%d",&c);
    if(half<c)
    {
        int ans=c-half;
        printf("%d",ans);
    }
    else
    {
        printf("Bon Appetit");
    }
    return 0;
}
