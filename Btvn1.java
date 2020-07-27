/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn1;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author HP Pavilion
 */
public class Btvn1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int length, option, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhap phan tu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("1. Chuyen cac phan tu le thanh -1");
        System.out.println("2. In ra phan tu lon nhat");
        System.out.println("3. Chuyen phan tu nho nhat thanh -1");
        System.out.println("4. In ra cac phan tu nho hon 1 so x");
        System.out.println("5. In ra gia tri gan nhat voi x");
        System.out.println("6. Kiem tra su doi xung");
        System.out.println("Nhap vao yeu cau: ");
        option = sc.nextInt();
        switch (option) {
            case 1:
                for (int i = 0; i < length; i++) {
                    if (arr[i] % 2 != 0) {
                        arr[i] = -1;
                    }
                    System.out.print(" " + arr[i]);
                }
                break;
            case 2:
                int max = arr[0];
                for (int i = 0; i < length - 1; i++) {
                    if (arr[i + 1] > arr[i]) {
                        max = arr[i + 1];
                    }
                }
                System.out.println("Phan tu lon nhat: " + max);
                break;
            case 3:
                int min = arr[0];
                for (int i = 0; i < length - 1; i++) {
                    if (arr[i + 1] < arr[i]) {
                        min = arr[i + 1];
                    }
                    min = -1;
                }
                break;
            case 4:
                System.out.println("Nhap x: ");
                x = sc.nextInt();
                for (int i = 0; i < length; i++) {
                    if (arr[i] < x) {
                        System.out.println(" " + arr[i]);
                    }
                }
                break;
            case 5:
                System.out.println("Nhap x: ");
                x = sc.nextInt();
                min = arr[0];
                for (int i = 0; i < length - 1; i++) {
                    if (abs(x - arr[i + 1]) < abs(x - arr[i])) {
                        min = arr[i + 1];
                    }
                }
                System.out.println(" " + min);
                break;
            case 6:
                boolean bool = false;
                if (length % 2 == 0) {
                    for (int j = 0; j < length / 2; j++) {
                        if (arr[j] == arr[length - 1 - j]) {
                            bool = true;
                        }
                    }
                }
                if (bool == true) {
                    System.out.println("Day doi xung");
                } else {
                    System.out.println("Day khong doi xung");
                }
                break;
        }
    }
}
