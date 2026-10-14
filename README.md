## Integrante 1 - Single Responsibility Principle (SRP)

**Responsable:** Integrante 1

### Análisis del problema
Se identificó que la clase modelo `Veterinario.java` violaba el principio SRP al tener múltiples responsabilidades: además de almacenar los datos del empleado, contenía lógica de negocio para reservar citas, diagnosticar, generar facturas y crear reportes. Asimismo, `BaseDatos.java` estaba mezclando el almacenamiento de datos con lógica de negocio (cálculo de ingresos).

### Cambios realizados
1. **Refactorización de `Veterinario.java`:** Se eliminaron los métodos de lógica de negocio (`reservarCita`, `diagnosticar`, `generarFactura`, `crearReporte`), convirtiendo la clase en un modelo de datos puro (POJO) con una única razón para cambiar: sus atributos.
2. **Limpieza en `BaseDatos.java`:** Se eliminó el método `calcularIngresosMensual()`, ya que esta responsabilidad pertenece exclusivamente a `ReporteService`.
3. **Delegación a Servicios:** Se trasladó la responsabilidad operativa a las clases `ReservaService`, `DiagnosticoService` y `FacturacionService` correspondientes.
4. **Actualización del cliente (`Main.java`):** Se adaptó el código para instanciar los servicios, inyectarles la misma base de datos y utilizarlos para operar sobre el modelo en lugar de llamar a los métodos previamente acoplados en la clase `Veterinario`.

### Respuestas a preguntas de discusión
* **¿Cuántas razones para cambiar tenía `Veterinario` antes del refactoring?**
  Al menos cinco: si cambiaban los atributos del modelo, las reglas para agendar citas, la lógica de los diagnósticos, el cálculo y creación de facturas, o la estructura de los reportes.
* **¿Qué ganamos al separar modelo y servicios?**
  Obtenemos alta cohesión y bajo acoplamiento. Ahora el modelo de datos es reutilizable en cualquier parte del sistema sin arrastrar lógicas pesadas. Además, la lógica de negocio vive en servicios aislados, lo que facilita las pruebas unitarias y el mantenimiento.
* **¿Qué clase debería cambiar si mañana cambia el formato del reporte?**
  Solamente `ReporteService` (la lógica del reporte) o la clase encargada de la vista (`GestorReportesClinica`). El modelo `Veterinario` y `BaseDatos` permanecerán intactos y cerrados a este cambio.
¿Por qué los condicionales repetidos hacen más caro el cambio?
La addicion de bucles por cada tratamiento genera cambios de mas.
- ¿Qué pasaría si agregamos `Odontologia` como tratamiento?
- Se agrega su clase propia.
- ¿Cuándo una interfaz ayuda a extender el sistema?
- Un caso para evitar el uso excesivo de switch.
