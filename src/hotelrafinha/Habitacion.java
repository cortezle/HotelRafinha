/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelrafinha;

/**
 *
 * @author Lucho
 */
public class Habitacion {
    private String npiso;
    private double precio;
    private int estado;
    private int tipo;
    private String nombre;

    //inicializamos constructor vacio
    public Habitacion() {
    }
     //ahora incializaremos get y set de los atributos

    public String getNpiso() {
        return npiso;
    }

    public void setNpiso(String npiso) {
        this.npiso = npiso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //ahora crearemos el metodo de cambiar precio
    public double cambiarPrecioBase(){
        precio=50;
        return 50.03;
    }
    
}
