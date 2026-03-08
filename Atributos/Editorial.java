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
public class Editorial {
    
    private String NombreE;
    private String RFC;
    private String Direccion;
    private long numeroT;
    private String NombreR;
    private String correoE;

    public Editorial(){//constructor basico para mandar informacion
    
    }
    
    /**
     * 
     * @param NombreE objeto del nombre de la editorial
     * @param RFC objeto de la rfc de la editorial
     * @param Direccion direccion de la editorial
     * @param numeroT numero telefonico de la editorial
     * @param NombreR nombre del representante
     * @param correoE correo de la editorial
     */
    
    public Editorial(String NombreE, String RFC, String Direccion, int numeroT, String NombreR, String correoE) {
        this.NombreE = NombreE;
        this.RFC = RFC;
        this.Direccion = Direccion;
        this.numeroT = numeroT;
        this.NombreR = NombreR;
        this.correoE = correoE;
    }
    /**
     * 
     * @return regresa el nombre de la editorial
     */

    public String getNombreE() {
        return NombreE;
    }
    /**
     * 
     * @param NombreE para poder modificar o ingresar el nombre de la editorial
     */

    public void setNombreE(String NombreE) {
        this.NombreE = NombreE;
    }
    /**
     * 
     * @return regresa el RFC de la editorial
     */

    public String getRFC() {
        return RFC;
    }
    
    /**
     * 
     * @param RFC podemos modificar el rfc de la editorial
     */

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
    
    /**
     * 
     * @return regresa la direccion de la editorial
     */

    public String getDireccion() {
        return Direccion;
    }
    
    /**
     * 
     * @param Direccion para poder ingresar la direccion del cliente
     */

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
        
    }
    
    /**
     * 
     * @return regresa el numero telefonico de la editorial
     */

    public long getNumeroT() {
        return numeroT;
    }
    
    /**
     * 
     * @param numeroT para poder ingresar el numero telefonico
     */

    public void setNumeroT(long numeroT) {
        this.numeroT = numeroT;
    }
    
    /**
     * 
     * @return regresa el nombre del representante de la editorial
     */

    public String getNombreR() {
        return NombreR;
    }
    
    /**
     * 
     * @param NombreR poder ingresar el nombre del representante
     */

    public void setNombreR(String NombreR) {
        this.NombreR = NombreR;
    }
    
    /**
     * 
     * @return regresa el correo electronico de la editorial
     */

    public String getCorreoE() {
        return correoE;
    }
    
    /**
     * 
     * @param correoE para poder ingresar el correo electronico
     */

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    @Override
    public String toString() {//manda el nombre de la editorial
        return  NombreE;
    }
    
    
    
    
}
