/*
 * Created by 21343014_Resti Apriliyanti
 */

import javax.swing.JOptionPane;

public class NilaiJOptionPane {
    public static void main(String[] args) {
        
        int a=0;
        int b=0;
        int c=0;
        int rata=0;

        String input1="";
        String input2="";
        String input3="";
        String hasil="";
        String smileyFace="";

        input1=JOptionPane.showInputDialog("Nilai1:" );
        input2=JOptionPane.showInputDialog("Nilai2:" );
        input3=JOptionPane.showInputDialog("Nilai3:" );

        a=Integer.parseInt(input1);
        b=Integer.parseInt(input2);
        c=Integer.parseInt(input3);

        rata=(a+b+c)/3;

        if(rata>60) {
            smileyFace=":-)";
        }
        
        else {
            smileyFace=":-(";
        }
            hasil +=(hasil)+("Menghitung Rata-rata")+"\n";
            hasil +="\n";
            hasil +="Nilai 1: "+Integer.toString(a)+"\n";
            hasil +="Nilai 2: "+Integer.toString(b)+"\n";
            hasil +="Nilai 3: "+Integer.toString(c)+"\n";

            hasil +="\n";
            hasil +="Hasil Rata-rata= "+Integer.toString(rata)+"\n"+"\n"+"\n";
            JOptionPane.showMessageDialog(null,hasil+"Ekspresi"+" "+smileyFace);
    }
    
}
