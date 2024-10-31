import java.util.Scanner;

public class SearchNilai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai yang akan di input : ");
        int n = sc.nextInt();
        
        int[] arrNilai = new int[n];

        for(int i=0;i<arrNilai.length;i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari : ");
        int key = sc.nextInt();
        System.out.println();

        boolean ketemu = false;
        for(int i=0;i<arrNilai.length;i++) {
            if (arrNilai[i] == key) {
                System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (i+1));
                ketemu = true;
                break;
            }
        }
        if(!ketemu){
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }   
}
