package src.servicio;

import src.modelo.Docente;
import src.repositorio.RepositorioDocente;

import java.util.List;

public class ServicioDocente {
    private final RepositorioDocente repositorio;

    public ServicioDocente(RepositorioDocente repositorio) {
        this.repositorio = repositorio;
    }
}
