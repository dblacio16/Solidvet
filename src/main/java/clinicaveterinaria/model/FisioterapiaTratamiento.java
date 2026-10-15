package clinicaveterinaria.model;

import clinicaveterinaria.interfaces.ITratamiento;

public class FisioterapiaTratamiento implements ITratamiento {
    private final double costo;

    public FisioterapiaTratamiento(double costo) {
        this.costo = costo;
    }

    @Override
    public double calcularCostoFinal() {
        return costo * 0.95;
    }

    @Override
    public String obtenerIndicaciones() {
        return "Repetir sesiones dos veces por semana.";
    }

    @Override
    public String prepararSala() {
        return "Preparar camilla y bandas elasticas.";
    }

    @Override
    public double calcularConImpuestos() {
        return costo * 1.05;
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