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
public class Estantería {
    private int id;
    private ArrayList<Libros> libros;

    public Estantería(int id, ArrayList<Libros> libros) {
        this.id = id;
        this.libros = libros;
    }

    public int getId() {
        return id;
    }
    
    public String getLibro(Estantería stand, String nombre){
        for (int i = 0; i < stand.getLibros().size(); i++){
            if (nombre == stand.getLibros().get(i).getAutor() || nombre==stand.getLibros().get(i).getTítulo()){
                System.out.println("Resultados encontrados");
                System.out.println("Autor: "+stand.getLibros().get(i).getAutor());
                System.out.println("Título: "+stand.getLibros().get(i).getTítulo());
                System.out.println("Precio: "+stand.getLibros().get(i).getPrecio());
                System.out.println("Descuento: " +(stand.getLibros().get(i).getDescuento()*10)+" %");
                System.out.println("Ubicación: Estantería "+stand.getLibros().get(i).getUbicación().getId());
            if (stand.getLibros().get(i).isUso()==true){
                    System.out.println("Usado");
                    
                }else{
                    System.out.println("Nuevo");
                }
                if(stand.getLibros().get(i).isExistencia()==true){
                    System.out.println("Disponible");
                }
                else{
                    System.out.println("Usado");
                }
            } 
            else {
                return "No se encontraron resultados";
            }
        }
        return "Fin";
    }

    public ArrayList<Libros> getLibros() {
        return libros;
    }
    public ArrayList<Libros> setLibros(ArrayList<Libros> libros){
        return this.libros =  libros;   
    }
}