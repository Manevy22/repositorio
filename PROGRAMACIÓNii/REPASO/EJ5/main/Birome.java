package PROGRAMACIÓNii.REPASO.EJ5;

public class Birome {
    private int cantidadDeTinta;

    public Birome(int tinta) {
        cantidadDeTinta = tinta;
    }
    public String escribir(String texto, PAPEL papel) {
        int letrasEscritas = texto.length();
        if (cantidadDeTinta >= letrasEscritas) {
            cantidadDeTinta -= letrasEscritas;
            papel.escribir(texto);
            return papel.toString();
        } else {
            return "Se acabó la tinta";
        }
    }
public int getCantidadDeTinta() {
        return cantidadDeTinta;
        }
        }

//crear un constructor que reciba la cantidad de tinta a usar.
//en el main ese numero se carga.

