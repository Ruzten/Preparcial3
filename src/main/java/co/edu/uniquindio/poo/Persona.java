package co.edu.uniquindio.poo;

public abstract class Persona {
    protected String nombres;
    protected String apellidos;
    protected String id;
    protected String fechaNacimiento;
    protected int sueldo;

    public Persona(String nombres, String apellidos, String id, String fechaNacimiento, int sueldo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
        this.sueldo = sueldo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    // METODOS



}
