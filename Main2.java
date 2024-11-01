package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Kelas utama yang menjalankan aplikasi toko buku.
 * Mengelola interaksi dengan pengguna untuk memilih buku dan menghitung total harga.
 */
public class Main2 {
    /**
     * Metode utama untuk menjalankan aplikasi toko buku.
     *
     * @param args Argumen baris perintah.
     */
    public static void main(String[] args) {
        System.out.println("a");
        System.out.println("b");
        System.out.println("c");

        Scanner scanner = new Scanner(System.in);
        BookStore bookStore = new BookStore();

        System.out.println("Selamat datang di Toko Buku!");
        bookStore.displayBooks();

        System.out.print("Pilih nomor buku yang ingin dibeli: ");
        int choice = scanner.nextInt();
        double selectedPrice = bookStore.getPrice(choice);

        if (selectedPrice > 0) {
            System.out.print("Masukkan jumlah: ");
            int quantity = scanner.nextInt();
            double total = selectedPrice * quantity * (1 + BookStore.TAX_RATE);
            System.out.println("Total harga (termasuk pajak): Rp" + total);
        }
    }
}