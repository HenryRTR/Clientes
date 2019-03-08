/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class Clientes implements Serializable{
    private String nombre;
    private String apelido1;
    private String apellido2;
    private String estado;
    private String sexo;
    private int edad;

    public Clientes(String nombre, String apelido1, String apellido2, String estado, String sexo, int edad) {
        this.nombre = nombre;
        this.apelido1 = apelido1;
        this.apellido2 = apellido2;
        this.estado = estado;
        this.sexo = sexo;
        this.edad = edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apelido1
     */
    public String getApelido1() {
        return apelido1;
    }

    /**
     * @param apelido1 the apelido1 to set
     */
    public void setApelido1(String apelido1) {
        this.apelido1 = apelido1;
    }

    /**
     * @return the apellido2
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * @param apellido2 the apellido2 to set
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " " + apelido1 + " " + apellido2 + " " + estado + " " + sexo + " " + edad;
    }
}
