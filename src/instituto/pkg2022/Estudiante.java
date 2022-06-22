/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto.pkg2022;

/**
 *
 * @author Asus
 */
public class Estudiante extends Persona  {

private String carrera;
private int legajo;

public Estudiante(){
}

    public Estudiante(String carrera, int legajo) {
        this.carrera = carrera;
        this.legajo = legajo;
    }

    public Estudiante(String carrera, int legajo, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
        this.legajo = legajo;
    }
   

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    



    
}

