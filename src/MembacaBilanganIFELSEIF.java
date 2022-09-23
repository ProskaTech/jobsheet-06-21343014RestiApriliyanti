/*
 * Created by 21343014_Resti Apriliyanti
 */

import java.util.Scanner;

public class MembacaBilanganIFELSEIF {
    public static void main(String[] args) {
        int input;
        Scanner dataMasuk = new Scanner(System.in);

        System.out.print("Masukkan Nilai : ");
        input = dataMasuk.nextInt();

        if (input == 1) {
            System.out.println("Satu");
        }

        else if (input == 2) {
            System.out.println("Dua");
        }

        else if (input == 3) {
            System.out.println("Tiga");
        }

        else if (input == 4) {
            System.out.println("Empat");
        }

        else if (input == 5) {
            System.out.println("Lima");
        }

        else if (input == 6) {
            System.out.println("Enam");
        }

        else if (input == 7) {
            System.out.println("Tujuh");
        }

        else if (input == 8) {
            System.out.println("Delapan");
        }

        else if (input == 9) {
            System.out.println("Sembilan");
        }

        else if (input == 10) {
            System.out.println("Sepuluh");
        }

        else {
            System.out.println("Invalid Number");
        }
    }    
}
