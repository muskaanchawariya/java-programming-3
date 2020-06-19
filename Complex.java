package com.company;
import java.util.Scanner;
public class Complex {
    int real1, real2, img1, img2, res1, res2;
    Complex(){

    }
    Complex(int real1, int real2, int img1, int img2, int res1, int res2){
        this.real1= real1;
        this.real2=real2;
        this.img1=img1;
        this.img2=img2;
        this.res1=res1;
        this.res2=res2;
    }
    void add(){
        res1=real1+real2;
        res2=img1+img2;
        System.out.println("The addition of the two complex numbers is "+ res1 + "+i"+res2);
    }
    void sub(){
        res1=real2-real1;
        res2=img2-img1;
        System.out.println("The subtraction of the two complex numbers is "+ res1+ "+i"+res2);
    }
    void mul(){
        res1=real1*real2;
        res2=img1*img2;
        System.out.println("The product of the two complex numbers is "+res1+ "+i"+res2);
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int real1,real2,img1,img2,res1=0,res2=0;
        System.out.println("Enter the real part of number 1:");
        real1=sc.nextInt();
        System.out.println("Enter the imaginary part of number 1:");
        img1=sc.nextInt();
        System.out.println("Enter the real part of number 2:");
        real2=sc.nextInt();
        System.out.println("Enter the imaginary part of number 2:");
        img2=sc.nextInt();
        Complex res= new Complex(real1,real2,img1,img2,res1,res2);
        res.add();
        res.sub();
        res.mul();
    }
}
