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

/**
 *
 * @author Guerrero Cangas Sebastian
 * proyecto final
 */
public class RegistroEditorial {
    
    
    public void llenadoE(String na,String na2,String na3, long na4, String na5, String na6){
       
        String cadenaLeida = "";
        File archivo;
        FileWriter Fw;//para poder escribir en el archivo
        PrintWriter pw;//para poder escribir
        archivo = new File("Editorial.txt");
        
        if(!archivo.exists()){//si no existe el archivo
            
            try {
                archivo.createNewFile();//creamos el archivo
                Fw = new FileWriter("Editorial.txt",true);//buscamos el archivo a escribir
                pw = new PrintWriter(Fw);
                BufferedWriter texto = new BufferedWriter(Fw);

                pw.println(na+","+na2+","+na3+","+na4+","+na5+","+na6);//escribimos en el archivo
                
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
                
                Fw = new FileWriter("Editorial.txt",true);//buscamos el archivo para escribir
                pw = new PrintWriter(Fw);//escribimos en el archivo
                BufferedWriter texto = new BufferedWriter(Fw);

                pw.println(na+","+na2+","+na3+","+na4+","+na5+","+na6);//escribimos en el archivo
                
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
    
    public LinkedList<Editorial> listaEditorial(){
            
        LinkedList<Editorial> listaEditorial = new LinkedList(); 
        
        String cadenaLeida = "";
        FileReader fr;//para leer el archivo
        File archivo;
        archivo = new File("Editorial.txt");//para buscar el archivo
        
        if(!archivo.exists()){//si no existe el archivo
            try {

                archivo.createNewFile();//creamos el archivo
                fr = new FileReader("Editorial.txt");

                BufferedReader archivoLectura = new BufferedReader(fr);//para leer el archivo
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
            
                fr = new FileReader("Editorial.txt");//leer el archivo

                BufferedReader archivoLectura = new BufferedReader(fr);//para poder leer el archivo
                cadenaLeida = archivoLectura.readLine();

                while (cadenaLeida != null) {
                    StringTokenizer st = new StringTokenizer(cadenaLeida, ",");

                    String NombreE= st.nextToken();
                    String RFC = st.nextToken();
                    String Direccion = st.nextToken();
                    long NumeroT =Long.parseLong(st.nextToken());
                    String NombreR = st.nextToken();
                    String correoE = st.nextToken();
                    Editorial Edi = new Editorial();

                    Edi.setNombreE(NombreE);
                    Edi.setRFC(RFC);
                    Edi.setDireccion(Direccion);
                    Edi.setNumeroT(NumeroT);
                    Edi.setNombreR(NombreR);
                    Edi.setCorreoE(correoE);
                    /**
                     * llamamos la funcion editorial
                     * para poder ingresar y leer los objetos que tienen 
                     * guardado en sus archivos
                     */

                    listaEditorial.add(Edi);//guardamos en la lista

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
        
        
        
        Editorial EditoNula = new Editorial("--Selecciona el editorial--", "","",0,"","");/**
         * para poder ponerlo como primer objeto y verlo en lista
         */
        listaEditorial.addFirst(EditoNula);//guardamos en la lista como primero
        return listaEditorial;//regresamos la lista 
        
    }
    
    
    
    
}
