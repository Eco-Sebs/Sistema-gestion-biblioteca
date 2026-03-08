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
import uam.pvoe.atributos.Editorial;
import uam.pvoe.atributos.Libros;
import uam.pvoe.atributos.Revistas;

/**
 *
 * @author Guerrero Cangas Sebastian
 * proyecto final
 */
public class RegistroRevista {
   
    public void llenadoR(String na,long na2,String na3, long p, int p1, String na4){
       
        String cadenaLeida = "";
        File archivo;
        FileWriter Fw;
        PrintWriter pw;
        archivo = new File("Revistas.txt");
        
        if(!archivo.exists()){//si no existe el archivo
            
            try {
                archivo.createNewFile();//creamos el archivo
                Fw = new FileWriter("Revistas.txt",true);
                pw = new PrintWriter(Fw);//para poder escribir en el archivo
                BufferedWriter texto = new BufferedWriter(Fw);

                pw.println(na+","+na2+","+na3+","+p+","+p1+","+na4);/**
                 * escribimos en el archivo
                 */
               
                 pw.close();//cerramos la escritura

                 Fw.close();//cerramos la escritura en el archivo

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
            
        }else{//si existe
           try {
                
                Fw = new FileWriter("Revistas.txt",true);
                pw = new PrintWriter(Fw);//para poder escribir
                BufferedWriter texto = new BufferedWriter(Fw);

                pw.println(na+","+na2+","+na3+","+p+","+p1+","+na4);/**
                 * escribimos en el archivo
                 */
               
                 pw.close();//cerramos la escritura

                 Fw.close();//cerramos la escritura en el archivo
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
    
    public LinkedList<Revistas> listaR(){
            
        LinkedList<Revistas> listaRevistas = new LinkedList(); 
        
        String cadenaLeida = "";
        FileReader fr;
        File archivo;
        archivo = new File("Revistas.txt");
        
        if(!archivo.exists()){//si no existe el archivo
            try {
         
                 archivo.createNewFile();//creamos el archivo
                fr = new FileReader("Revistas.txt");

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
                fr = new FileReader("Revistas.txt");//leemos el archivo

                BufferedReader archivoLectura = new BufferedReader(fr);
                cadenaLeida = archivoLectura.readLine();

                while (cadenaLeida != null) {
                    StringTokenizer st = new StringTokenizer(cadenaLeida, ",");

                    String titulo= st.nextToken();
                    long ISBN = Long.parseLong(st.nextToken());
                    String Editorial = st.nextToken();
                    long Numero = Long.parseLong(st.nextToken());
                    int cantidad = Integer.parseInt(st.nextToken());
                    String Periodo = st.nextToken();

                    Revistas rev = new Revistas();

                    rev.setTitulo(titulo);
                    rev.setISBN(ISBN);
                    rev.setEditorial(Editorial);
                    rev.setNumero(Numero);
                    rev.setCantidad(cantidad);
                    rev.setPeriodo(Periodo);
                    /**
                     * llamamos la funcion de revistas
                     * para poder leer los objetos del archivo
                     * y mandarlo a una lista
                     */

                    listaRevistas.add(rev);
                    

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
        
        Revistas EditoNula = new Revistas("--Selecciona la revista--   ", 0, "", 0, 0, "");/**
         * lo agregamos como primero para mas estetica
         */
        listaRevistas.addFirst(EditoNula);//lo agregamos como primero como lista
        return listaRevistas;//regresamos la lista 
        
    }
    
}
