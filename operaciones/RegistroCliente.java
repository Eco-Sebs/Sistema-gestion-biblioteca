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
import uam.pvoe.atributos.Cliente;
import uam.pvoe.atributos.Editorial;
import uam.pvoe.atributos.Libros;

/**
 *
 * @author Guerrero Cangas Sebastian
 * proyecto final
 */
public class RegistroCliente {
    
    public void llenadoC(String na,String na2,String na3,String na4,String na5,String na6, long p, String na7, String na8){
       
        String cadenaLeida = "";
        File archivo;
        FileWriter Fw;//para poder escribir en el archivo
        PrintWriter pw;//escribimos 
        archivo = new File("Cliente.txt");/**
         * para poder buscar si existe el archivo
         */
        
        if(!archivo.exists()){//si no existe el archivo
            
            try {
                archivo.createNewFile();//creamos el archivo
                Fw = new FileWriter("Cliente.txt",true);
                pw = new PrintWriter(Fw);
                BufferedWriter texto = new BufferedWriter(Fw);

                pw.println(na+","+na2+","+na3+","+na4+","+na5+","+na6+","+p+","+na7+","+na8);/**
                 * escribimos en el archivo con un salto de linea
                 */
                pw.close();//cerramos la escritura

                Fw.close();//cerramos la escritura sobre el archivo

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
                
                Fw = new FileWriter("Cliente.txt",true);
                pw = new PrintWriter(Fw);
                BufferedWriter texto = new BufferedWriter(Fw);

                pw.println(na+","+na2+","+na3+","+na4+","+na5+","+na6+","+p+","+na7+","+na8);
               
                 pw.close();//cerrar la escritura archivo

                 Fw.close();//cerrar el archivo

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
    
    public LinkedList<Cliente> listaCliente(){//lista de los clientes
            
        LinkedList<Cliente> listaEditorial = new LinkedList(); 
        
        String cadenaLeida = "";
        FileReader fr;//para poder leer el archivo
        File archivo;
        archivo = new File("Cliente.txt");
        
        if(!archivo.exists()){//si no existe el archivo
            try {

                archivo.createNewFile();//creamos el archivo
                fr = new FileReader("Cliente.txt");//leemos el archivo

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
        }else{
             try {
            
                fr = new FileReader("Cliente.txt");//leemos el archivo

                BufferedReader archivoLectura = new BufferedReader(fr);
                cadenaLeida = archivoLectura.readLine();

                while (cadenaLeida != null) {
                    StringTokenizer st = new StringTokenizer(cadenaLeida, ",");

                    String NombreE= st.nextToken();
                    String ApellidoP = st.nextToken();
                    String ApellidoM = st.nextToken();
                    String curp = st.nextToken();
                    String CorreoE = st.nextToken();
                    String Direccion = st.nextToken();
                    long Telefono =Long.parseLong(st.nextToken());
                    String genero = st.nextToken();
                    String gustos = st.nextToken();
                    
                    Cliente Cli = new Cliente();
                    

                    Cli.setNombre(NombreE);
                    Cli.setApellidoP(ApellidoP);
                    Cli.setApellidoM(ApellidoM);
                    Cli.setCurp(curp);
                    Cli.setCorreoE(CorreoE);
                    Cli.setDireccion(Direccion);
                    Cli.setTelefono(Telefono);
                    Cli.setGenero(genero);
                    Cli.setGustos(gustos);
                    
                    /**
                     * creamos un objeto cliente y recibimos
                     * cada informacion de cada objeto
                     */
                    
                    listaEditorial.add(Cli);//lo guardamos en la lista

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
        
        Cliente CliNula = new Cliente("--Selecciona el cliente--", "","","","","",0,"","");
        listaEditorial.addFirst(CliNula);
        return listaEditorial;//regresamos la lista 
        
    }
    
}
