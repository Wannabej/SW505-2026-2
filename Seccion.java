/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio;

/**
 *
 * @author PCC
 */
public class Seccion {
    private char letra_seccion;
    private int capacidad_total;
    private int cant_matriculados = 0;
    Docente docente;
    Curso curso;
    
    public Seccion(Docente docente, Curso curso, char letra_seccion, int capacidad_total){
        this.docente = docente;
        this.curso = curso;
        this.letra_seccion = letra_seccion;
        this.capacidad_total = capacidad_total;
    }
    
}
