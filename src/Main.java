import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        byte num1 = -12;
        System.out.println(num1);  //range -128 to 127
        short num2 = 56;
        System.out.println(num2);
        int num = 8;
        System.out.println(num);
        int Num = 10;
        System.out.println(Num);
        long num3 = 123456678908765423l;
        System.out.println(num3);
        float num4 = 3.72637861831355658988f;
        System.out.println(num4);
        double num5 = 7.233873455437878384742434;
        System.out.println(num5);
        char A = 'A';
        char M = 'M';
        char I = 'I';
        char T = 'T';
        System.out.print(A);
        System.out.print(M);
        System.out.print(I);
        System.out.println(T);
        String fname = "Krishna";
        System.out.println(fname);
        System.out.println("Taking input from User: ");
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter the num1: ");
//        int number1 = sc.nextInt();
//        System.out.print("Enter the num2: ");
//        int number2 = sc.nextInt();
//        int sum = number1+number2;
//        System.out.print("Sum of two number is: ");
//        System.out.println(sum);
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);

//        String name = sc.next();
        String name = sc.nextLine();  //it write the complete sentances
        System.out.println(name);



//       int square = 0;
//        float mean = 0;
//        float root = 0;
//        int arr[] = {1, 2, 3, 4};
//        int n = arr.length;
//
//        for(int i=0;i<n;i++){
//            square += Math.pow(arr[i], 2);
//        }
//        mean = (square/(float) n);
//        root = (float)Math.sqrt(mean);
//        System.out.println(root);


    }
}