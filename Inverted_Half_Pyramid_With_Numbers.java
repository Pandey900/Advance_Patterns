package advancePatetrns;

import java.util.Scanner;

public class Inverted_Half_Pyramid_With_Numbers {
    public static void inverted_Half_Pyramid_With_Numbers(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n= sc.nextInt();
        inverted_Half_Pyramid_With_Numbers(n);
    }
}
