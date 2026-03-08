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
import uam.pvoe.atributos.Libros;
import uam.pvoe.atributos.Revistas;

/**
 *
 * @author Windows 10
 */
public class RegistroLibro {
    
    public LinkedList<Libros> listaL(){
            
        LinkedList<Libros> listaLibros = new LinkedList(); 
        
        String cadenaLeida = "";
        FileReader fr;//para poder leer el archivo
        File archivo;
       archivo = new File("Libros.txt");
        
        if(!archivo.exists()){//si no existe el archivo
            try {

                archivo.createNewFile();//creamos el archivo
                fr = new FileReader("Libros.txt");//lo leemos

                BufferedReader archivoLectura = new BufferedReader(fr);
                cadenaLeida = archivoLectura.readLine();
                System.out.println("No hay libros registrados");

                
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

                fr = new FileReader("Libros.txt");

                BufferedReader archivoLectura = new BufferedReader(fr);/**
                 * leemos el archivo
                 */
                cadenaLeida = archivoLectura.readLine();

                while (cadenaLeida != null) {
                    StringTokenizer st = new StringTokenizer(cadenaLeida, ",");

                    String titulo= st.nextToken();
                    long ISBN = Long.parseLong(st.nextToken());
                    String Editorial = st.nextToken();
                    int cantidad = Integer.parseInt(st.nextToken());

                    Libros lil = new Libros();
                    lil.setTitulo(titulo);
                    lil.setISBN(ISBN);
                    lil.setEditorial(Editorial);
                    lil.setCantidad(cantidad);
                    
                    /**
                     * llamaos la funcion del libro
                     * y buscamos los obejetos que tienen el archivo
                     * y lo mandamos a una lista
                     */
                    
                    listaLibros.add(lil);
                    
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
        
        
        Libros EditoNula = new Libros("--Selecciona el Libro--", 0, cadenaLeida, 0);/**
         * para agregarlo como primer dato
         */
        listaLibros.addFirst(EditoNula);//se lo agregamos a la lista
        
        return listaLibros;//regresamos la lista 
        
    }
    
    public void llenadoL(String na,long na2,String na3, int p){
       
        String cadenaLeida = "";
        File archivo;
        FileWriter Fw;
        PrintWriter pw;
        /**
         * para poder escribir en el archivo
         */
        archivo = new File("Libros.txt");
        
        if(!archivo.exists()){//si no existe archivo
            
            try {
                archivo.createNewFile();//creamos el archivo
                Fw = new FileWriter("Libros.txt",true);
                pw = new PrintWriter(Fw);// para poder escribir en el archivo
                BufferedWriter texto = new BufferedWriter(Fw);

                pw.println(na+","+na2+","+na3+","+p);//escribimos en el archivo
               
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
            
        }else{//si existe archivo
           try {
                
                Fw = new FileWriter("Libros.txt",true);
                
                pw = new PrintWriter(Fw);// para poder escribir en el archivo
                BufferedWriter texto = new BufferedWriter(Fw);

                pw.println(na+","+na2+","+na3+","+p);//escribimos en el archivo
               
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
    
    
}
