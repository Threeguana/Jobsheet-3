import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double SaldoAwal = 5000000;

        System.out.println("Saldo awal: " + SaldoAwal);
        System.out.print("Masukkan jumlah penarikan: ");
        double JumlahPenarikan = scanner.nextDouble();

        if (JumlahPenarikan <= SaldoAwal) {
            SaldoAwal -= JumlahPenarikan;
            System.out.println("Transaksi berhasil. Saldo akhir: " + SaldoAwal);
        } else {
            System.out.println("Saldo tidak mencukupi untuk melakukan penarikan");
        }
    }
}