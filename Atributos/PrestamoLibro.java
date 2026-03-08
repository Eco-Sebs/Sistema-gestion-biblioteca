/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.atributos;

/**
 *
 * @author Guerrero Cangas Sebastian
 * proyecto final
 */
public class PrestamoLibro {
    
    private String Nombre;
    private String ApellidoP;
    private String ApellidoM;
    private String Curp;
    private String Fecha;
    private String RFecha;
    private String Libro;

    public PrestamoLibro() {//para poder ingresar la informacin
    }
    
    /**
     * 
     * @param Nombre nombre del cliente
     * @param ApellidoP apellido paterno del cliente
     * @param ApellidoM apellido materno del cliente
     * @param Curp la curp del cliente
     * @param Fecha la fecha que pidio el libro 
     * @param RFecha la fecha de regreso del libro
     * @param Libro el libro que pidio el cliente
     */

    public PrestamoLibro(String Nombre, String ApellidoP, String ApellidoM, String Curp, String Fecha, String RFecha, String Libro) {/**
     *para poder ingresar informacion 
     */
        this.Nombre = Nombre;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.Curp = Curp;
        this.Fecha = Fecha;
        this.RFecha = RFecha;
        this.Libro = Libro;
    }
    
    /**
     * 
     * @return regresa la fecha de regreso
     */
    
    public String getRFecha() {
        return RFecha;
    }
    
    /**
     * 
     * @param RFecha para poder ingresar la fecha de regreso del libro
     */

    public void setRFecha(String RFecha) {
        this.RFecha = RFecha;
    }
    
    /**
     * 
     * @return regresa el nombre del cliente
     */
    
    public String getNombre() {
        return Nombre;
    }
    
    /**
     * 
     * @param Nombre para poder ingresar nombre del cliente
     */

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    /**
     * 
     * @return regresa el apellido paterno del cliente
     */

    public String getApellidoP() {
        return ApellidoP;
    }
    
    /**
     * 
     * @param ApellidoP poder ingresar el apellido paterno del cliente
     */

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }
    
    
    /**
     * 
     * @return regresa el apellido materno del cliente
     */

    public String getApellidoM() {
        return ApellidoM;
    }
    
    /**
     * 
     * @param ApellidoM  para poder ingresar el apellido materno
     */

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }
    
    /**
     * 
     * @return regresa la curp del cliente
     */

    public String getCurp() {
        return Curp;
    }
    
    /**
     * 
     * @param Curp para poder ingresar la curp del cliente
     */

    public void setCurp(String Curp) {
        this.Curp = Curp;
    }
    
    /**
     * 
     * @return regresa la fecha del prestamo
     */

    public String getFecha() {
        return Fecha;
    }
    
    /**
     * 
     * @param Fecha poder ingresar la fecha del dia
     */

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    
    /**
     * 
     * @return regresa el liro a prestar al cliente
     */

    public String getLibro() {
        return Libro;
    }
    
    /**
     * 
     * @param Libro para poder ingresar el libro a prestarr
     */

    public void setLibro(String Libro) {
        this.Libro = Libro;
    }

    @Override
    public String toString() {//regresa los objetos
        return "PrestamoLibro{" + "Nombre=" + Nombre + ", ApellidoP=" + ApellidoP + ", ApellidoM=" + ApellidoM + ", Curp=" + Curp + ", Fecha=" + Fecha + ", Libro=" + Libro + '}';
    }
    
    
    
    
    

}
