#include<stdio.h>
int main()
{
    int k,n,c=0,i,j;
    scanf("%d %d",&n,&k);
    int a[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        for(j=1;j<n;j++)
        {
            if(i<j)
            {
                if((a[i]+a[j])%k==0)
                {
                    c++;
                }
            }
        }
    }
    printf("%d\n",c);
    return 0;
}
