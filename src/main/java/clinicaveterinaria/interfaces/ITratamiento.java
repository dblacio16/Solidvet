package clinicaveterinaria.interfaces;

import clinicaveterinaria.model.Tratamiento;

public interface ITratamiento {
    double calcularCostoFinal();

    String obtenerIndicaciones();

    void crearTratamiento(Tratamiento tratamiento);

    double calcularTratamiento(Tratamiento tratamiento);
}
