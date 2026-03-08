/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.operaciones;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.LinkedList;
import java.util.Vector;
import uam.pvoe.atributos.Cliente;
import uam.pvoe.atributos.Libros;
import uam.pvoe.atributos.PrestamoLibro;
import uam.pvoe.atributos.PrestamosRevista;
import uam.pvoe.atributos.Revistas;

/**
 *
 * @author Guerrero Cangas Sebastian
 * Proyecto final
 */
public class OperacionesConsultaPrestamo {
    
     public Vector<String>tituloColumnasL(){
        Vector<String>listaTitulos = new Vector();/*
        creamos un vector tipo string
        */
        
        RegistroLibro lil = new RegistroLibro();
        /*
        convocamos las funciones de registro de lirbos
        */
        LinkedList<Libros>listaRegistros = new LinkedList();/*
        generamos una lista nueva de registros
        */
        listaRegistros = lil.listaL();
        /*
        va recibir la lista de la funcion listaRegistros3
        */
        int p=0;

        String unidad = "Titulo";
        listaTitulos.add(0, unidad);//ingresamos la palabra titutlo al inicio de lista
        
        String Fecha = "Fecha";
        listaTitulos.add(1, Fecha);//ingresamos la palabra fecha a la lista
        
        String tiempo = "Fecha de regreso";
        listaTitulos.add(2, tiempo);//ingresamos la palabra fecha de regreso a la de lista
        
        
        return listaTitulos;//se regresa la lista
        
    }
    
     public Vector<String>tituloColumnasR(){
        Vector<String>listaTitulos = new Vector();/*
        creamos un vector tipo string
        */
        
        String unidad = "Titulo";
        listaTitulos.add(0, unidad);//ingresamos la palabra Titulo al inicio de lista
        
        String Numero = "Numero";
        listaTitulos.add(1, Numero);//ingresamos la palabra numero a la  lista
        
        String Fecha = "Fecha";
        listaTitulos.add(2, Fecha);//ingresamos la palabra fecha a la  lista
        
        String tiempo = "Tiempo de regreso";
        listaTitulos.add(3, tiempo);//ingresamos la palabra tiempo de regreso a la lista
        
        return listaTitulos;//se regresa la lista
        
    }
     
    public Vector elementosCeldaR(int p,int p1,String na){
         Vector filas = new Vector();//creamos un vector de listas
         Vector<Object>fila;//acepta cualquier tipo de objeto
         RegistroRevista cargar = new RegistroRevista();/**
          * convocamos las funciones de la clase
          * de registroRebista
          */
         
         RegistrosPrestamosRevista preR = new RegistrosPrestamosRevista();/**
          * convocamos las funciones de la clase
          * de RegistroPrestamosRevistas
          */
         
         LinkedList<PrestamosRevista>listaRegistros = new LinkedList();/*
         creamos una lista de registros
         */
  
         listaRegistros = preR.listaRP(na);/*
         se guarda la lista de la funcion registro1
         */
         
         for(int i=0;i<p;i++){
             fila = new Vector();//creamos un nuevo vector
             
             PrestamosRevista regis = listaRegistros.get(i);/*
             guardamos los prestamos en regis
             */
                     
             fila.add(regis.getRevista());/**
              * lo guardamos la lista de los titulos de las revistas
              */
           
            for(int j=0; j<p1; j++){
          
                PrestamosRevista regis2 = listaRegistros.get(i);/**
                  * guardamos la lista registro por posicion en una de
                  * elemento registros
                  */
                     
                     fila.add(regis2.getNumero());
                     fila.add(regis2.getFecha());
                     fila.add(regis2.getFRegreso());
                     /**
                      * se guardo en la lista el numero de la revista 
                      * mas la fecha y cuando se debe de regresar
                      */
                    
            }
                 
           filas.add(fila);//se guarda toda la lista
        
         }
         return filas;//mandamos la lista
        
    }
    
    public Vector elementosCeldaLGenerico(int p,int p1){//creado para ver una tabla generica
         Vector filas = new Vector();//creamos un vector de listas
         Vector<Object>fila;//acepta cualquier tipo de objeto
         RegistroLibro cargar = new RegistroLibro();/**
          * convocamos las funciones de la clase
          * de RegistroLibro
          */
         
         RegistroPrestamosLibro preL = new RegistroPrestamosLibro();/**
          * llamamos la funcion del registroPrestamosLibro
          */
       
         LinkedList<PrestamoLibro>listaRegistros = new LinkedList();/*
         creamos una lista de registros
         */
  
         listaRegistros = preL.listaLPGenerica();/*
         se guarda la lista de la funcion registro1
         */
         
         for(int i=0;i<p;i++){
             fila = new Vector();//creamos un nuevo vector
           
             PrestamoLibro regis = listaRegistros.get(i);/*
             guardamos la lista de libros en prestamo
             */
             
             fila.add(regis.getLibro());/**
              * lo guardamos a la lista el nombre de los libros
              */
        
            for(int j=0; j<p1; j++){
            
                 PrestamoLibro regis2 = listaRegistros.get(i);/**
                  * guardamos la lista registro por posicion en una de
                  * elemento registros
                  */
                 
                     fila.add(regis2.getFecha());
                     fila.add(regis2.getRFecha());
                     /*
                      * se guardo la fecha y cuando se regresara
                      */
                    
            }
                 
           filas.add(fila);//se guarda toda la lista
        
         }
         return filas;//mandamos la lista
        
    }
    
    public Vector elementosCeldaL(int p,int p1,String na){
         Vector filas = new Vector();//creamos un vector de listas
         Vector<Object>fila;//acepta cualquier tipo de objeto
         RegistroLibro cargar = new RegistroLibro();/**
          * convocamos las funciones de la clase
          * de RegistroLibro
          */
         
         RegistroPrestamosLibro preL = new RegistroPrestamosLibro();/**
          * llamamos la funcion de registroPrestamosLibro
          */
       
         LinkedList<PrestamoLibro>listaRegistros = new LinkedList();/*
         creamos una lista de registros
         */
  
         listaRegistros = preL.listaLP(na);/*
         se guarda la lista de la funcion registro
         */
         
         for(int i=0;i<p;i++){
             fila = new Vector();//creamos un nuevo vector
           
             PrestamoLibro regis = listaRegistros.get(i);/*
             * guardamos a la lista en regis
             */
             
            
             fila.add(regis.getLibro());/**
              * lo guardamos a la lista el nombre de los libros
              */
        
            for(int j=0; j<p1; j++){
            
                 PrestamoLibro regis2 = listaRegistros.get(i);/**
                  * guardamos la lista registro por posicion en una de
                  * elemento registros
                  */
                 
                     fila.add(regis2.getFecha());
                     fila.add(regis2.getRFecha());
                     /*
                      *guardamos a la lista la fecha y cuando se regresara
                      */
                    
            }
                 
           filas.add(fila);//se guarda toda la lista
        
         }
         return filas;//mandamos la lista
        
    }
    
}
