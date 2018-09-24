/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.ruiz;
import java.util.ArrayList;
/**
 *
 * @author Juan Camilo
 */
public class Libros {
    private int id;
    private String Título;
    private String Autor;
    private double Precio;
    private boolean existencia;
    private boolean uso;
    private double descuento;
    private Estantería ubicación;

    public Libros(int id, String Título, String Autor, double Precio, boolean existencia, boolean uso, double descuento, Estantería stand) {
        this.id=id;
        this.Título = Título;
        this.Autor = Autor;
        this.Precio = Precio;
        this.existencia = existencia;
        this.uso = uso;
        this.descuento = descuento;
        this.ubicación=stand;
        
    }
    public int getId(){
        return this.id;
    }
    public double preciofinal(double precio, double descuento){
        return precio*descuento;
    }
    public String getTítulo() {
        return Título;
    }

    public String getAutor() {
        return Autor;
    }

    public double getPrecio() {
        return Precio;
    }

    public boolean isExistencia() {
        return existencia;
    }

    public boolean isUso() {
        return uso;
    }

    public double getDescuento() {
        return descuento;
    }

    public Estantería getUbicación() {
        return ubicación;
    }  

    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public void setExistencia(boolean existencia) {
        this.existencia = existencia;
    }

    public void setUso(boolean uso) {
        this.uso = uso;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setUbicación(Estantería ubicación) {
        this.ubicación = ubicación;
    }
    
}
