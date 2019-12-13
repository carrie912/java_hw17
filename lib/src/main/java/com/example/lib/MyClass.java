package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("块计1");
        int A = scanner.nextInt();
        System.out.println("块计2");
        int B = scanner.nextInt();
        System.out.println("块计3");
        int C = scanner.nextInt();
        System.out.println("块计4");
        int D = scanner.nextInt();
        System.out.println("块计5");
        int E = scanner.nextInt();
        int arr[]={A,B,C,D,E};
        int MIN=arr[0];
        for(int i=1;i<5;i++){
            if (arr[i]<MIN){
                MIN=arr[i];
            }
        }
        System.out.print("程琌"+MIN);


    }

}
