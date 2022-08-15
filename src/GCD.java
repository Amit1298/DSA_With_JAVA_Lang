import java.util.Scanner;

public class GCD {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for(int div=2; div * div <=N; div++ ){
            while(N%div == 0){
                N = N/div;
                count++;
            }
//            if(N%i == 0){
//                int f = N/i;
//                if(i==f)
//                    count = count+1;
//                else
//                    count = count+2;
//            }
        }
        System.out.print(count);
    }
}
