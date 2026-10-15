package clinicaveterinaria.model;

import clinicaveterinaria.interfaces.ITratamiento;

public class VacunaTratamiento implements ITratamiento {
    private final double costo;

    public VacunaTratamiento(double costo) {
        this.costo = costo;
    }

    @Override
    public double calcularCostoFinal() {
        return costo + 5.0;
    }

    @Override
    public String obtenerIndicaciones() {
        return "Observar fiebre durante 24 horas.";
    }

    @Override
    public String prepararSala() {
        return "Preparar refrigeracion y jeringas.";
    }

    @Override
    public double calcularConImpuestos() {
        return costo * 1.12;
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