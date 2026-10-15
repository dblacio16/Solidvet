package clinicaveterinaria.model;

import clinicaveterinaria.interfaces.ITratamiento;

public class MedicamentoTratamiento implements ITratamiento {
    private final double costo;

    public MedicamentoTratamiento(double costo) {
        this.costo = costo;
    }

    @Override
    public double calcularCostoFinal() {
        return costo * 1.10;
    }

    @Override
    public String obtenerIndicaciones() {
        return "Administrar segun receta.";
    }

    @Override
    public String prepararSala() {
        return "Preparar receta y dosis.";
    }

    @Override
    public double calcularConImpuestos() {
        return costo * 1.08;
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