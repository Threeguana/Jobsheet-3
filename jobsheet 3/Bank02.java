import java.util.Scanner;
public class Bank02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int jlm_tabungan_awal, lama_menabung;
        double prosentase_bunga = 0.02, bunga, jlm_tabungan_akhir;
        System.out.println("masukkan jumlah tabungan awal anda: ");
        jlm_tabungan_awal = input.nextInt();
        System.out.println("masukkan lama menabung anda: ");
        lama_menabung = input.nextInt();
        bunga = lama_menabung * prosentase_bunga * jlm_tabungan_awal;
        jlm_tabungan_akhir = bunga + jlm_tabungan_awal;
        System.out.println("Bunga adalah: " + bunga);
        System.out.println("Jumlah tabungan akhir anda adalah: " + jlm_tabungan_akhir);

    }
    
}