/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.operaciones;

import java.util.LinkedList;
import java.util.Vector;
import uam.pvoe.atributos.Libros;
import uam.pvoe.atributos.Revistas;

/**
 * @author Guerrero Cangas Sebastian
 * Proyecto final
 */
public class OperacionesConsultas {
    
     public Vector<String>tituloColumnasL(){
        Vector<String>listaTitulos = new Vector();/*
        creamos un vector tipo string
        */
        
        RegistroLibro lil = new RegistroLibro();
        /*
        convocamos las funciones de cargarArchivo
        */
        String unidad = "Titulo";
        listaTitulos.add(0, unidad);//ingresamos la palabra Titulo a la lista
        
        String ISBN = "ISBN";
        listaTitulos.add(1, ISBN);//ingresamos la palabra ISBN a la lista
        
        String Editorial = "Editorial";
        listaTitulos.add(2, Editorial);//ingresamos la palabra Editorial a la lista
        
        String Cantidad = "Cantidad";
        listaTitulos.add(3, Cantidad);//ingresamos la palabra Cantidad a la lista
        
        return listaTitulos;//se regresa la lista
        
    }
     
     public Vector<String>tituloColumnasR(){
        Vector<String>listaTitulos = new Vector();/*
        creamos un vector tipo string
        */
        
        String unidad = "Titulo";
        listaTitulos.add(0, unidad);//ingresamos la palabra titulo a la lista
        
        String ISBN = "ISBN";
        listaTitulos.add(1, ISBN);//ingresamos la palabra ISBN a la lista
        
        String Editorial = "Editorial";
        listaTitulos.add(2, Editorial);//ingresamos la palabra Editorial a la lista
        
        String Numero = "Numero";
        listaTitulos.add(3, Numero);//ingresamos la palabra Numero a la lista
        
        String Cantidad = "Cantidad";
        listaTitulos.add(4, Cantidad);//ingresamos la palabra Cantidad a la lista
        
        String Periodo = "Periodo";
        listaTitulos.add(5, Periodo);//ingresamos la palabra Periodo a la lista
        
        return listaTitulos;//se regresa la lista
        
    }
     
     
     public Vector elementosCeldaL(int p,int p1){
         Vector filas = new Vector();//creamos un vector de listas
         Vector<Object>fila;//acepta cualquier tipo de objeto
         RegistroLibro cargar = new RegistroLibro();/**
          * convocamos las funciones de la clase
          * de RegistroLibro
          */
       
         LinkedList<Libros>listaRegistros = new LinkedList();/*
         creamos una lista de libros
         */
  
         listaRegistros = cargar.listaL();/*
         se guarda la lista de la funcion registrolibro
         */
         
         for(int i=0;i<p;i++){
             fila = new Vector();//creamos un nuevo vector
           
             Libros regis = listaRegistros.get(i);/*
             guardamos los costos en la clase de regis
             */
            
             fila.add(regis.getTitulo());/**
              * lo guardamos la lista de los titulos
              */
            
            for(int j=0; j<p1; j++){
                
                 Libros regis2 = listaRegistros.get(i);/**
                  * guardamos la lista registro por posicion en una de
                  * elemento registros
                  */
                 
                     Libros regis3 = new Libros();//convocamos un nuevo registro
                     regis3.setISBN(regis2.getISBN());
                     regis3.setEditorial(regis2.getEditorial());
                     regis3.setCantidad(regis2.getCantidad());
                     fila.add(regis2.getISBN());
                     fila.add(regis2.getEditorial());
                     fila.add(regis2.getCantidad());
                     /*
                     * guardamos a la lista el ISBN, el editorial y la cantidad
                      */
                    
            }
                 
           filas.add(fila);//se guarda toda la lista
        
         }
         return filas;//mandamos la lista
        
    }
    
    public Vector elementosCeldaR(int p,int p1){
         Vector filas = new Vector();//creamos un vector de listas
         Vector<Object>fila;//acepta cualquier tipo de objeto
         RegistroRevista cargar = new RegistroRevista();/**
          * convocamos las funciones de la clase
          * de RegistroRevista
          */
       
         LinkedList<Revistas>listaRegistros = new LinkedList();/*
         creamos una lista de Revistas
         */
  
         listaRegistros = cargar.listaR();/*
         se guarda la lista de la funcion Revistas
         */
         
         for(int i=0;i<p;i++){
             fila = new Vector();//creamos un nuevo vector
             
             Revistas regis = listaRegistros.get(i);/*
             guardamos las revistas
             */
             fila.add(regis.getTitulo());/**
              * lo guardamos la lista de los titulos
              */
            
            for(int j=0; j<p1; j++){
                
                 Revistas regis2 = listaRegistros.get(i);/**
                  * guardamos la lista registro por posicion en una de
                  * elemento revistas
                  */
                 
                 Libros regis3 = new Libros();//convocamos un nuevo registro
                     regis3.setISBN(regis2.getISBN());
                     regis3.setEditorial(regis2.getEditorial());
                     regis3.setCantidad(regis2.getCantidad());
                     
                     fila.add(regis2.getISBN());
                     fila.add(regis2.getEditorial());
                     fila.add(regis2.getNumero());
                     fila.add(regis2.getCantidad());
                     fila.add(regis2.getPeriodo());
                     /*
                      * Guardamos el ISBN, editorial, Numero, cantidad y el periodo
                      */
                    
            }
                 
           filas.add(fila);//se guarda toda la lista
        
         }
         return filas;//mandamos la lista
        
    } 
     
}
