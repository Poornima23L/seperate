package com.tgt.ignite.plus;

import java.util.Scanner;

public class sererate {
    public static void main(String[] args){
        double val,w_num,dec;
        Scanner read = new Scanner(System.in);
        System.out.println("enter a number");
        val= read.nextDouble();
        dec= val%1;
        w_num= val-dec;
        System.out.println("whole number:" +w_num);
        System.out.println("decimeal part :" +dec);
    }
}
