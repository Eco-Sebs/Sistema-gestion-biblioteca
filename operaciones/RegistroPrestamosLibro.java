/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.operaciones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;
import uam.pvoe.atributos.PrestamoLibro;
import uam.pvoe.atributos.PrestamosRevista;

/**
 *
 * @author Guerrero Cangas Sebastian
 * proyecto final
 */
public class RegistroPrestamosLibro {
    
    public void llenadoLP(String na,String na2,String na3,String na4,String na5, String na6, String na7){
       
        String cadenaLeida = "";
        File archivo;
        FileWriter Fw;//para poder escribir en el archivo
        PrintWriter pw;
        archivo = new File("PrestamoLibro.txt");
        
        if(!archivo.exists()){//si no existe el archivo
            
            try {
                archivo.createNewFile();//creamos el archivo
                Fw = new FileWriter("PrestamoLibro.txt",true);
                pw = new PrintWriter(Fw);//para poder escribir
                BufferedWriter texto = new BufferedWriter(Fw);

                pw.println(na+","+na2+","+na3+","+na4+","+na5+","+na6+","+na7);/**
                 * escribimos en el archivo
                 */
               
                pw.close();//cerramos escritura

                Fw.close();//cerramos escritura en el archivo

            } catch (FileNotFoundException e) {
                System.out.println("No se pudo encontrar el archivo");
                e.printStackTrace();/**
                 * mensaje si hay un error
                 */
            } catch (IOException e) {
                System.out.println("No se pudo leer del archivo");
                e.printStackTrace();/**
                 * cerramos si hay un error
                 */
            }
            
        }else{//si existe el archivo
           try {
                
                Fw = new FileWriter("PrestamoLibro.txt",true);
                pw = new PrintWriter(Fw);//para poder escribir
                BufferedWriter texto = new BufferedWriter(Fw);

                pw.println(na+","+na2+","+na3+","+na4+","+na5+","+na6+","+na7);/**
                 * escribimos en el archivo
                 */
               
                pw.close();//cerramos escritura

                Fw.close();//cerramos escritura en el archivo
            } catch (FileNotFoundException e) {
                System.out.println("No se pudo encontrar el archivo");
                e.printStackTrace();/**
                 * mensaje si hay un error
                 */
            } catch (IOException e) {
                System.out.println("No se pudo leer del archivo");
                e.printStackTrace();/**
                 * cerramos si hay un error
                 */
            }
        
        }
        
    }
    
    public LinkedList<PrestamoLibro> listaLPGenerica(){
            
        LinkedList<PrestamoLibro> listaLibrosPrestamos = new LinkedList(); 
        
        String cadenaLeida = "";
        FileReader fr;//para poder leer
        File archivo;
        archivo = new File("PrestamoLibro.txt");
        
        if(!archivo.exists()){//si no existe el archivo
            try {
         
                 archivo.createNewFile();//creamos el archivo
                fr = new FileReader("PrestamoLibro.txt");

                BufferedReader archivoLectura = new BufferedReader(fr);
                cadenaLeida = archivoLectura.readLine();

                
                archivoLectura.close();//cerramos el archivo

            } catch (FileNotFoundException e) {
                System.out.println("No se pudo encontrar el archivo");
                e.printStackTrace();/**
                 * mensaje si hay un error
                 */
            } catch (IOException e) {
                System.out.println("No se pudo leer del archivo");
                e.printStackTrace();/**
                 * cerramos si hay un error
                 */
            }
        }else{//si existe el archivo
            try {
                fr = new FileReader("PrestamoLibro.txt");//para poder leer el archivo

                BufferedReader archivoLectura = new BufferedReader(fr);
                cadenaLeida = archivoLectura.readLine();

                while (cadenaLeida != null) {
                    StringTokenizer st = new StringTokenizer(cadenaLeida, ",");

                    String Nombre= st.nextToken();
                    String ApellidoP = st.nextToken();
                    String ApellidoM = st.nextToken();
                    String Curp = st.nextToken();
                    String Libro = st.nextToken();
                    String Fecha = st.nextToken();
                    String RFecha = st.nextToken();

                    PrestamoLibro lil = new PrestamoLibro();


                    lil.setNombre(Nombre);
                    lil.setApellidoP(ApellidoP);
                    lil.setApellidoM(ApellidoM);
                    lil.setCurp(Curp);
                    lil.setLibro(Libro);
                    lil.setFecha(Fecha);
                    lil.setRFecha(RFecha);
                    /**
                     * llamamos a la funcion del prestamo libro para poder
                     * leer cada objeto y verlo en la lista
                     */
                            
                    listaLibrosPrestamos.add(lil);
                 
                    cadenaLeida = archivoLectura.readLine();//leemos la siguiente reglon
                }
                archivoLectura.close();//cerramos el archivo

            } catch (FileNotFoundException e) {
                System.out.println("No se pudo encontrar el archivo");
                e.printStackTrace();/**
                 * mensaje si hay un error
                 */
            } catch (IOException e) {
                System.out.println("No se pudo leer del archivo");
                e.printStackTrace();/**
                 * cerramos si hay un error
                 */
            }    
        }
        
        return listaLibrosPrestamos;//regresamos la lista 
        
    }
    
