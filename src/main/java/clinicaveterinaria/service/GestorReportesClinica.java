package clinicaveterinaria.service;

import clinicaveterinaria.repository.BaseDatos;

public class GestorReportesClinica {
    private final BaseDatos baseDatos;

    // Se inyecta por constructor para no crear una base de datos nueva y vacía
    public GestorReportesClinica(BaseDatos baseDatos) {
        this.baseDatos = baseDatos;
    }

    public void imprimirResumenOperaciones() {
        System.out.println("Resumen interno: " + baseDatos.getAuditoria());
    }
}
