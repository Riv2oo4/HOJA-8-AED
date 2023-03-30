public class Proceso implements Comparable<Proceso> {
    private String nombreProceso;
    private String nombreUsuario;
    private int niceValue;
    private int prioridad;

    public Proceso(String nombreProceso, String nombreUsuario, int niceValue,int prioridad) {
        this.nombreProceso = nombreProceso;
        this.nombreUsuario = nombreUsuario;
        this.niceValue = niceValue;
        this.prioridad=prioridad;
    }

    
    /** 
     * @return String
     */
    public String getNombreProceso() {
        return nombreProceso;
    }

    
    /** 
     * @return String
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    
    /** 
     * @return int
     */
    public int getNiceValue() {
        return niceValue;
    }
    
    /** 
     * @return int
     */
    public int getPrioridad(){
        return this.prioridad;
    }

    
    /** 
     * @param nombreProceso
     */
    public void setNombreProceso(String nombreProceso) {
        this.nombreProceso = nombreProceso;
    }
    
    /** 
     * @param nombreUsuario
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    /** 
     * @param niceValue
     */
    public void setNiceValue(int niceValue) {
        this.niceValue = niceValue;
    }
    
    /** 
     * @param prioridad
     */
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }


    
    /** 
     * @param proceso
     * @return int
     */
    @Override
    public int compareTo(Proceso proceso) {
        int pr1 = 20 + this.niceValue;
        int pr2 = 20 + proceso.getNiceValue();
        return Integer.compare(pr1, pr2);
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        
        int pr = 120 + niceValue;
        return nombreProceso + "," + nombreUsuario + "," + niceValue + ",PR=" + pr;
    }
}
