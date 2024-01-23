package advancePatetrns;

import java.util.Scanner;

public class HollowPatterns {
    public static void hollowRectangle(int tot_Rows,int tot_Columns){
        for (int i=1;i<=tot_Rows;i++){
            for (int j=1;j<=tot_Columns;j++){
                if (i==1 || i==tot_Rows || j==1 || j==tot_Columns){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total rows:");
        int totRows= sc.nextInt();
        System.out.println("Enter the total columns:");
        int totColumns= sc.nextInt();
        hollowRectangle(totRows,totColumns);
    }
}
