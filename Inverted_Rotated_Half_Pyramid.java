package advancePatetrns;

import java.util.Scanner;

public class Inverted_Rotated_Half_Pyramid{
    public static void invertedRotatedHalfPyramid(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n= sc.nextInt();
        invertedRotatedHalfPyramid(n);
    }
}
