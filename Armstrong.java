package com.company;
import java.util.*;
public class Armstrong {
    public static void main(String[]args){
        int x=0,y,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        temp=n;
        while (n>0){
            y=n%10;
            n=n/10;
            x=x+(y*y*y);
        }
        if(temp==x){
            System.out.println( temp +" is an Armstrong number.");
        }
        else{
            System.out.println(temp + " is not an Armstrong number.");
        }
    }
}
