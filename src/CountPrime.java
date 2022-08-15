import java.util.Arrays;
import java.util.Scanner;

public class CountPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count= 0;
        boolean isPrime[] = seiveOfEratoSthenes(num);
        for(int i= 0; i<=num; i++){
         System.out.println(i+ " "+ isPrime[i]);
            if(isPrime[i]==true)
                count++;
        }

        System.out.print(count);

    }
    static boolean[] seiveOfEratoSthenes(int n){
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] =false;
        isPrime[1]=false;
        for(int i=2; i*i<=n; i++){
            for(int j=2*i; j<=n; j+=i){
                isPrime[j] = false;
            }
        }
        return  isPrime;
    }
}







//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int c = 0,i ,j;
//        int l = sc.nextInt();
//        int h = sc.nextInt();
//        for(i=l; i<=h;i++){
//            for(j=2; j<i; j++)
//                if(i%j==0)
//                    break;
//            if(i==j)
//                c++;
//        }
//        System.out.print(c);
//    }





//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int count = 0;
//
//        for(int i=num1; i<=num2; i++){
//            int n = i;
//            int a = 2;
//            int temp = 0;
//            while(a<=(n/2)){
//                if((n%a)==0){
//                    temp++;
//                    break;
//                }
//                a++;
//            }
//            if(temp == 0&& i!=1){
//                count++;
//            }
//        }
//        System.out.print(count);