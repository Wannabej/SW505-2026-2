/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratorio;
import java.util.ArrayList;

/**
 *
 * @author PCC
 */
public class Laboratorio {

    public static void main(String[] args) {
        ArrayList<Seccion> lista = new ArrayList<>();
        
        Alumno a1 = new Alumno("20261003J", "Carlos Ramirez", 1, "Regular"), a2 = new Alumno("20241339", "Sarah", 5, "Suspendido"), a3 = new Alumno("20251344G", "Jose Perez", 3, "Riesgo"), a4;
        a4 = new Alumno("20254555", "Csmila", 3, "Regular");
        Curso c1 = new Curso("BC101", "Calculo I", 1, 5), c2 = new Curso("BMA02", "Calculo II", 2, 5), c3 = new Curso("BMA03", "Calculo III", 3, 5), c4 = new Curso("BRC02", "Algebra Lineal", 2, 4);
        Docente d1 = new Docente("Vasquez"), d2 = new Docente("Guerra"), d3 = new Docente("Chavez"), d4 = new Docente("Reyna");
        
        //Secciones
        Seccion s1 = new Seccion(d1, c1, 'X', 35), s2 = new Seccion(d2, c2, 'X', 36), s3 = new Seccion(d3, c1, 'Y', 30), s4 = new Seccion(d1, c3, 'X', 40), s5 = new Seccion(d4, c4, 'X', 45);
        lista.add(s1);
        lista.add(s2);
        lista.add(s3);
        lista.add(s4);
        lista.add(s5);
        //Matriculas
        Matricula m1 = new Matricula(2233, a1, s1), m2 = new Matricula(2234, a3, s3), m3 = new Matricula(2235, a3, s5), m4 = new Matricula(2240, a4, s4), m5 = new Matricula(2241, a3, s4);
        for(Seccion s : lista){
            System.out.println("Cantidad de matriculados: " + s.getCant_matriculados() + ", Seccion: " + s.getLetra_seccion() + ", Nombre: " + s.getCurso()); 
        }
        
    }
}
