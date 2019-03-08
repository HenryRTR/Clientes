/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IODatos;

import Clases.Clientes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Fichero {
    public static void guardarClientes(ArrayList<Clientes> vClientes){
        File fichero = new File("Clientes.dat");
        
        if(!fichero.exists()){
            try {
                fichero.createNewFile();
            } catch (IOException ex) {
                System.out.println("No se Pudo Crear Fichero Cliente");
            }
        }
        
        FileOutputStream out = null;
        ObjectOutputStream escribir = null;
        
        try {
            out = new FileOutputStream(fichero);
            escribir = new ObjectOutputStream(out);
            
            for (Clientes c : vClientes) {
                escribir.writeObject(c);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("No se Encontro Fichero");
        } catch (IOException ex) {
            System.out.println("No se Pudo Escribir en Fichero");
        }finally{
            if(escribir != null){
                try {
                    escribir.close();
                } catch (IOException ex) {
                    System.out.println("No se Pudo Cerrar el Fichero");
                }
            }
        }
    }
    
    public static ArrayList<Clientes> leerClientes(){
        ArrayList<Clientes> vClientes = new ArrayList<>();
        
        File fichero = new File("Clientes.dat");

        FileInputStream in = null;
        ObjectInputStream leer = null;
        
        try {
            in = new FileInputStream(fichero);
            leer = new ObjectInputStream(in);
            
            while (true) {                
                vClientes.add((Clientes) leer.readObject());
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("No se Encontro Fichero");
        } catch (IOException ex) {
            
        } catch (ClassNotFoundException ex) {
            System.out.println("No se Pudo Escribir en Fichero");
        }finally{
            if(leer != null){
                try {
                    leer.close();
                } catch (IOException ex) {
                    System.out.println("No se Pudo Cerrar el Fichero");
                }
            }
        }
        return vClientes;
    }    
}
