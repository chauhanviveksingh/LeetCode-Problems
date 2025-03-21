package leetcode;

import java.util.Scanner;

public class Climbingstairs {


    public static int ClimbStr(int n){
        if (n==1){
            return 1;
        }
        int first=1, second=2, third;
        for(int i=3; i<=n; i++){
            third= first+second;
            first= second;
            second =third;
        }
        return second;
    }
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the total number of stairs to Climb");
        int n= sc.nextInt();
        int third= ClimbStr(n);

        System.out.println("Total Number:"+third);

    }
}
