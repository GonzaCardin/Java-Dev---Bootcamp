package main.java.com.educacionit.DBManager;

public class Student {
    private Integer legajo;
    private String nombre;
    private Integer edad;
    private String especialidad;

    /// se hace esto ya que el legajo y el nombre no puede ser nulo
    public Student(Integer legajo, String nombre) {
        super();
        this.legajo = legajo;
        this.nombre = nombre;

    }

    public Student(Integer legajo, String nombre, Integer edad) {
        this(legajo, nombre);
        this.edad = edad;
    }

    public Student(Integer legajo, String nombre, Integer edad, String especialidad) {
        this(legajo, nombre, edad);
        this.especialidad = especialidad;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Student [legajo=" + legajo + ", nombre=" + nombre + ", edad=" + edad + ", especialidad=" + especialidad
                + "]";
    }
}
