import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args){
        int a[][] = new int[3][3], i, j, f=0;
        Scanner sc = new Scanner(System.in);
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                a[i][j] = sc.nextInt();
            }
        }

//        for(i=0; i<3; i++){
//            for(j=0; j< 3; j++){
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                if(i==j && a[i][j]!=1){
                    f= 1;
                    break;
                }
                else if(i!=j && a[i][j]!=0){
                    f=1;
                    break;
                }
            }
        }
        if(f==0)
            System.out.println("martrix is identry");
        else
            System.out.println("No");
    }
}
