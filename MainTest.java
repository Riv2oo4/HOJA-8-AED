import java.io.IOException;

public class MainTest {
    
    /** 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Test pruebas=new Test();

        pruebas.testVectorHeap();
        pruebas.testProceso();
        pruebas.testOrdenamiento();
        pruebas.testArchivo();
    }
}
