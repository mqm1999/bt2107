/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn2;

import java.util.Scanner;

/**
 *
 * @author HP Pavilion
 */
public class Btvn2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Nhap phan tu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Cac phan tu o vi tri chan: ");
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.print(" " + arr[i]);
            }
        }
        System.out.println("");
        System.out.print("Cac phan tu o vi tri le: ");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + arr[i]);
            }
        }
        System.out.println("");
        boolean bool = false;
        System.out.print("Cac phan tu chia het cho 2: ");
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(" " + arr[i]);
                bool = true;
            }
        }
        if (bool == false) {
            System.out.print("Khong co phan tu nao");
        }
        System.out.println("");
        bool = false;
        System.out.print("Cac phan tu chia 5 du 1: ");
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 5 == 1) {
                System.out.print(" " + arr[i]);
                bool = true;
            }
        }
        if (bool == false) {
            System.out.print("Khong co phan tu nao");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("Tong cac so chan: " + sum);
    }
}
