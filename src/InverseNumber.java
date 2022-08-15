import java.util.Scanner;
/*
* 6 1 3 2 5 4  ques
* 6 2 1 4 3 5  ans
* */
public class InverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i =0;
        int op=1;
        while(n!=0){
            int od = n%10;
            int id = op;
            int ip = od;

            i = i+id * (int)Math.pow(10, ip-1);
            n= n/10;
            op++;
        }
        System.out.println(i);
    }
}
