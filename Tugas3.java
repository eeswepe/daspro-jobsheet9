import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar",
        "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String cari = sc.nextLine();

        int index = -1;
        for(int i=0;i<menu.length;i++) {
            if(menu[i].equals(cari)) {
                index = i;
                break;
            }
        }

        if(index == -1) {
            System.out.println("Makanan yang dicari tidak ada di menu.");
        } else {
            System.out.println("Makanan yang dicari tersedia di menu.");
        }
    }
}

