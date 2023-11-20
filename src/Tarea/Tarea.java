/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea;

import java.util.Scanner;//importamos la clase Scanner

class Persona {
  private final String nombre;
  private final String apellido;
  private final int edad;
  private final String genero;
  private final double estatura;
  private final double peso;

  // Constructor
  public Persona(final String nombre, final String apellido, final int edad, final String genero, final double estatura,
      final double peso) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.genero = genero;
    this.estatura = estatura;
    this.peso = peso;
  }

  // Métodos para obtener los atributos
  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public int getEdad() {
    return edad;
  }

  public String getGenero() {
    return genero;
  }

  public double getEstatura() {
    return estatura;
  }

  public double getPeso() {
    return peso;
  }

  // Método para obtener todos los atributos
  public String obtenerTodosLosAtributos() {
    return "Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad +
        ", Género: " + genero + ", Estatura: " + estatura + ", Peso: " + peso;
  }
}

class ArregloPersonas {
  private final Persona[] personas;

  // Constructor
  public ArregloPersonas(final int cantidad) {
    personas = new Persona[cantidad];
  }

  // Método para agregar una persona al arreglo
  public void agregarPersona(final int indice, final Persona persona) {
    personas[indice] = persona;
  }

  // Métodos para obtener información de las personas
  public String[] obtenerNombres() {
    final String[] nombres = new String[personas.length];
    for (int i = 0; i < personas.length; i++) {
      nombres[i] = personas[i].getNombre();
    }
    return nombres;
  }

  public String[] obtenerApellidos() {
    final String[] apellidos = new String[personas.length];
    for (int i = 0; i < personas.length; i++) {
      apellidos[i] = personas[i].getApellido();
    }
    return apellidos;
  }

  public int[] obtenerEdades() {
    final int[] edades = new int[personas.length];
    for (int i = 0; i < personas.length; i++) {
      edades[i] = personas[i].getEdad();
    }
    return edades;
  }

  public String[] obtenerGeneros() {
    final String[] generos = new String[personas.length];
    for (int i = 0; i < personas.length; i++) {
      generos[i] = personas[i].getGenero();
    }
    return generos;
  }

  public double[] obtenerEstaturas() {
    final double[] estaturas = new double[personas.length];
    for (int i = 0; i < personas.length; i++) {
      estaturas[i] = personas[i].getEstatura();
    }
    return estaturas;
  }

  public double[] obtenerPesos() {
    final double[] pesos = new double[personas.length];
    for (int i = 0; i < personas.length; i++) {
      pesos[i] = personas[i].getPeso();
    }
    return pesos;
  }

  public String[] obtenerTodosLosAtributos() {
    final String[] atributos = new String[personas.length];
    for (int i = 0; i < personas.length; i++) {
      atributos[i] = personas[i].obtenerTodosLosAtributos();
    }
    return atributos;
  }

  // Método para determinar la persona con mayor peso
  public Persona personaConMayorPeso() {
    Persona mayorPeso = personas[0];
    for (int i = 1; i < personas.length; i++) {
      if (personas[i].getPeso() > mayorPeso.getPeso()) {
        mayorPeso = personas[i];
      }
    }
    return mayorPeso;
  }

  // Método para determinar la persona con menor estatura
  public Persona personaConMenorEstatura() {
    Persona menorEstatura = personas[0];
    for (int i = 1; i < personas.length; i++) {
      if (personas[i].getEstatura() < menorEstatura.getEstatura()) {
        menorEstatura = personas[i];
      }
    }
    return menorEstatura;
  }

  // Método para calcular el promedio de edad
  public double calcularPromedioEdad() {
    int sumaEdades = 0;
    for (final Persona persona : personas) {
      sumaEdades += persona.getEdad();
    }
    return (double) sumaEdades / personas.length;
  }

  // Método para contar el número de personas por género
  public int contarPersonasPorGenero(final String genero) {
    int contador = 0;
    for (final Persona persona : personas) {
      if (persona.getGenero().equalsIgnoreCase(genero)) {
        contador++;
      }
    }
    return contador;
  }
}

// Clase Persona
public class Tarea {
  public static void main(final String[] args) {
    final Scanner scanner = new Scanner(System.in);

    System.out.print("Por favor ingrese la cantidad de personas: ");
    final int cantidadPersonas = scanner.nextInt();

    final ArregloPersonas arreglo = new ArregloPersonas(cantidadPersonas);

    for (int i = 0; i < cantidadPersonas; i++) {
      System.out.println("Ingrese los datos de la persona " + (i + 1) + ":");
      System.out.print("Nombres: ");
      final String nombre = scanner.next();
      System.out.print("Apellidos: ");
      final String apellido = scanner.next();
      System.out.print("Edad: ");
      final int edad = scanner.nextInt();
      System.out.print("Género: ");
      final String genero = scanner.next();
      System.out.print("Estatura en centimetros: ");
      final double estatura = scanner.nextDouble();
      System.out.print("Peso en kilogramos: ");
      final double peso = scanner.nextDouble();

      arreglo.agregarPersona(i, new Persona(nombre, apellido, edad, genero, estatura, peso));
    }

    System.out.println("\nInformación de las personas ingresadas:");
    final String[] nombres = arreglo.obtenerNombres();
    final String[] apellidos = arreglo.obtenerApellidos();
    final int[] edades = arreglo.obtenerEdades();
    final String[] generos = arreglo.obtenerGeneros();
    final double[] estaturas = arreglo.obtenerEstaturas();
    final double[] pesos = arreglo.obtenerPesos();
    // final String[] todosLosAtributos = arreglo.obtenerTodosLosAtributos();

    for (int i = 0; i < cantidadPersonas; i++) {
      System.out.println("\nPersona " + (i + 1) + ":");
      System.out.println("Nombre: " + nombres[i]);
      System.out.println("Apellido: " + apellidos[i]);
      System.out.println("Edad: " + edades[i]);
      System.out.println("Género: " + generos[i]);
      System.out.println("Estatura: " + estaturas[i]);
      System.out.println("Peso: " + pesos[i]);
    }

    final Persona personaMayorPeso = arreglo.personaConMayorPeso();
    System.out.println("\nPersona con mayor peso:");
    System.out.println("Nombre: " + personaMayorPeso.getNombre() + ", Apellido: " + personaMayorPeso.getApellido()
        + ", Peso: " + personaMayorPeso.getPeso());

    final Persona personaMenorEstatura = arreglo.personaConMenorEstatura();
    System.out.println("\nPersona con menor estatura:");
    System.out.println("Nombre: " + personaMayorPeso.getNombre() + ", Apellido: " + personaMayorPeso.getApellido()
        + ", Estatura: " + personaMayorPeso.getEstatura());

    final double promedioEdad = arreglo.calcularPromedioEdad();
    System.out.println("\nPromedio de edad de las personas: " + promedioEdad);

    final int cantidadMasculinos = arreglo.contarPersonasPorGenero("Masculino");
    final int cantidadFemeninos = arreglo.contarPersonasPorGenero("Femenino");
    System.out.println("\nCantidad de personas del género Masculino: " + cantidadMasculinos);
    System.out.println("Cantidad de personas del género Femenino: " + cantidadFemeninos);
  }
}