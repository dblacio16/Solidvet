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
##integrante3:LSP
Checklist de validación:

| Criterio | Sí/No |
| --- | --- |
| El proyecto compila |Si |
| Ningún animal implementa acciones imposibles |si |
| No hay `UnsupportedOperationException` por capacidades naturales |si |
| El código cliente usa la interfaz correcta según la acción | si|

Preguntas de discusión:

- ¿Por qué lanzar `UnsupportedOperationException` puede ser señal de mal diseño?
    porque viola el principio de LSP ya que el sistema no deberia reporse cuando una subclase esta siendo sustituida
- ¿Qué contrato estaba prometiendo `Animal`? se rompia el contrato de que cada unimal creado tendria capacidades como volar nadar y caminar pero no todo animal en realidad posee de estas avalidades.
- ¿Cómo cambia el diseño cuando modelamos capacidades en lugar de herencia amplia?
pasa de un modelo basado en herencia a un modelo basado en lo que el objeto puede hacer 

- ¿Qué problema causa una interfaz gigante en equipos grandes?
- Genera cuellos de botella y conflictos al fusionar el código. Además, obliga a otras clases a implementar métodos inútiles, y cualquier cambio pequeño requiere recompilar gran parte del sistema.
- ¿Por qué `new DirectoBaseDatos()` dificulta cambiar o probar la clase?
- Porque crea un acoplamiento fuerte. Te impide inyectar bases de datos de prueba (mocks) para hacer testing, y te obliga a alterar el código interno si decides cambiar de motor de base de datos en el futuro.
- ¿Qué dependencia debería conocer el código de alto nivel: interfaz o clase concreta?
- Siempre una interfaz (abstracción). Esto permite que el código sea flexible y puedas intercambiar implementaciones concretas sin modificar la lógica principal de negocio.
