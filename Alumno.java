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
    
}
