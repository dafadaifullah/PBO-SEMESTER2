/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum090325;

/**
 *
 * @author DAFA
 */
import java.util.Scanner;
import java.util.Random;

public class gabunganarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Masukkan ukuran array A: ");
        int sizeA = input.nextInt();
        int[] arrayA = new int[sizeA];

        System.out.print("Masukkan ukuran array B: ");
        int sizeB = input.nextInt();
        int[] arrayB = new int[sizeB];

        for (int i = 0; i < sizeA; i++) {
            arrayA[i] = random.nextInt(100);
        }

        for (int i = 0; i < sizeB; i++) {
            arrayB[i] = random.nextInt(100);
        }

        int[] arrayC = new int[sizeA + sizeB];
        int index = 0;

        if (sizeA > sizeB) {
            for (int i = 0; i < sizeA; i++) {
                arrayC[index++] = arrayA[i];
            }
            for (int i = 0; i < sizeB; i++) {
                arrayC[index++] = arrayB[i];
            }
        } else {
            for (int i = 0; i < sizeB; i++) {
                arrayC[index++] = arrayB[i];
            }
            for (int i = 0; i < sizeA; i++) {
                arrayC[index++] = arrayA[i];
            }
        }

        System.out.println("Array A: ");
        for (int i = 0; i < sizeA; i++) {
            System.out.print(arrayA[i] + " ");
        }
        System.out.println();

        System.out.println("Array B: ");
        for (int i = 0; i < sizeB; i++) {
            System.out.print(arrayB[i] + " ");
        }
        System.out.println();

        System.out.println("Array C (Gabungan): ");
        for (int i = 0; i < (sizeA + sizeB); i++) {
            System.out.print(arrayC[i] + " ");
        }
        System.out.println();

        input.close();
    }
}