import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdenamientoBloqueDatos {

    
    /** 
     * @param bloqueDatos
     * @return ArrayList<String>
     */
    public ArrayList<String> ordenarPorUltimoValor(ArrayList<String> bloqueDatos) {

        Collections.sort(bloqueDatos, new Comparator<String>() {
            @Override
            public int compare(String linea1, String linea2) {
                String[] campos1 = linea1.split(",");
                String[] campos2 = linea2.split(",");
                int ultimoValor1 = Integer.parseInt(campos1[campos1.length - 1].substring(3));
                int ultimoValor2 = Integer.parseInt(campos2[campos2.length - 1].substring(3));
                return Integer.compare(ultimoValor1, ultimoValor2);
            }
        });
        return bloqueDatos;
    }
    
}
