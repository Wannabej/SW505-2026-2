package src.repositorio;

import src.modelo.Alumno;
import java.util.List;
import java.util.Optional;

public interface RepositorioAlumno {
    void guardar(Alumno alumno);
    Optional<Alumno> buscarPorCodigo(String codigo);
    List<Alumno> listarTodos();
}
