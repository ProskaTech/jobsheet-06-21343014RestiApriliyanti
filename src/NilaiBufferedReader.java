/*
 * Created by 21343014_Resti Apriliyanti
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NilaiBufferedReader {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
        
        String a, b, c;
        float nilai1, nilai2, nilai3, ratarata;
        System.out.println("Program Penjumlahan Dua Bilangan");

        try {
            System.out.print("Masukkan Nilai Pertama : ");
            a = dataIn.readLine();
            nilai1 = Float.parseFloat(a);

            System.out.print("Masukkan Nilai Kedua : ");
            b = dataIn.readLine();
            nilai2 = Float.parseFloat(b);

            System.out.print("Masukkan Nilai Ketiga : ");
            c = dataIn.readLine();
            nilai3 = Float.parseFloat(c);

            ratarata = (nilai1 + nilai2 + nilai3) / 3;
            System.out.print("Nilai Rata-rata : " +ratarata);

            if (ratarata > 60)
                System.out.println(" :-) ");
            else 
                System.out.println(" :-( ");

        }

        catch (IOException e) {
            System.out.println("Gagal Membaca Keyboard");
        } 
        
    }
}
