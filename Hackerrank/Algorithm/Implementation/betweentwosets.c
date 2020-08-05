#include<stdio.h>
int main(void)
{
    int n,f,d,i;
    scanf("%d",&n);
    int a[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
    
        if((n<61&&n>0)&&(a[i]>-1&&a[i]<101))
        {
            if(a[i]<38)
            {
                printf("%d\n",a[i]);
            }
            else
            {
                f=a[i];
                if((f%5)==0)
                {
                    printf("%d\n",f);
                }
                else
                {
                    
                
                  while((f%5)!=0)
                  {
                      f++;
                  
                }
                d=f-a[i];
                if(d<3)
                {
                    a[i]=f;
                    printf("%d\n",a[i]);
                }
                else
                {
                    printf("%d\n",a[i]);
                }
                
            }
                 
            }
        }
        else
        {
            printf("invalid entry...");
        }
    
    }
}
