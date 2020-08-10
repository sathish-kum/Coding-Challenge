#include<stdio.h>
int main()
{
    int x1,x2,v1,v2;
    scanf("%d %d",&x1,&v1);
    scanf("%d %d",&x2,&v2);
    if(x2>x1&&v2>v1)
    {
        printf("NO");
    }
    else
    {
        while(x2>x1)
        {
            x2=x2+v2;
            x1=x1+v1;
            if(x1==x2)
            {
                printf("YES");
                break;
            }
            if(x1>x2)
            {
                printf("NO");
                break;
            }
        }
    }}
