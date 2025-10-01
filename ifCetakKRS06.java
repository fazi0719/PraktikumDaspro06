import java.util.Scanner;
public class ifCetakKRS06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("--- Cetak KRS SIAKAD --- ");
        System.out.println("Apakah UKT sudah lunas? (true/false) : ");
        boolean uktLunas = sc.nextBoolean();
        String ukt = uktLunas ? "Pembayaran UKT terverikasi" : "Registrasi ditolak";
        System.out.println(ukt);

   
    }
    }

