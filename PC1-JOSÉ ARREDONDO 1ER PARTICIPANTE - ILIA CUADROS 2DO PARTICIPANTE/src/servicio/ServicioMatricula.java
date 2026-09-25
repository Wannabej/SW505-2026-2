package src.servicio;

import src.modelo.Matricula;
import src.repositorio.RepositorioAlumno;
import src.repositorio.RepositorioCurso;
import src.repositorio.RepositorioMatricula;

import java.util.List;

/**
 * Módulo de matrícula separado.
 * Encapsula el período y la validación de duplicados.
 * Toda la lógica de negocio de matrícula vive aquí.
 */
public class ServicioMatricula {
    private final RepositorioMatricula repositorioMatricula;
    private final RepositorioAlumno    repositorioAlumno;
    
}
