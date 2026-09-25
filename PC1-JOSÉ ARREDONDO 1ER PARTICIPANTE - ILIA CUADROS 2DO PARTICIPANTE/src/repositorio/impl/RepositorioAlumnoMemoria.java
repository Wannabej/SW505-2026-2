package src.repositorio.impl;

import src.modelo.Alumno;
import src.repositorio.RepositorioAlumno;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class RepositorioAlumnoMemoria implements RepositorioAlumno {
    private final Map<String, Alumno> almacen = new LinkedHashMap<>();

    @Override
    public void guardar(Alumno alumno) {
        almacen.put(alumno.getCodigo(), alumno);
    }

    @Override
    public Optional<Alumno> buscarPorCodigo(String codigo) {
        return Optional.ofNullable(almacen.get(codigo));
    }

    @Override
    public List<Alumno> listarTodos() {
        return new ArrayList<>(almacen.values());
    }
}
