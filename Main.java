/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * ALGORITMOS Y ESTRUCTURAS DE DATOS
 * Douglas Barrios
 *
 * Mauricio Julio Rodrigo Lemus Guzmán-22461
 * Hugo Eduardo Rivas Fajardo-22500
 */

import java.io.IOException;
import java.util.ArrayList;


public class Main {
    
    /** 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Archivo manejoArchivo=new Archivo("procesos.txt");
        ArrayList<Proceso> listaEspera=manejoArchivo.leer();
        OrdenamientoBloqueDatos orden=new OrdenamientoBloqueDatos();
        ArrayList<String> listaEsperaAux=new ArrayList<String>();

        for(int i=0;i<listaEspera.size();i++){
            listaEsperaAux.add(listaEspera.get(i).toString());
        }

        listaEsperaAux=orden.ordenarPorUltimoValor(listaEsperaAux);



        System.out.println("---------------------------------------------------------------------------");
        for(int i=0;i<listaEsperaAux.size();i++){
            System.out.println(listaEsperaAux.get(i));
            System.out.println("\n");
        }

        System.out.println("---------------------------------------------------------------------------");
    }
    
}
