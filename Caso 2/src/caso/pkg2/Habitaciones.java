/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.pkg2;

/**
 *
 * @author danie
 */
public class Habitaciones {
    //declaramos los atributos de la clase (carac)
    int Numero;
    String Tipo;
    double precio;
    String Estado;
    
    //creamos el metodo cosntructor 

    public Habitaciones(int Numero, String Tipo, double precio, String Estado) {
        this.Numero = Numero;
        this.Tipo = Tipo;
        this.precio = precio;
        this.Estado = Estado;
    }
    
    
    //creamos otro para poder asi meter info mediantede el teclado
    public Habitaciones() {
    }
    
    //creamos los getters and setters

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
}
