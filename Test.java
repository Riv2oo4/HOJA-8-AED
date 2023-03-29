import java.io.IOException;
import java.util.ArrayList;

public class Test{
    public Test(){}

    public void testVectorHeap(){
        System.out.println("-----------------------------Prueba vector heap -------------------------------------");
        VectorHeap pruebaVectorHeap=new VectorHeap<>();
        pruebaVectorHeap.add(50);
        pruebaVectorHeap.percolateUp(0);
        pruebaVectorHeap.pushDownRoot(0);
        pruebaVectorHeap.isEmpty();
        pruebaVectorHeap.size();
        pruebaVectorHeap.printElements();
        System.out.println("---------------------------------------------------------------------");
        
    }
    
    public void testProceso(){
        System.out.println("------------------------------Prueba proceso-----------------------");
        Proceso pruebaProceso=new Proceso("Prueba", "prueba2", 20, 120);
        System.out.println(pruebaProceso.getNombreProceso());
        System.out.println(pruebaProceso.getNombreUsuario());
        System.out.println(pruebaProceso.getNiceValue());
        System.out.println(pruebaProceso.getPrioridad());
        System.out.println("---------------------------------------------------------------------");
    }

    public void testOrdenamiento(){
        System.out.println("------------------------Prueba de ordenamiento----------------------------");
        OrdenamientoBloqueDatos ordenPrueba=new OrdenamientoBloqueDatos();
        ArrayList<Proceso> listaPrueba=new ArrayList<Proceso>();
        listaPrueba.add(new Proceso("prueba1", "prueba1", 20, 0));
        listaPrueba.add(new Proceso("prueba2", "prueba2", 50, 0));
        listaPrueba.add(new Proceso("prueba3", "prueba3", 70, 0));
        listaPrueba.add(new Proceso("prueba4", "prueba4", 10, 0));

        ArrayList<String> listaEsperaAux=new ArrayList<String>();

        for(int i=0;i<listaPrueba.size();i++){
            listaEsperaAux.add(listaPrueba.get(i).toString());
        }

        listaEsperaAux=ordenPrueba.ordenarPorUltimoValor(listaEsperaAux);

        for(int i=0;i<listaPrueba.size();i++){
            System.out.println(listaPrueba.get(i));
        }
        System.out.println("---------------------------------------------------------------------");

    }

    public void testArchivo() throws IOException{
        System.out.println("--------------------------Prueba archivo--------------------------------");
        Archivo manejoArchivo=new Archivo("procesos.txt");
        ArrayList<Proceso> listaEspera=manejoArchivo.leer();
        for(Proceso i:listaEspera){
            System.out.println(i.toString());

        }
        System.out.println("---------------------------------------------------------------------");
    }
}