package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("��J�Ʀr1");
        int A = scanner.nextInt();
        System.out.println("��J�Ʀr2");
        int B = scanner.nextInt();
        System.out.println("��J�Ʀr3");
        int C = scanner.nextInt();
        System.out.println("��J�Ʀr4");
        int D = scanner.nextInt();
        System.out.println("��J�Ʀr5");
        int E = scanner.nextInt();
        int arr[]={A,B,C,D,E};
        int MIN=arr[0];
        for(int i=1;i<5;i++){
            if (arr[i]<MIN){
                MIN=arr[i];
            }
        }
        System.out.print("�̤p�ȬO"+MIN);


    }

}
