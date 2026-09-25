package src.repositorio.impl;

import src.modelo.Matricula;
import src.repositorio.RepositorioMatricula;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioMatriculaMemoria implements RepositorioMatricula {
    private final List<Matricula> almacen = new ArrayList<>();

    @Override
    public void guardar(Matricula m) {
        almacen.add(m);
    }

    @Override
    public boolean existe(String codigoAlumno, String codigoCurso, String periodo) {
        for (Matricula m : almacen) {
            if (m.getCodigoAlumno().equals(codigoAlumno)
                    && m.getCodigoCurso().equals(codigoCurso)
                    && m.getPeriodo().equals(periodo)) {
                return true;
            }
        }
        return false;
    }

}
