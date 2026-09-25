package src.repositorio.impl;

import src.modelo.Docente;
import src.repositorio.RepositorioDocente;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class RepositorioDocenteMemoria implements RepositorioDocente {
    private final Map<String, Docente> almacen = new LinkedHashMap<>();

    @Override
    public void guardar(Docente docente) {
        almacen.put(docente.getCodigo(), docente);
    }

    @Override
    public Optional<Docente> buscarPorCodigo(String codigo) {
        return Optional.ofNullable(almacen.get(codigo));
    }

    @Override
    public List<Docente> listarTodos() {
        return new ArrayList<>(almacen.values());
    }
}
