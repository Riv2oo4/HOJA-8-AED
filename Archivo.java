import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Archivo {
    private String nombreArchivo;
    private ArrayList<Proceso> lista;
    private VectorHeap<Proceso> lista2;

    public static int convertirStringAInt(String numeroString) {
        int numeroInt;
        try {
            numeroInt = Integer.parseInt(numeroString);
        } catch (NumberFormatException e) {
            numeroInt = 0;
        }
        return numeroInt;
    }

    public Archivo(String nombre) {
        this.nombreArchivo = nombre;
        this.lista = new ArrayList<Proceso>();
        this.lista2 = new VectorHeap<Proceso>();
    }

    public ArrayList<Proceso> leer() throws IOException {
        File archivo = new File(nombreArchivo);
        FileReader lector = new FileReader(archivo);
        try (BufferedReader lectorBuffer = new BufferedReader(lector)) {
            String linea;
            while ((linea = lectorBuffer.readLine()) != null) {
                String[] lista = linea.split(",");
                if (lista.length != 3) {
                    throw new IllegalArgumentException("Esta mal escrita la linea: " + linea);
                }
                String nombreProceso = lista[0];
                String nombreUsuario = lista[1];
                int nice = convertirStringAInt(lista[2]);
                int prioridad = 0;

                Proceso proc = new Proceso(nombreProceso, nombreUsuario, nice, prioridad);
                this.lista.add(proc);

            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return this.lista;

    }

    public VectorHeap<Proceso> leerHeap() throws IOException {
        File archivo = new File(nombreArchivo);
        FileReader lector = new FileReader(archivo);
        try (BufferedReader lectorBuffer = new BufferedReader(lector)) {
            String linea;
            while ((linea = lectorBuffer.readLine()) != null) {
                String[] lista = linea.split(",");
                if (lista.length != 3) {
                    throw new IllegalArgumentException("Esta mal escrita la linea: " + linea);
                }
                String nombreProceso = lista[0];
                String nombreUsuario = lista[1];
                int nice = convertirStringAInt(lista[2]);
                int prioridad = 0;

                Proceso proc = new Proceso(nombreProceso, nombreUsuario, nice, prioridad);
                this.lista2.add(proc);

            }
            return this.lista2;

        } catch (Exception e) {
            System.out.println(e);
        }
        return lista2;

    }
}
