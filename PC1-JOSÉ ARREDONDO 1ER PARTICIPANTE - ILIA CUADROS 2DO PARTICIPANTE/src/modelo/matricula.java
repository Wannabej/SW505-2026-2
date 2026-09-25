package src.modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Matricula {
    private final String codigoAlumno;
    private final String codigoCurso;
    private final String periodo;       // ej. "2026-2", "Verano 2027"
    private final LocalDate fecha;

    public Matricula(String codigoAlumno, String codigoCurso, String periodo) {
        this.codigoAlumno = codigoAlumno;
        this.codigoCurso  = codigoCurso;
        this.periodo      = periodo;
        this.fecha        = LocalDate.now();
    }

    public String getCodigoAlumno() { return codigoAlumno; }
    public String getCodigoCurso()  { return codigoCurso;  }
    public String getPeriodo()      { return periodo;      }
    public LocalDate getFecha()     { return fecha;        }

    // Igualdad por (alumno, curso, periodo): impide doble matrícula
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Matricula)) return false;
        Matricula m = (Matricula) o;
        return Objects.equals(codigoAlumno, m.codigoAlumno)
            && Objects.equals(codigoCurso,  m.codigoCurso)
            && Objects.equals(periodo,      m.periodo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoAlumno, codigoCurso, periodo);
    }

    @Override
    public String toString() {
        return codigoAlumno + " en " + codigoCurso + " (" + periodo + ")";
    }
}
