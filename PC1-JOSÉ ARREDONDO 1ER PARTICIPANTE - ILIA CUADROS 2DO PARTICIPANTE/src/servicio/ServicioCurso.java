package src.servicio;

import src.modelo.Curso;
import src.repositorio.RepositorioCurso;
import src.repositorio.RepositorioDocente;

import java.util.List;

public class ServicioCurso {
    private final RepositorioCurso repositorioCurso;
    private final RepositorioDocente repositorioDocente;

    public ServicioCurso(RepositorioCurso repositorioCurso, RepositorioDocente repositorioDocente) {
        this.repositorioCurso = repositorioCurso;
        this.repositorioDocente = repositorioDocente;
    }

}
