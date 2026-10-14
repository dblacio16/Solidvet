package clinicaveterinaria.model;

import java.util.Objects;

import clinicaveterinaria.interfaces.ITratamiento;


public class Tratamiento {
    private int id;
    private TipoTratamiento tipo;
    private String descripcion;
    private double costo;
    private ITratamiento comportamiento;

    public Tratamiento(int id, String descripcion, double costo, ITratamiento comportamiento) {
        this.id = id;
        this.descripcion = descripcion;
        this.costo = costo;
        this.comportamiento = comportamiento;
    }

    public String prepararSala(){
        return comportamiento.prepararSala();
    }
    public double calcularCostoFinal(){
        return comportamiento.calcularCostoFinal();
    }
    public String obtenerIndicaciones(){
        return comportamiento.obtenerIndicaciones();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoTratamiento getTipo() {
        return tipo;
    }

    public void setTipo(TipoTratamiento tipo) {
        this.tipo = tipo;
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
                ", tipo=" + tipo +
                ", descripcion='" + descripcion + '\'' +
                ", costo=" + costo +
                '}';
    }
}
