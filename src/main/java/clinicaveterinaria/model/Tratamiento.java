package clinicaveterinaria.model;
import clinicaveterinaria.interfaces.ITratamiento;
import java.util.Objects;


public class Tratamiento {
    private int id;
    private final ITratamiento comportamiento;
    private String descripcion;
    private double costo;

    public Tratamiento(int id, String descripcion, double costo, ITratamiento comportamiento) {
        this.id = id;
        this.descripcion = descripcion;
        this.costo = costo;
        this.comportamiento = comportamiento;
    }

    public double calcularCostoFinal() {
        return comportamiento.calcularCostoFinal();
    }

    public String obtenerIndicaciones() {
        return comportamiento.obtenerIndicaciones();
    }
    public String prepararSala() {
        return comportamiento.prepararSala();
    }   
     public double calcularConImpuestos() {
        return comportamiento.calcularConImpuestos();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tratamiento)) {
            return false;
        }
        Tratamiento that = (Tratamiento) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Tratamiento{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", costo=" + costo +
                '}';
    }
}
