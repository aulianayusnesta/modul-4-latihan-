
import java.util.Scanner;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String teks = "";

        while (true) {
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membaca newline setelah input angka

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan teks: ");
                    teks = scanner.nextLine();
                    System.out.println("Teks telah dimasukkan!\n");
                    break;

                case 2:
                    int jumlahKarakter = teks.length();
                    System.out.println("Jumlah karakter dalam teks: " + jumlahKarakter + "\n");
                    break;

                case 3:
                    String[] kataArray = teks.split("\\s+");
                    int jumlahKata = kataArray.length;
                    System.out.println("Jumlah kata dalam teks: " + jumlahKata + "\n");
                    break;

                case 4:
                    System.out.print("Masukkan kata yang ingin dicari: ");
                    String kataDicari = scanner.nextLine();
                    int jumlahKemunculan = hitungKemunculan(teks, kataDicari);
                    System.out.println("Kata '" + kataDicari + "' ditemukan sebanyak " + jumlahKemunculan + " kali dalam teks.\n");
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan program Teks Analisis!");
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih angka 1-5.\n");
                    break;
            }
        }
    }

    private static int hitungKemunculan(String teks, String kata) {
        int count = 0;
        String[] kataArray = teks.split("\\s+");

        for (String k : kataArray) {
            if (k.equalsIgnoreCase(kata)) {
                count++;
            }
        }

        return count;
    }
}