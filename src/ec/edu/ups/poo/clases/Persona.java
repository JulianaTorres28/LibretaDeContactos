package ec.edu.ups.poo.clases;

public class Persona {
    private String cedula; //si no int y tiene 0 a la izquierda lo elimina
    private String nombre;
    private String apellido;
    private String direccion;

    public Persona(String cedula){
        this.cedula = cedula;
    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String cedula, String nombre, String apellido, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }
    public Persona(){

    }

    public void setCedula(String cedula){
        this.cedula=cedula;
    }
    public String getCedula() {
        return cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int sumar(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }

    @Override
    public String toString(){
        return "\tCedula: " + cedula +
                ",\n\t Nombre: " + nombre +
                ",\n\t Apellido: " + apellido +
                ",\n\t Direccion: " + direccion;
    }


}
