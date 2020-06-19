package com.company;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Pattern2 {
    int x,y;
    void pattern(int n,int k){
        if(Math.abs(n)<=y){
            if(n>0){
                System.out.print(" "+ n);
                pattern(n-k,k);
            }
            if(n<=0){
                x=n;
                System.out.print(" "+x);
                x=Math.abs(x);
                while(Math.abs(x)<y){
                    x=x-k;
                    System.out.print(" "+Math.abs(x));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        System.out.println("Enter k: ");
        int k=sc.nextInt();
        Pattern2 p=new Pattern2();
        p.y=n;
        p.pattern(n,k);
    }
}
