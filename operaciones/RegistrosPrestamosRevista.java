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
import java.text.ParseException;
import java.util.LinkedList;
import java.util.StringTokenizer;
import uam.pvoe.atributos.Cliente;
import uam.pvoe.atributos.PrestamosRevista;
import uam.pvoe.atributos.Revistas;
import uam.pvoe.sw.formas.FrConsultasPrestamos;

/**
 *
 * @author Guerrero Cangas Sebastian
 * proyecto final
 */
public class RegistrosPrestamosRevista {
    
    public void llenadoRP(String na,String na2,String na3,String na4,String na5,long p,String na6, String na7){
       
        String cadenaLeida = "";
        File archivo;
        FileWriter Fw;
        PrintWriter pw;
        archivo = new File("PrestamosRevistas.txt");
        
        if(!archivo.exists()){//si no existe el archivo
            
            try {
                archivo.createNewFile();//creamos el archivo
                Fw = new FileWriter("PrestamosRevistas.txt",true);
                pw = new PrintWriter(Fw);//para poder escribir en el archivo
                BufferedWriter texto = new BufferedWriter(Fw);

                pw.println(na+","+na2+","+na3+","+na4+","+na5+","+p+","+na6+","+na7);/**
                 * escribimos en el archivo
                 */
               
                pw.close();//cerramos la escritura

                Fw.close();//cerramos la escritura de archivo

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
                
                Fw = new FileWriter("PrestamosRevistas.txt",true);
                pw = new PrintWriter(Fw);//para poder escribir en el archivo
                BufferedWriter texto = new BufferedWriter(Fw);

                pw.println(na+","+na2+","+na3+","+na4+","+na5+","+p+","+na6+","+na7);/**
                 * escribimos en el archivo
                 */
               
                pw.close();//cerramos la escritura

                Fw.close();//cerramos la escritura de archivo
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
    
    public LinkedList<PrestamosRevista> listaRP(String na){
            
        LinkedList<PrestamosRevista> listaRevistasPrestamos = new LinkedList(); 
        
        String cadenaLeida = "";
        FileReader fr;//para poder leer el archivo
        File archivo;
        archivo = new File("PrestamosRevistas.txt");
        
        if(!archivo.exists()){//si no existe el archivo
            try {
         
                 archivo.createNewFile();//creamos el archivo
                fr = new FileReader("PrestamosRevistas.txt");

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
                fr = new FileReader("PrestamosRevistas.txt");//leemos el archivo

                BufferedReader archivoLectura = new BufferedReader(fr);
                cadenaLeida = archivoLectura.readLine();

                while (cadenaLeida != null) {
                    StringTokenizer st = new StringTokenizer(cadenaLeida, ",");

                    String Nombre= st.nextToken();
                    String ApellidoP = st.nextToken();
                    String ApellidoM = st.nextToken();
                    String Curp = st.nextToken();
                    String Revista = st.nextToken();
                    long Numero = Long.parseLong(st.nextToken());
                    String Fecha = st.nextToken();
                    String FRegreso = st.nextToken();

                    PrestamosRevista rev = new PrestamosRevista();
                    PrestamosRevista revs = new PrestamosRevista();
                    
                    revs.setCurp(Curp);
                    rev.setNombre(Nombre);
                    rev.setApellidoP(ApellidoP);
                    rev.setApellidoM(ApellidoM);
                    rev.setCurp(Curp);
                    rev.setFecha(Fecha);
                    rev.setFRegreso(FRegreso);
                    rev.setRevista(Revista);
                    rev.setNumero(Numero);
                    /**
                     * llamamos la funcion de prestamos
                     * para poder leer los objetos de las prestamos revista
                     * para despues agregarlo a una lista
                     */
                    
                    if(rev.getCurp().compareTo(na)==0){//para poder delimitar la lista
                        listaRevistasPrestamos.add(rev);
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
        
        return listaRevistasPrestamos;//regresamos la lista 
        
    }
    
}


