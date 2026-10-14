# ClinicaVeterinaria

Proyecto Java Maven para practicar refactoring con principios SOLID en un taller colaborativo.

El sistema funciona desde el inicio, pero contiene violaciones intencionales de SRP, OCP, LSP, ISP y DIP. La idea es que cada integrante refactorice una zona del código sin romper la ejecución.

## Setup en 5 minutos


Compilar con Maven. Salida esperada:

```text
=== ClinicaVeterinaria funcionando ===
```

## Estructura del proyecto

```text
src/main/java/clinicaveterinaria/
├── Main.java
├── interfaces/
│   ├── IAnimal.java
│   ├── IBaseDatos.java
│   ├── IServicioClinica.java
│   ├── ITratamiento.java
│   └── IVeterinarioService.java
├── model/
│   ├── Mascota.java
│   ├── Veterinario.java
│   ├── Cita.java
│   ├── Tratamiento.java
│   ├── Factura.java
│   └── clases auxiliares para animales y enums
├── repository/
│   ├── BaseDatos.java
│   └── DirectoBaseDatos.java
└── service/
    ├── ReservaService.java
    ├── DiagnosticoService.java
    ├── FacturacionService.java
    ├── ReporteService.java
    └── servicios CRUD y clases con violaciones intencionales
```

## Trabajo del taller

- Integrante 1: refactorizar SRP.
- Integrante 2: refactorizar OCP.
- Integrante 3: refactorizar LSP.
- Integrante 4: refactorizar ISP y DIP.

Lee `guia.md` para instrucciones, checklists y preguntas de discusión.

## Preguntas

### LSP

**¿Por qué lanzar UnsupportedOperationException puede ser señal de mal diseño?**
Porque esta obligando a una clase a hacer cosas que capaz no puede hacer.

**¿Qué contrato estaba prometiendo Animal?**
Que todos los animales corrian, nadaban y volaban.

**¿Cómo cambia el diseño cuando modelamos capacidades en lugar de herencia amplia?**
Que al momento de crear alguna nueva interfaz, solo debemos implementarsela a la Clase que queremos, no debemos hacer las excepciones ya que no se heredan para todas las clases.