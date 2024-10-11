import java.util.Scanner;
public class KafeDoWhile01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        String namaPelanggan;

        do {
            System.out.print("Masukan Nama Pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Tranaksi dibatalkan.");
                break;
            }

            System.out.print("Jumlah kopi\t: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh\t: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti\t: ");
            roti = sc.nextInt();

            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp." + totalHarga);
            sc.nextLine();

        } while (true);

        System.out.println("Semua transaksi selesai");

        sc.close();
    }
}
