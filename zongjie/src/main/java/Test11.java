import java.util.Scanner;

//class  kinTa{
//    public static void main(String[] args) {
//        test(4);
//
//    }
//
//
//
//    public static void test(int x) {
//        for(int i = 1; i <= x; i++){   //控制行数
//            for(int j = 0; j < x-i;j++){   //每行要打印的空格数
//                System.out.print(" ");
//            }
//            for(int k = 0; k < 2*i-1; k++){   //每行要打印的符号的个数（相对于前一行多两个）
//                System.out.print("*");
//            }
//            System.out.print("\n");   //换行打印
//        }
//    }
//}
public class Test11 {

    public static void main(String[] args) {
        System.out.println("请输入行数:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<=n;i++) {
            for(int j = 0; j < 2*(n-i)-1;j++){   //每行要打印的空格数
                System.out.print(" ");
            }

            for(int k=0;k<2*i-1;k++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }

}