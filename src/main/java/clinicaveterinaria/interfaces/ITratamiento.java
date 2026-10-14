package clinicaveterinaria.interfaces;

import clinicaveterinaria.model.TipoTratamiento;

public interface ITratamiento {
    double calcularCostoFinal();

    String obtenerIndicaciones();

    String prepararSala();

}
