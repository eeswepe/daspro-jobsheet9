import java.util.Scanner;
public class ArrayRataNilai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        int mhsLulus = 0;
        double mhsTidakLulus = 0; 
        double totalNilaiLulus = 0;
        int totalNilaiTidakLulus = 0;
        double rataNilaiLulus = 0;
        double rataNilaiTidakLulus = 0;

        for(int i=0;i<nilaiMhs.length;i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " :");
            nilaiMhs[i] = sc.nextInt();
        }

        for(int i=0;i<nilaiMhs.length;i++){
            if(nilaiMhs[i] > 70){
                mhsLulus++;
                totalNilaiLulus += nilaiMhs[i];
            }else{
                mhsTidakLulus++;
                totalNilaiTidakLulus +=nilaiMhs[i];
            }
        }
        
        rataNilaiLulus = totalNilaiLulus / mhsLulus;
        rataNilaiTidakLulus = totalNilaiTidakLulus / mhsTidakLulus;

        System.out.println("Rata-rata nilai lulus = " + rataNilaiLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataNilaiTidakLulus);
    }
}
