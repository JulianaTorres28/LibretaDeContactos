package ec.edu.ups.poo.clases;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Familiar extends Persona {
    private String parentesco;
    private String tipoDeSangre;
    private GregorianCalendar fechaDeNacimiento;
    private int edad;


    public Familiar(String cedula, String nombre, String apellido, String direccion, String parentesco, String tipoDeSangre, GregorianCalendar fechaDeNacimiento) {
        super(cedula, nombre, apellido, direccion);
        this.parentesco = parentesco;
        this.tipoDeSangre = tipoDeSangre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Familiar() {
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public Calendar getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEdad() { // cambiar por calcularEdad para no devolver a la edad que no se actualiza 
        return edad;
    }

    public int calcularEdad() {
        Calendar hoy= Calendar.getInstance();
        int añoActual = hoy.get(Calendar.YEAR);
        int añoNacimiento = fechaDeNacimiento.get(Calendar.YEAR);
        return (añoActual - añoNacimiento);
    }
    @Override
    public String toString() {
        return super.toString() +
                ", \n\t Parentesco: " + parentesco +
                ", \n\t Tipo de sangre: " + tipoDeSangre +
                "\n\t Edad: " + calcularEdad(); // validar para que no salga una excepcion

    }
}
