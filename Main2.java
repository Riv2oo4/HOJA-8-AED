import java.io.IOException;
import java.util.ArrayList;


public class Main2 {
    public static void main(String[] args) throws IOException {
        Archivo manejoArchivo=new Archivo("procesos.txt");
        VectorHeap<Proceso> listaEspera=manejoArchivo.leerHeap();

        System.out.println("---------------------------------------------------------------------------");
        listaEspera.printElements();

        System.out.println("---------------------------------------------------------------------------");
    }
    
}
