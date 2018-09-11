import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner reader=new Scanner(System.in);
        int n;
        n=reader.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++)
        {
         for(k=1;k<=n-i;k++)
         {
          System.out.printf(" ");
         }
         for(j=1;j<=i;j++)
         {
          System.out.printf("%d",j);
         }
         for(j=1;j<i;j++)
         {
          System.out.printf("%d",i-j);
         }
         System.out.println();
        }
        for(i=n-1;i>0;i--)
        {
         for(k=1;k<=n-i;k++)
         {
          System.out.printf(" ");
         }
         for(j=1;j<=i;j++)
         {
          System.out.printf("%d",j);
         }
         for(j=1;j<i;j++)
         {
          System.out.printf("%d",i-j);
         }
         System.out.println();
        }
    }
}