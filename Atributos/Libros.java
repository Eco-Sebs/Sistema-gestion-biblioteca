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

public class Libros {
    
    private String titulo;
    private long ISBN;
    private String Editorial;
    private int cantidad;

    
     public Libros() {// para poder ingresar informaccion
     }
     
     /**
      * 
      * @param titulo objeto del titulo del libro
      * @param ISBN isbn del libro
      * @param Editorial la editorial que pertence el libro 
      * @param cantidad la cantidad de libros a ingresar 
      */
    
    public Libros(String titulo, long ISBN, String Editorial, int cantidad) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.Editorial = Editorial;
        this.cantidad = cantidad;
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

    @Override
    public String toString() {//regresa el titulo 
        return titulo;
    }
    
    
    
                        
}
