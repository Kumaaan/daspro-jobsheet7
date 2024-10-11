import java.util.Scanner;
public class SiakadFor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai = 0, tertinggi = 0, terandah = 100;
        short lulus = 0, tidakLulus = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + i + " : ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            } if (nilai < terandah) {
                terandah = nilai;
            }
            if (nilai < 60) {
                tidakLulus += 1;
            } else {
                lulus += 1;
            }
        }
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terandah);
        System.out.println("Jumlah mahasiswa lulus : " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + tidakLulus);
        
        sc.close();
    }
}