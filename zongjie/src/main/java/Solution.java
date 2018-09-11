import java.io.File;

public class Solution {
    public static int Fibonacci(int n) {
        if(n<0)
            return -1;
        int a=1,b=1,c=0;
        if(n==1||n==2)
        {
            return 1;
        }else 
        {
            for(int i=3;i<=n;i++)
            {
                c=a+b;
                b=a;
                a=c;
            }
        }
          return c;
    }

    public static void main(String[] args) {
        File file = new File();
        file.length();
        int fibonacci = Fibonacci(4);
        System.out.println(fibonacci);
    }
}