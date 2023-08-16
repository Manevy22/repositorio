package PROGRAMACIÓNii.REPASO.EJ5.main;
import PROGRAMACIÓNii.REPASO.EJ5.Birome;
import PROGRAMACIÓNii.REPASO.EJ5.PAPEL;
import java.util.Scanner;

public class TEXTO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos a escribir un texto");
        System.out.println("Ingrese los gramos de tinta:");
        int cant = scanner.nextInt();
        String text;
        Birome b = new Birome(cant);
        PAPEL papel = new PAPEL();
        while (cant > 0) {
            System.out.println("Escribir:");
            text = scanner.next();
            text= b.escribir(text, papel);
            System.out.println(text);
            cant = b.getCantidadDeTinta();
            System.out.println("Tinta restante: " + cant + " gramos");
        }
    }
}