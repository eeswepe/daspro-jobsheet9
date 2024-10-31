import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput : ");
        int n = sc.nextInt();
        int[] nilaiMhs = new int[n];

        for(int i=0;i<n;i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " :");
            nilaiMhs[i] = sc.nextInt();
        }

        int max = nilaiMhs[0];
        int min = nilaiMhs[0];
        int total = 0;
        for(int i=0;i<n;i++) {
            total += nilaiMhs[i];
            if(nilaiMhs[i] > max) {
                max = nilaiMhs[i];
            }
            if(nilaiMhs[i] < min) {
                min = nilaiMhs[i];
            }
        }

        System.out.println("-> Nilai yang telah dimasukkan : ");
        for(int i=0;i<n;i++) {
            System.out.println(" -> Nilai mahasiswa ke-" + (i+1) + " : " + nilaiMhs[i]);
        }

        double rata2 = (double)total / n;
        System.out.println("-> Nilai rata-rata : " + rata2);
        System.out.println("-> Nilai tertinggi : " + max);
        System.out.println("-> Nilai terendah : " + min);
    }
}

