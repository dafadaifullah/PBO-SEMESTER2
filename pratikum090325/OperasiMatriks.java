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

public class OperasiMatriks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        char ulang;
        
        do {
            System.out.println("=== Program Matriks ===");
            System.out.println("1. Tambah\n2. Kurang\n3. Kali\n4. Identitas\n5. Transpose\n6. Exit");
            System.out.print("Pilih Program: ");
            int menu = in.nextInt();
            
            if (menu >= 1 && menu <= 5) {
                System.out.print("Masukkan jumlah baris matriks M: ");
                int bM = in.nextInt();
                System.out.print("Masukkan jumlah kolom matriks M: ");
                int kM = in.nextInt();
                System.out.print("Masukkan jumlah baris matriks N: ");
                int bN = in.nextInt();
                System.out.print("Masukkan jumlah kolom matriks N: ");
                int kN = in.nextInt();
                
                int[][] M = generateMatrix(bM, kM, rand);
                int[][] N = generateMatrix(bN, kN, rand);
                
                System.out.println("Matriks M:");
                printMatrix(M);
                System.out.println("Matriks N:");
                printMatrix(N);
                
                switch (menu) {
                    case 1 -> tambahMatriks(M, N, bM, kM, bN, kN);
                    case 2 -> kurangMatriks(M, N, bM, kM, bN, kN);
                    case 3 -> kaliMatriks(M, N, bM, kM, kN);
                    case 4 -> identitasMatriks(M, N, bM, kM, bN, kN);
                    case 5 -> transposeMatriks(M, N, bM, kM, bN, kN);
                }
            } else if (menu == 6) {
                System.out.println("kamu telah keluar dari program.");
                break;
            } else {
                System.out.println("Pilihan tidak tersedia.");
            }
            
            System.out.print("Apakah ingin mengulang? (y/n): ");
            ulang = in.next().charAt(0);
        } while (ulang == 'y');
    }
    
    static int[][] generateMatrix(int rows, int cols, Random rand) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10) + 1;
            }
        }
        return matrix;
    }
    
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
    
    static void tambahMatriks(int[][] M, int[][] N, int bM, int kM, int bN, int kN) {
        if (bM != bN || kM != kN) {
            System.out.println("Opps! tidak sesuai untuk penjumlahan.");
            return;
        }
        System.out.println("Hasil Penjumlahan:");
        int[][] result = new int[bM][kM];
        for (int i = 0; i < bM; i++) {
            for (int j = 0; j < kM; j++) {
                result[i][j] = M[i][j] + N[i][j];
            }
        }
        printMatrix(result);
    }
    
    static void kurangMatriks(int[][] M, int[][] N, int bM, int kM, int bN, int kN) {
        if (bM != bN || kM != kN) {
            System.out.println("Opps! tidak sesuai untuk pengurangan.");
            return;
        }
        System.out.println("Hasil Pengurangan:");
        int[][] result = new int[bM][kM];
        for (int i = 0; i < bM; i++) {
            for (int j = 0; j < kM; j++) {
                result[i][j] = M[i][j] - N[i][j];
            }
        }
        printMatrix(result);
    }
    
    static void kaliMatriks(int[][] M, int[][] N, int bM, int kM, int kN) {
        if (kM != N.length) {
            System.out.println("Jumlah kolom M harus sama dengan jumlah baris N.");
            return;
        }
        System.out.println("Hasil Perkalian:");
        int[][] result = new int[bM][kN];
        for (int i = 0; i < bM; i++) {
            for (int j = 0; j < kN; j++) {
                for (int k = 0; kM > k; k++) {
                    result[i][j] += M[i][k] * N[k][j];
                }
            }
        }
        printMatrix(result);
    }
    
    static void identitasMatriks(int[][] M, int[][] N, int bM, int kM, int bN, int kN) {
        if (bM == kM) {
            System.out.println("Matriks Identitas M:");
            printMatrix(identitas(bM));
        } else {
            System.out.println("M bukan matriks persegi.");
        }
        if (bN == kN) {
            System.out.println("Matriks Identitas N:");
            printMatrix(identitas(bN));
        } else {
            System.out.println("N bukan matriks persegi.");
        }
    }
    
    static int[][] identitas(int size) {
        int[][] id = new int[size][size];
        for (int i = 0; i < size; i++) {
            id[i][i] = 1;
        }
        return id;
    }
    
    static void transposeMatriks(int[][] M, int[][] N, int bM, int kM, int bN, int kN) {
        System.out.println("Transpose Matriks M:");
        printMatrix(transpose(M, kM, bM));
        System.out.println("Transpose Matriks N:");
        printMatrix(transpose(N, kN, bN));
    }
    
    static int[][] transpose(int[][] matrix, int newRows, int newCols) {
        int[][] result = new int[newRows][newCols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}