package logica.vista;

import src.modelo.Alumno;
import src.modelo.Curso;
import src.modelo.Docente;
import src.modelo.Matricula;
import src.servicio.ServicioAlumno;
import src.servicio.ServicioCurso;
import src.servicio.ServicioDocente;
import src.servicio.ServicioMatricula;

import java.util.List;
import java.util.Scanner;

/**
 * Vista de consola del Sistema Académico.
 * Solo orquesta la interacción con el usuario; la lógica vive en los servicios.
 */
public class VistaConsola {

    private final ServicioAlumno servicioAlumno;
    private final ServicioDocente servicioDocente;
    private final ServicioCurso servicioCurso;
    private final ServicioMatricula servicioMatricula;
    private final Scanner scanner;

}
