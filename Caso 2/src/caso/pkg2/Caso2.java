/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso.pkg2;

/**
 *
 * @author danie
 */
public class Caso2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hotel hotel = new Hotel(5, 5);
        
        // Con este metodo visualizamos las habitaciones
        hotel.verHabitaciones();

        // Metodo para modificar una habitación
        hotel.modificarHabitacion(102, "Ocupada", "Doble", 60);

        // Resumen del  dia del hotel
        hotel.resumenHotel();
    }
    
}
       


    
