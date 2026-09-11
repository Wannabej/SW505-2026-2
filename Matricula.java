/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio;

/**
 *
 * @author PCC
 */
public class Matricula {
    int cod_matricula;
    Alumno alumno;
    Seccion seccion;
    
    public Matricula(int cod_matricula, Alumno alumno, Seccion seccion){
        this.seccion = seccion;
        this.seccion.setCant_matriculados(this.seccion.getCant_matriculados() + 1);
        this.alumno = alumno;
        this.cod_matricula = cod_matricula;
    }

    public int getCod_matricula() {
        return cod_matricula;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setCod_matricula(int cod_matricula) {
        this.cod_matricula = cod_matricula;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }
    
    
    
}
