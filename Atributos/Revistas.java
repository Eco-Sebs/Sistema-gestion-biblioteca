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
public class Revistas {
    
    private String titulo;
    private long ISBN;
    private String Editorial;
    private long numero;
    private int cantidad;
    private String periodo;

    public Revistas() {//para poder ingresar datos
        
    }
    /**
     * 
     * @param titulo objeto del titulo del libro
     * @param ISBN isbn del libro
     * @param Editorial la editorial que pertence el libro 
     * @param numero da el numero de la revista
     * @param cantidad la cantidad de libros a ingresar 
     * @param periodo la periocidad con la que se publica
     */
    
    public Revistas(String titulo, long ISBN, String Editorial, long numero, int cantidad, String periodo) {/**
     * para poder ingresar los datos
     */
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.Editorial = Editorial;
        this.numero = numero;
        this.cantidad = cantidad;
        this.periodo = periodo;
    }
    
   /**
     * 
     * @return regresa el nombre del libro
     */

    public String getTitulo() {
        return titulo;
    }
    
    /**
     * 
     * @param titulo para poder ingresar el titulo
     */

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * 
     * @return regresa el isbn del libro
     */
    
    public long getISBN() {
        return ISBN;
    }
    
    /**
     * 
     * @param ISBN para poder ingresar isbn
     */

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }
    
    /**
     * 
     * @return regresa la editorial del libro
     */

    public String getEditorial() {
        return Editorial;
    }
    
    /**
     * 
     * @param Editorial para poder ingresar la editorial del libro
     */

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }
    
    /**
     * 
     * @return para poder recibir el numero de la revista
     */
    
    public long getNumero() {
        return numero;
    }
    
    /**
     * 
     * @param numero para poder ingresar el numero de la revista
     */

    public void setNumero(long numero) {
        this.numero = numero;
    }

    /**
     * 
     * @return regresa la cantidad del libro
     */

    public int getCantidad() {
        return cantidad;
    }
    
    /**
     * 
     * @param cantidad para poder ingresar la cantidad de libros
     */

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    /**
     * 
     * @return para poder recibir la periocidad de la revista
     */

    public String getPeriodo() {
        return periodo;
    }

    /**
     * 
     * @param periodo para poder ingresar la preciodad de la revista
     */
    
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {//manda elementos
        return titulo + " "+numero ;
    }
    
    
    
    
}
