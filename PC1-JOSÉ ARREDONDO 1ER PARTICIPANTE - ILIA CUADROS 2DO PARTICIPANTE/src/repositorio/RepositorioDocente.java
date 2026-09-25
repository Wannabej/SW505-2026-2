package src.repositorio;

import src.modelo.Docente;
import java.util.List;
import java.util.Optional;

public interface RepositorioDocente {
    void guardar(Docente docente);
    Optional<Docente> buscarPorCodigo(String codigo);
    List<Docente> listarTodos();
}
