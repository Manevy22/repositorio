package PROGRAMACIÓNii.REPASO.EJ5;

public class PAPEL {
    private StringBuilder texto = new StringBuilder();

    public void escribir(String palabras) {
        texto.append(palabras);
    }

    @Override
    public String toString() {
        return texto.toString();
    }
}



