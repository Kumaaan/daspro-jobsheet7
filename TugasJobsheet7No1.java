import java.util.Scanner;
public class TugasJobsheet7No1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tiket, totalTiket = 0;
        double hargaTiket = 50000, totalHarga = 0, totalHargaPembeli, hargaDiskon;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            tiket = sc.nextInt();

            if (tiket > 4 && tiket <= 10) {
                hargaDiskon = (tiket * hargaTiket) * 0.9;

            } else if (tiket > 10) {
                hargaDiskon = (tiket * hargaTiket) * 0.85;

            } else if (tiket <= 4 && tiket > 0) {
                hargaDiskon = hargaTiket * tiket;
            }else {
                 
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi.");
                continue;
            }
            
            totalHargaPembeli = hargaDiskon;
            System.out.println("Total yang harus dibayar: Rp." + totalHargaPembeli);


            totalTiket += tiket;
            sc.nextLine();
            totalHarga += totalHargaPembeli;
        } while (true);

        System.out.println("Total tiket yang terjual: " + totalTiket);
        System.out.println("Total penghasilan hari ini: Rp." + totalHarga);
       
        System.out.println("Semua transaksi selesai");

        sc.close();
    } 
}
