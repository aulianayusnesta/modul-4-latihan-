
import java.util.Scanner;




public class Kalkulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        double angka1, angka2, hasil;
        boolean ulang = true;

        while (ulang) {
            System.out.println("Program Kalkulator Java");
            System.out.println("1. Akar kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma ");
            System.out.println("4. Faktorial");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan Anda (1/2/3/4/5): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka yang ingin diakar kuadratkan: ");
                    angka1 = input.nextDouble();
                    hasil = Math.sqrt(angka1);
                    System.out.println("Akar kuadrat dari " + angka1 + " adalah " + hasil);
                    break;
                case 2:
                    System.out.print("Masukkan angka yang ingin dipangkatkan: ");
                    angka1 = input.nextDouble();
                    System.out.print("Masukkan pangkat yang diinginkan: ");
                    angka2 = input.nextDouble();
                    hasil = Math.pow(angka1, angka2);
                    System.out.println(angka1   + " pangkat " + angka2 + " adalah " + hasil);
                    break;
                case 3:
                    System.out.print("Masukkan angka yang ingin dihitung logaritmanya: ");
                    angka1 = input.nextDouble();
                    hasil = Math.log(angka1);
                    System.out.println("Logaritma natural dari " + angka1 + " adalah " + hasil);
                    break;
                case 4:
                    System.out.print("Masukkan angka yang ingin dihitung factorialnya: ");
                    angka1 = input.nextDouble();
                    hasil = factorial(angka1);
                    System.out.println("Factorial dari " + angka1 + " adalah " + hasil);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    ulang = false;
                    break;
                default:
                    System.out.println("Pilihan Anda salah. Silakan masukkan angka 1-5.");
                    break;
            }
        }
    }

    // metode untuk menghitung factorial dari sebuah angka
    public static double factorial(double angka) {
        if (angka == 0 || angka == 1) { // basis rekursif, jika angka adalah 0 atau 1, maka factorialnya adalah 1
            return 1;
        } else { //  rekursif, jika angka lebih dari 1, maka factorialnya adalah angka dikali dengan factorial dari angka-1
            return angka * factorial(angka - 1);
        }
    }
}