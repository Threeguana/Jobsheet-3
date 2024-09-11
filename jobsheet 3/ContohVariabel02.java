public class ContohVariabel02 {
    public static void main (String[] args){
        String salahSatuHobySayaAdalah = "Bermain Petak Umpet";
        boolean isPandai = true;
        char jenisKelamin = 'P';
        byte umurSayaSekarang = 18;
        double ipk = 3.24, tinggi = 1.78;
        System.out.println("Salah satu hobi saya adalah: " + salahSatuHobySayaAdalah);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umurSayaSekarang);
        System.out.println(String.format("Saya beripk: %s, Dengan tinggi badan: %s", ipk, tinggi));

    }
    
}