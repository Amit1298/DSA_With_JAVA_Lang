import java.util.Scanner;

public class PracticeSet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a[] = new int[T];
        for(int i=0;i<T; i++){
            a[i] = sc.nextInt();
        }

        for(int k=0; k< a.length; k++){
            int add = sum(a[k]);
            System.out.println(add);
        }
    }

    static int sum(int c){
        int count=0;
        for(int j=1; j<c ; j++){
            if(c%j == 0){
                if(c%2 ==0 ){
                    count = count+1;
                }
            }
        }
        return count;
    }
}
