package src.modelo;

import java.time.LocalDate;

public class matricula {
    private final String codigoAlumno;
    private final String codigoCurso;
    private final String periodo; // "2026-2",
    private final LocalDate fecha;

    public matricula(String alumn, String curs) {
        this.codigoAlumno = alumn;
        this.codigoCurso = curs;
    }

}
