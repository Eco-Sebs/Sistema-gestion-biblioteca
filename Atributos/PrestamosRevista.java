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
public class PrestamosRevista {
    
    private String Nombre;
    private String ApellidoP;
    private String ApellidoM;
    private String Curp;
    private String Fecha;
    private String FRegreso;
    private String Revista;
    private long Numero;

    public PrestamosRevista() {//para poder ingresar informacion
   }
    
    /**
     * 
     * @param Nombre nombre del cliente
     * @param ApellidoP apellido paterno del cliente
     * @param ApellidoM apellido materno del cliente
     * @param Curp la curp del cliente
     * @param Fecha la fecha que pidio el libro 
     * @param FRegreso la fecha de regreso del libro
     * @param Revista el nombre de la revista
     * @param Numero el numero de la revista
     */

    public PrestamosRevista(String Nombre, String ApellidoP, String ApellidoM, String Curp, String Fecha, String FRegreso, String Revista, long Numero) {
        this.Nombre = Nombre;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.Curp = Curp;
        this.Fecha = Fecha;
        this.FRegreso = FRegreso;
        this.Revista = Revista;
        this.Numero = Numero;
    }
    
    /**
     * 
     * @return regresa la fecha de regreso
     */

    public String getFRegreso() {
        return FRegreso;
    }
    
    /**
     * 
     * @param FRegreso para poder ingresar la fecha de regreso del libro
     */

    public void setFRegreso(String FRegreso) {
        this.FRegreso = FRegreso;
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
     * @return regresa la revita del prestamo
     */

    public String getRevista() {
        return Revista;
    }
    
    /**
     * 
     * @param Revista ingresar la revista a prestar
     */

    public void setRevista(String Revista) {
        this.Revista = Revista;
    }
    
    /**
     * 
     * @return regresa el numero de la revista
     */

    public long getNumero() {
        return Numero;
    }
    
    /**
     * 
     * @param Numero podemos ingresar el numero de la revista
     */

    public void setNumero(long Numero) {
        this.Numero = Numero;
    }
    

    @Override
    public String toString() {//regresa los elementos
        return "PrestamosRevista{" + "Nombre=" + Nombre + ", ApellidoP=" + ApellidoP + ", ApellidoM=" + ApellidoM + ", Curp=" + Curp + ", Fecha=" + Fecha + ", Revista=" + Revista + '}';
    }
    
    
    
}
