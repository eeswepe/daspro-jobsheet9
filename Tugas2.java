import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int n = sc.nextInt();

        String[] pesanan = new String[n];
        int[] harga = new int[n];

        int total = 0;

        for(int i=0;i<n;i++) {
            System.out.print("Masukkan nama makanan/minuman ke-" + (i+1) + " : ");
            pesanan[i] = sc.next();
            System.out.print("Masukkan harga makanan/minuman ke-" + (i+1) + " : ");
            harga[i] = sc.nextInt();
            total += harga[i];
        }

        System.out.println();

        for(int i=0;i<n;i++) {
            System.out.println((i+1) + ". " + pesanan[i] + " - " + harga[i]);
        }

        System.out.println();

        System.out.println("Total biaya: " + total);
    }
}
