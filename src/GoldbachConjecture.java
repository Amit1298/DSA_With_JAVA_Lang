import java.util.Scanner;

public class GoldbachConjecture {
    public static boolean prime(int n){
        int f=0, i;
        for(i=1; i<=n; i++) {
            if (n % i == 0) {
                f++;
            }
        }
        if(f==2)
            return true;
        else
            return false;

    }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int j=0, i;
            int n;
            int arr[] = new int[50];
            n = sc.nextInt();
            if(n%2!=0){
                System.out.println("Please enter even num");
            }
            else{
                if(n<10 || n>49){
                    System.out.println("Enter between 9 to 50");
                }else{
                    for(i=0; i<50; i++){
                        if(prime(i))
                            arr[j] = 1;
                        j++;
                    }
                    System.out.println("Prime pais number are");
                    for(i=0; i< 50; i++){
                        for(j=1; j<50;j++){
                            if(n==arr[i]+arr[j]){
                                System.out.println(arr[i]+ " "+ arr[j]);
                            }
                        }
                    }
                }
            }
        }
}
