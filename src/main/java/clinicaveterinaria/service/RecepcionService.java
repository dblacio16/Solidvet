package clinicaveterinaria.service;

import clinicaveterinaria.interfaces.ICitaService;
import clinicaveterinaria.interfaces.IMascotaService;
import clinicaveterinaria.model.Cita;
import clinicaveterinaria.model.Mascota;

public class RecepcionService implements IMascotaService, ICitaService {

private final IMascotaService mascotaService;
private final ICitaService citaService;

public RecepcionService(IMascotaService mascotaService, ICitaService citaService) {
this.mascotaService = mascotaService;
this.citaService = citaService;
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
public void crearCita(Cita cita) {
citaService.crearCita(cita);
}

@Override
public Cita obtenerCita(int id) {
return citaService.obtenerCita(id);
}

@Override
public void cancelarCita(int id) {
citaService.cancelarCita(id);
}
}