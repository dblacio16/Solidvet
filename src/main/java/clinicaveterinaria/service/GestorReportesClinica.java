package clinicaveterinaria.service;

import clinicaveterinaria.interfaces.IBaseDatos;

public class GestorReportesClinica {
//Dependencia abstraída
private final IBaseDatos baseDatos;

//Inyección por constructor
public GestorReportesClinica(IBaseDatos baseDatos) {
this.baseDatos = baseDatos;
}

public void imprimirResumenOperaciones() {

System.out.println("Resumen interno: Operaciones de reportes solicitadas al sistema.");
}
}