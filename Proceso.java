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

    public String getNombreProceso() {
        return nombreProceso;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public int getNiceValue() {
        return niceValue;
    }
    public int getPrioridad(){
        return this.prioridad;
    }

    public void setNombreProceso(String nombreProceso) {
        this.nombreProceso = nombreProceso;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public void setNiceValue(int niceValue) {
        this.niceValue = niceValue;
    }
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }


    @Override
    public int compareTo(Proceso proceso) {
        int pr1 = 20 + this.niceValue;
        int pr2 = 20 + proceso.getNiceValue();
        return Integer.compare(pr1, pr2);
    }

    @Override
    public String toString() {
        int pr = 120 + niceValue;
        return nombreProceso + "," + nombreUsuario + "," + niceValue + ",PR=" + pr;
    }
}
