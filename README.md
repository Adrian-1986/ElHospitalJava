# ElHospitalJava

POO practice in Java using a simple hospital domain: patients and doctors with inheritance, interfaces, and polymorphism. This is not a game or framework, just a clean exercise to demonstrate core OOP.

Elige tu idioma. Dejo dos secciones plegables: una en Espanol y otra en English.

<details open>
  <summary><strong>Espanol</strong></summary>

## Resumen rapido
Este proyecto modela un hospital en Java con una clase base `Character` y subclases para `Patient` y `Doctor`. En `Main` se crean pacientes y doctores y se imprime su informacion usando polimorfismo. Si entiendes este codigo, entiendes la base de POO en Java.

## Motivacion y enfoque
Queria un ejemplo concreto y facil de seguir. Por eso use un dominio de hospital con atributos claros. El objetivo es ver que es comun, que es especifico de cada tipo y como el mismo metodo cambia segun la clase real.

## Estructura de clases
- `Character` es la clase base con lo comun: `fullName`, `age`.
- `Patient` y `Doctor` heredan de `Character`.
- `Patient` agrega `condition` y `roomNumber`.
- `Doctor` agrega `licenseId`.
- `ConsultationPatient` y `AmbulancePatient` implementan flujos distintos.
- `SpecialistDoctor` y `StudentDoctor` implementan responsabilidades distintas.
- `toString()` se sobrescribe para mostrar los detalles de cada tipo.

## Flujos y responsabilidades (interfaces)
- `ConsultationFlow`: admision, chequeo de enfermeria, tratamiento, proxima cita, alta.
- `AmbulanceFlow`: admision de emergencia, operacion, rehabilitacion, alta.
- `SpecialistDuties`: horas de trabajo, vacaciones, especialidad.
- `StudentDuties`: horas de trabajo, horas de estudio, curso actual.

## Mapa del proyecto
- Codigo principal: `src/main/java/org/example/hospital`
- Punto de entrada: `Main`
- Modelo base: `Character`, `Patient`, `Doctor`
- Doctores: `SpecialistDoctor`, `StudentDoctor`
- Pacientes: `ConsultationPatient`, `AmbulancePatient`
- Interfaces: `AmbulanceFlow`, `ConsultationFlow`, `SpecialistDuties`, `StudentDuties`

## Patrones aplicados (en simple)
No hay patrones de diseno complejos, pero si hay POO clasica:
- Herencia para reutilizar lo comun.
- Encapsulacion con atributos `private` y getters/setters.
- Polimorfismo al imprimir listas de `Patient` y `Doctor`.
- Sobrescritura de `toString()` y metodos de interfaces.
- Abstraccion con clases base e interfaces.

## Ejemplo de salida
```text
Patients:
ConsultationPatient{fullName='Laura Perez', age=28, condition='Allergy', roomNumber='C-101'}
...
```

## Como correrlo
1. Abrir el proyecto en IntelliJ.
2. Ejecutar `Main`.
3. Ver la salida en consola.

## Requisitos
- Java 25 (segun `pom.xml`).

## Nota del autor
Este repo esta pensado como practica limpia. Me interesa que el codigo se entienda rapido y que la estructura sea clara, sin ruido ni dependencias raras.

</details>

<details>
  <summary><strong>English</strong></summary>

## Quick summary
This project models a hospital in Java with a `Character` base class and `Patient` and `Doctor` subclasses. In `Main` I instantiate patients and doctors and print their details using polymorphism. If you can read this code, you understand core Java OOP.

## Motivation and approach
I wanted a concrete, easy to follow example. The hospital domain keeps the data obvious. The goal is to see what is shared, what is specific, and how the same method behaves differently depending on the runtime type.

## Class structure
- `Character` is the base class with shared fields: `fullName`, `age`.
- `Patient` and `Doctor` extend `Character`.
- `Patient` adds `condition` and `roomNumber`.
- `Doctor` adds `licenseId`.
- `ConsultationPatient` and `AmbulancePatient` implement different flows.
- `SpecialistDoctor` and `StudentDoctor` implement different duties.
- `toString()` is overridden to show details per type.

## Flows and duties (interfaces)
- `ConsultationFlow`: admission, nurse check, treatment, next appointment, discharge.
- `AmbulanceFlow`: emergency admission, operation, rehabilitation, discharge.
- `SpecialistDuties`: weekly work hours, vacation days, specialty.
- `StudentDuties`: weekly work hours, study hours, current course.

## Project map
- Main code: `src/main/java/org/example/hospital`
- Entry point: `Main`
- Base model: `Character`, `Patient`, `Doctor`
- Doctors: `SpecialistDoctor`, `StudentDoctor`
- Patients: `ConsultationPatient`, `AmbulancePatient`
- Interfaces: `AmbulanceFlow`, `ConsultationFlow`, `SpecialistDuties`, `StudentDuties`

## Patterns used (simple)
No advanced design patterns here, but classic OOP patterns are present:
- Inheritance to reuse shared state.
- Encapsulation using `private` fields and getters/setters.
- Polymorphism when printing lists of `Patient` and `Doctor`.
- Overriding of `toString()` and interface methods.
- Abstraction with base classes and interfaces.

## Sample output
```text
Patients:
ConsultationPatient{fullName='Laura Perez', age=28, condition='Allergy', roomNumber='C-101'}
...
```

## How to run
1. Open the project in IntelliJ.
2. Run `Main`.
3. Check the console output.

## Requirements
- Java 25 (per `pom.xml`).

## Author note
This repo is a clean practice project. The goal is readable code and a clear structure without extra noise or heavy dependencies.

</details>
