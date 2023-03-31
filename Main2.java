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


public class Main2 {
    
    /** 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Archivo manejoArchivo=new Archivo("procesos.txt");
        VectorHeap<Proceso> listaEspera=manejoArchivo.leerHeap();

        System.out.println("---------------------------------------------------------------------------");
        listaEspera.printElements();

        System.out.println("---------------------------------------------------------------------------");
    }
    
}
