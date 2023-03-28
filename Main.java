import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {
        Archivo manejoArchivo=new Archivo("procesos.txt");
        ArrayList<Proceso> listaEspera=manejoArchivo.leer();
        for(int i=0;i<listaEspera.size();i++){

            System.out.println(listaEspera.get(i));
        }
    }
    
}
