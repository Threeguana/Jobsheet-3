import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int nilaiTugas;
        int nilaiUTS;
        int nilaiUAS;
        double rata_rata;

        System.out.print("Nilai tugas: ");
        nilaiTugas = input.nextInt();

        System.out.print("Nilai UTS: ");
        nilaiUTS = input.nextInt();

        System.out.print("Nilai UAS: ");
        nilaiUAS = input.nextInt();

        rata_rata = nilaiTugas + nilaiUTS + nilaiUAS;
        double nilai_akhir = rata_rata / 3;

        System.out.print("Rata-rata nilai: " + nilai_akhir);

    }
}