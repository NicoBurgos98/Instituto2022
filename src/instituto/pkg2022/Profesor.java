/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto.pkg2022;

/**
 *
 * @author Asus
 */
public class Profesor extends Persona{
    
    private String materia;
    private String cargo;

    public Profesor() {
    }

    public Profesor(String materia, String cargo) {
        this.materia = materia;
        this.cargo = cargo;
    }

    public Profesor(String materia, String cargo, String nombre, int edad) {
        super(nombre, edad);
        this.materia = materia;
        this.cargo = cargo;
    }

    

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
}
