package clinicaveterinaria.model;

import clinicaveterinaria.interfaces.ITratamiento;

public class CirugiaTratamiento implements ITratamiento {
    private final double costo;

    public CirugiaTratamiento(double costo) {
        this.costo = costo;
    }

    @Override
    public double calcularCostoFinal() {
        return costo * 1.25 + 80.0;
    }

    @Override
    public String obtenerIndicaciones() {
        return "Ayuno previo y control postoperatorio.";
    }

    @Override
    public String prepararSala() {
        return "Preparar quirofano y anestesia.";
    }

    @Override
    public double calcularConImpuestos() {
        return costo * 1.35;
    }

    @Override
    public void crearTratamiento(Tratamiento tratamiento) {
        
        throw new UnsupportedOperationException("Unimplemented method 'crearTratamiento'");
    }

    @Override
    public double calcularTratamiento(Tratamiento tratamiento) {
        
        throw new UnsupportedOperationException("Unimplemented method 'calcularTratamiento'");
    }
}