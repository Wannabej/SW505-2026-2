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

    public void setLetra_seccion(char letra_seccion) {
        this.letra_seccion = letra_seccion;
    }

    public void setCapacidad_total(int capacidad_total) {
        this.capacidad_total = capacidad_total;
    }

    public void setCant_matriculados(int cant_matriculados) {
        this.cant_matriculados = cant_matriculados;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public char getLetra_seccion() {
        return letra_seccion;
    }

    public int getCapacidad_total() {
        return capacidad_total;
    }

    public int getCant_matriculados() {
        return cant_matriculados;
    }

    public Docente getDocente() {
        return docente;
    }

    public String getCurso() {
        return this.curso.getNombre();
    }
    
    
    
}
