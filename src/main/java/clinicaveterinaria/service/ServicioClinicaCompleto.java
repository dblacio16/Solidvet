package clinicaveterinaria.service;

import clinicaveterinaria.interfaces.*;
import clinicaveterinaria.model.Cita;
import clinicaveterinaria.model.Factura;
import clinicaveterinaria.model.Mascota;
import clinicaveterinaria.model.Tratamiento;
import clinicaveterinaria.model.Veterinario;
import clinicaveterinaria.repository.BaseDatos;

import java.time.LocalDate;
import java.util.List;


public class ServicioClinicaCompleto implements IMascotaService, ICitaService, IFacturaService, IReporteService, IVeterinarioService, ITratamiento {
private final MascotaService mascotaService;
private final VeterinarioCrudService veterinarioService;
private final CitaService citaService;
private final TratamientoService tratamientoService;
private final FacturaService facturaService;
private final ReporteService reporteService;

public ServicioClinicaCompleto(BaseDatos baseDatos) {
this.mascotaService = new MascotaService(baseDatos);
this.veterinarioService = new VeterinarioCrudService(baseDatos);
this.citaService = new CitaService(baseDatos);
this.tratamientoService = new TratamientoService(baseDatos);
this.facturaService = new FacturaService(baseDatos);
this.reporteService = new ReporteService(baseDatos);
}

@Override
public void crearMascota(Mascota mascota) {
mascotaService.crearMascota(mascota);
}

@Override
public Mascota obtenerMascota(int id) {
return mascotaService.obtenerMascota(id);
}

@Override
public void actualizarMascota(Mascota mascota) {
mascotaService.actualizarMascota(mascota);
}

@Override
public void eliminarMascota(int id) {
mascotaService.eliminarMascota(id);
}

@Override
public void crearVeterinario(Veterinario veterinario) {
veterinarioService.crearVeterinario(veterinario);
}

@Override
public Veterinario obtenerVeterinario(int id) {
return veterinarioService.obtenerVeterinario(id);
}

@Override
public void actualizarVeterinario(Veterinario veterinario) {
veterinarioService.actualizarVeterinario(veterinario);
}

@Override
public void eliminarVeterinario(int id) {
veterinarioService.eliminarVeterinario(id);
}

@Override
public void crearCita(Cita cita) {
citaService.crearCita(cita);
}

@Override
public Cita obtenerCita(int id) {
return citaService.obtenerCita(id);
}

@Override
public void cancelarCita(int id) {
Cita cita = citaService.obtenerCita(id);
if (cita != null) {
cita.setDiagnostico("Cita cancelada por recepcion.");
}
}

@Override
public void crearTratamiento(Tratamiento tratamiento) {
tratamientoService.crearTratamiento(tratamiento);
}

@Override
public double calcularTratamiento(Tratamiento tratamiento) {
return tratamiento.calcularCostoFinal();
}

@Override
public void crearFactura(Factura factura) {
facturaService.crearFactura(factura);
}

@Override
public void pagarFactura(int id) {
facturaService.pagarFactura(id);
}

@Override
public List<Cita> generarReporteCitasPorVeterinario(int veterinarioId) {
return reporteService.generarReporteCitasPorVeterinario(veterinarioId);
}

@Override
public List<Mascota> generarReporteMascotasPorDueno(String duenoNombre) {
return reporteService.generarReporteMascotasPorDueno(duenoNombre);
}

@Override
public double calcularIngresosMensual() {
return reporteService.calcularIngresosMensual();
}

@Override
public double calcularCostoFinal() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'calcularCostoFinal'");
}

@Override
public String obtenerIndicaciones() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'obtenerIndicaciones'");
}

@Override
public Cita reservarCita(Mascota mascota, Veterinario veterinario, LocalDate fecha) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'reservarCita'");
}

@Override
public void diagnosticar(Cita cita, String diagnostico) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'diagnosticar'");
}
}
