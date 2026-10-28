
package com.est.demo.model;

public class Estudiante extends Persona {
    protected String codigo;
    protected String carrera;

    public Estudiante() {
        super();
    }

    public Estudiante(String nombre, String apellido, int edad, String codigo, String carrera) {
        super(nombre, apellido, edad);
        this.codigo = codigo;
        this.carrera = carrera;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
