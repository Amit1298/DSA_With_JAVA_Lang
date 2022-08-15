import java.util.Scanner;
// 0 1 1 2 3 5 8 13 21 34 ........
public class FabonacciNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a= 0;
        int b= 1;

        for(int i=1; i<=N; i++){
            System.out.println(a);
            int c= a+b;

            a=b;
            b=c;

        }
    }
}
