package ec.edu.ups.poo.principal;

import ec.edu.ups.poo.clases.Familiar;
import ec.edu.ups.poo.clases.Persona;

import java.util.Scanner;
import java.util.GregorianCalendar;

public class Principal {

    public static void main(String[] args) {
        // Instanciar Scanner
        Scanner sc = new Scanner(System.in); // cerrar el scanner al terminar el codigo 

        Persona personita = new Persona();

        // Ingreso del número de personas
        System.out.print("Ingrese el número de personas: ");
        int numeroDePersonas = sc.nextInt();
        Persona[] personas = new Persona[numeroDePersonas];

        // Ingreso del número de familiares
        System.out.print("Ingrese la cantidad de familiares que guardará: ");
        int numeroDeFamiliares = sc.nextInt();
        Familiar[] familiares = new Familiar[numeroDeFamiliares];

        // Ingreso de datos de personas
        for (int i = 0; i < numeroDePersonas; i++) {
            System.out.println("Ingrese los datos de la persona " + (i + 1) + " --------");
            System.out.print("Ingrese el número de cédula: ");
            String cedula = sc.next();
            System.out.print("Ingrese el nombre: ");
            String nombre = sc.next();
            System.out.print("Ingrese el apellido: ");
            String apellido = sc.next();
            sc.nextLine(); // Consumir salto de línea
            System.out.print("Ingrese la dirección: ");
            String direccion = sc.nextLine();

            personas[i] = new Persona(nombre, apellido, cedula, direccion);
        }

        // Ingreso de datos de los familiares
        for (int i = 0; i < numeroDeFamiliares; i++) {
            System.out.println("Ingrese los datos del familiar " + (i + 1) + " --------");
            System.out.print("Ingrese el número de cédula: ");
            String cedula = sc.next();
            System.out.print("Ingrese el nombre: ");
            String nombre = sc.next();
            System.out.print("Ingrese el apellido: ");
            String apellido = sc.next();
            sc.nextLine(); // Consumir salto de línea
            System.out.print("Ingrese la dirección: ");
            String direccion = sc.nextLine();
            System.out.print("Ingrese el parentesco: ");
            String parentesco = sc.next();
            System.out.print("Ingrese el tipo de sangre: ");
            String tipoSangre = sc.next();
            System.out.print("Ingrese el año de nacimiento: ");
            int añoNacimiento = sc.nextInt(); //sc.nextLine() después del nexInt para evitar problemas con el ingreso de datos
            System.out.print("Ingrese el mes de nacimiento: ");
            int mesNacimiento = sc.nextInt();
            System.out.print("Ingrese el día de nacimiento: ");
            int diaNacimiento = sc.nextInt();

            // Crear la fecha de nacimiento
            GregorianCalendar fechaNacimiento = new GregorianCalendar(añoNacimiento, mesNacimiento - 1, diaNacimiento);
            familiares[i] = new Familiar(cedula, nombre, apellido, direccion, parentesco, tipoSangre, fechaNacimiento);
        }

        // Mostrar lista de personas
        System.out.println("\nLista de personas:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        // Mostrar lista de familiares
        System.out.println("\nLista de familiares:");
        for (Familiar familiar : familiares) {
            System.out.println(familiar);
        }
    }
}
