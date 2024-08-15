/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.pkg2;

import java.util.Random;

/**
 *
 * @author danie
 */
public class Hotel {

    private Habitaciones[][] habitaciones;

    public Hotel(int pisos, int habitacionPorPiso) {
        habitaciones = new Habitaciones[pisos][habitacionPorPiso];
        precargarHabitaciones();
    }

    private void precargarHabitaciones() {
        int numeroHabitacion = 101;
        Random random = new Random(); // Generador de números aleatorios

        for (int i = 0; i < habitaciones.length; i++) {
            for (int j = 0; j < habitaciones[i].length; j++) {
                String tipo = (j % 2 == 0) ? "Simple" : "Doble";
                double precio = (tipo.equals("Simple")) ? 40 : 50;
                String estado;
                int randEstado = random.nextInt(3); 
                switch (randEstado) {
                    case 0:
                        estado = "Libre";
                        break;
                    case 1:
                        estado = "Ocupada";
                        break;
                    case 2:
                        estado = "Sucia";
                        break;
                    default:
                        estado = "Libre";
                }

                habitaciones[i][j] = new Habitaciones(numeroHabitacion++, tipo, precio, estado);
            }
        }
    }
        
    
    
    public void verHabitaciones (){
        for (int i = 0; i < habitaciones.length; i++) {
            for (int j = 0; j < habitaciones[i].length; j++) {
                Habitaciones hab = habitaciones[i][j];
                System.out.println("Habitacion " + hab.getNumero() + ": " + hab.getTipo() + " - " + hab.getPrecio() + "$ - " + hab.getEstado());
            }
            System.out.println();
        }
    }
        
    

    public void modificarHabitacion(int numero, String nuevoEstado, String nuevoTipo, double nuevoPrecio) {
        for (int i = 0; i < habitaciones.length; i++) {
            for (int j = 0; j < habitaciones[i].length; j++) {
                Habitaciones hab = habitaciones[i][j];
                if (hab.getNumero() == numero) {
                    hab.setEstado(nuevoEstado);
                    hab.setTipo(nuevoTipo);
                    hab.setPrecio(nuevoPrecio);
                    return;
                }

            }
        }
        System.out.println("Habitacion no encontrada");
    }
     
    
    public void resumenHotel(){
        int libres = 0, ocupadas = 0, sucias = 0;
        double ganancias = 0;
        int total = habitaciones.length * habitaciones [0].length;
        
        for (int i = 0; i < habitaciones.length; i++) {
            for (int j = 0; j < habitaciones[i].length; j++) {
                Habitaciones hab = habitaciones[i][j];
                switch (hab.getEstado()) {
                    case "libre":
                        libres++;
                        break;

                    case "Ocupada":
                        ocupadas++;
                        ganancias += hab.getPrecio();
                        break;
                        
                    case "Sucia":
                        sucias++;
                        break;

                }
            }
        }

        System.out.println("------ Resumen del Hotel ------");
        System.out.println("Habitaciones Libres: " + libres + "(" + (libres * 100.0 / total + "% )"));
        System.out.println("Habitaciones ocupadas: " + ocupadas + " (" + (ocupadas * 100.0 / total) + "%)");
        System.out.println("Habitaciones sucias: " + sucias + " (" + (sucias * 100.0 / total) + "%)");
        System.out.println("Ganancia actual: " + ganancias + "$");

    }
    
   
    
    
}