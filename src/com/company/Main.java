package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b= sc.nextInt();
        UnaryOperator unaryOperator= a -> Math.sqrt(b);
        System.out.println(unaryOperator.sqrt(b));


    }
}
