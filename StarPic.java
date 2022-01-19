package com.company;

import java.util.Scanner;

public class StarPic {

    public static void ReverseOrder(int size){
        for (int row=size; row>=0; row--){
            for (int col=0; col<row+1; col++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void Pyramid(int size){
        for (int row = 0; row < size; row++){
            for (int col = 0; col < row+1; col++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void Order(int size){
        for (int row=0; row<size; row++){
            for (int col=0; col<row+1; col++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int size = scnr.nextInt();

        Order(size);
        ReverseOrder(size);


    }
}

