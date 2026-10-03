package ar.edu.unq.poo2.tp2.reciboHaberes;

public record ReciboHaberes(
        String nombreEmpleado,
        String direccion,
        String fechaEmision,
        String sueldoBruto,
        String sueldoNeto,
        String desgloce
) {}

