package modelo;

public class Usuario {

    private String nombre;
    private String pass;

    private String name;
    private String lastNa;
    private String secNa;
    private String fecha;
    private String correo;

    public Usuario(String nombre, String pass,String name, String lastNa, String secNa, String fecha, String correo) {
        this.nombre = nombre;
        this.pass = pass;
        this.name = name;
        this.lastNa = lastNa;
        this.secNa = secNa;
        this.fecha = fecha;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastNa
     */
    public String getLastNa() {
        return lastNa;
    }

    /**
     * @param lastNa the lastNa to set
     */
    public void setLastNa(String lastNa) {
        this.lastNa = lastNa;
    }

    /**
     * @return the secNa
     */
    public String getSecNa() {
        return secNa;
    }

    /**
     * @param secNa the secNa to set
     */
    public void setSecNa(String secNa) {
        this.secNa = secNa;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