    public LinkedList<PrestamoLibro> listaLP(String na){
            
        LinkedList<PrestamoLibro> listaLibrosPrestamos = new LinkedList(); 
        
        String cadenaLeida = "";
        FileReader fr;//para poder leer el archivo
        File archivo;
        archivo = new File("PrestamoLibro.txt");
        
        if(!archivo.exists()){//si no existe el archivo
            try {
         
                 archivo.createNewFile();//creamos el archivo
                fr = new FileReader("PrestamoLibro.txt");

                BufferedReader archivoLectura = new BufferedReader(fr);
                cadenaLeida = archivoLectura.readLine();

                System.out.println("No hay archivos");
                
                archivoLectura.close();//cerramos el archivo

            } catch (FileNotFoundException e) {
                System.out.println("No se pudo encontrar el archivo");
                e.printStackTrace();/**
                 * mensaje si hay un error
                 */
            } catch (IOException e) {
                System.out.println("No se pudo leer del archivo");
                e.printStackTrace();/**
                 * cerramos si hay un error
                 */
            }
        }else{//si el archivo existe
            try {
                fr = new FileReader("PrestamoLibro.txt");/**
                 * para poder leer el archivo
                 */

                BufferedReader archivoLectura = new BufferedReader(fr);
                cadenaLeida = archivoLectura.readLine();

                while (cadenaLeida != null) {
                    StringTokenizer st = new StringTokenizer(cadenaLeida, ",");

                    String Nombre= st.nextToken();
                    String ApellidoP = st.nextToken();
                    String ApellidoM = st.nextToken();
                    String Curp = st.nextToken();
                    String Libro = st.nextToken();
                    String Fecha = st.nextToken();
                    String RFecha = st.nextToken();

                    PrestamoLibro lil = new PrestamoLibro();


                    lil.setNombre(Nombre);
                    lil.setApellidoP(ApellidoP);
                    lil.setApellidoM(ApellidoM);
                    lil.setCurp(Curp);
                    lil.setLibro(Libro);
                    lil.setFecha(Fecha);
                    lil.setRFecha(RFecha);
                            
                    /**
                     * llamamos la funcion del libro
                     * para poder registrar la informacion en una lista
                     * 
                     */
                 if(lil.getCurp().compareTo(na)==0){//para poder delimitar el registro
                     
                    listaLibrosPrestamos.add(lil);
                 }
                    

                    cadenaLeida = archivoLectura.readLine();//leemos la siguiente reglon
                }
                archivoLectura.close();//cerramos el archivo

            } catch (FileNotFoundException e) {
                System.out.println("No se pudo encontrar el archivo");
                e.printStackTrace();/**
                 * mensaje si hay un error
                 */
            } catch (IOException e) {
                System.out.println("No se pudo leer del archivo");
                e.printStackTrace();/**
                 * cerramos si hay un error
                 */
            }    
        }
        
        return listaLibrosPrestamos;//regresamos la lista 
        
    }
    
}
