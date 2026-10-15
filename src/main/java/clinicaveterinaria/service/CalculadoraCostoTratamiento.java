package clinicaveterinaria.service;

import clinicaveterinaria.model.Tratamiento;

public class CalculadoraCostoTratamiento {

    public double calcularConImpuestos(Tratamiento tratamiento) {
        return tratamiento.calcularConImpuestos();
    }
}