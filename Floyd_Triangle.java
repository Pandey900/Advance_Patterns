package advancePatetrns;

import java.util.Scanner;

public class Floyd_Triangle {
    public static void floyd_Triangle(int n){
        int count=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n= sc.nextInt();
        floyd_Triangle(n);
    }
}
