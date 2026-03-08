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
public class Cliente {
    
    private String nombre;
    private String ApellidoP;
    private String ApellidoM;
    private String Curp;
    private String CorreoE;
    private String Direccion;
    private long Telefono;
    private String genero;
    private String gustos;
    /**
     * creamos los atributos para la clase
     */

    public Cliente() {//metodo constructor basico
  
    }
    /**
     * 
     * @param nombre objeto nombre
     * @param ApellidoP objeto apellidoP
     * @param ApellidoM objeto apellidoM
     * @param Curp objeto curp
     * @param CorreoE objeto del correro electronico
     * @param Direccion objeto de la direccion de la persona
     * @param Telefono numero telefonico de la persona
     * @param genero genero del cliente
     * @param gustos gustos del cliente
     */
    public Cliente(String nombre, String ApellidoP, String ApellidoM, String Curp, String CorreoE, String Direccion, int Telefono, String genero, String gustos) {/**
     * metodo constructor para poder mandar informacion 
     */
        this.nombre = nombre;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.Curp = Curp;
        this.CorreoE = CorreoE;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.genero = genero;
        this.gustos = gustos;
    }
    
    /**
     * 
     * @return regresa el nombre
     */
    
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre poder mandar el nombre
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * 
     * @return para poder recibir el apellido Paterno
     */

    public String getApellidoP() {
        return ApellidoP;
    }
    /**
     * 
     * @param ApellidoP para poder ingresarel apellido paterno del cliente
     */

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }
    
    /**
     * 
     * @return para poder recibir el apellido materno
     */

    public String getApellidoM() {
        return ApellidoM;
    }
    
    /**
     * 
     * @param ApellidoM para poder ingresar el apellido materno del cliente
     */

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }
    
    /**
     * 
     * @return para poder recibir la curp del cliente
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
     * @return para poder recibir el correo electronico
     */

    public String getCorreoE() {
        return CorreoE;
    }
    
    
    /**
     * 
     * @param CorreoE para poder ingresar el correo electronico del cliente
     */

    public void setCorreoE(String CorreoE) {
        this.CorreoE = CorreoE;
    }
    
    /**
     * 
     * @return para poder recibir la direccion del cliente
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
     * @return para poder recibir el numero telefonico
     */

    public long getTelefono() {
        return Telefono;
    }
    
    
    /**
     * 
     * @param Telefono para poder ingresar el numero de telefono del cliente
     */

    public void setTelefono(long Telefono) {
        this.Telefono = Telefono;
    }
    
    /**
     * 
     * @return para poder recibir el genero del cliente
     */

    public String getGenero() {
        return genero;
    }
    
    
    /**
     * 
     * @param genero para poder ingresar el genero del cliente
     */

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    /**
     * 
     * @return para poder recibir los gustos del cliente
     */

    public String getGustos() {
        return gustos;
    }
    /**
     * 
     * @param gustos para poder ingresar los gustos del cliente
     */

    public void setGustos(String gustos) {
        this.gustos = gustos;
    }

    /**
     * 
     * @return para poder imprimir ciertos elementos
     */
    @Override
    public String toString() {
        return  nombre +" "+ ApellidoP +" "+ ApellidoM ;
    }
    
}
