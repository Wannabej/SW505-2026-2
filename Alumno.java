/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio;

/**
 *
 * @author PCC
 */
public class Alumno {
    private String codigo;
    private String nombre;
    private int ciclo_relativo;
    private String estado; //Regular, riesgo, suspendido, egresado
    
    public Alumno(String codigo, String nombre, int ciclo_relativo, String estado){
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciclo_relativo = ciclo_relativo;
        this.estado = estado;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiclo_relativo(int ciclo_relativo) {
        this.ciclo_relativo = ciclo_relativo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCiclo_relativo() {
        return ciclo_relativo;
    }

    public String getEstado() {
        return estado;
    }
    
    
    
    
    
    
    
}
