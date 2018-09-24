/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.ruiz;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Juan Camilo
 */
public class LibreriaRuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lit=new Scanner(System.in);
        ArrayList<Libros> libros= new ArrayList<>();
        ArrayList<Estantería> stands = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            stands.add(new Estantería(i, libros));
        }
        for (int k = 0; k < 5; k++) {
                libros.add(new Libros(1, "Autonautas de la Cosmopista", "Julio Cortázar", 20000, false, false, 0.1,stands.get(0)));
        }
        stands.get(0).setLibros(libros);
        libros.clear();
        for (int k = 0; k < 5; k++) {
                libros.add(new Libros(2, "El Visitante", "Dylan Thomas", 5000, true, true, 0.1,stands.get(1)));
                stands.add(new Estantería(1,libros));    
        }
        stands.get(1).setLibros(libros);
        libros.clear();
        for (int k = 0; k < 5; k++) {
                libros.add(new Libros(3, "El Aleph", "Jorge Borges", 25000, true, false, 0.3,stands.get(2)));
                
        }
        stands.get(2).setLibros(libros);
        libros.clear();
        for (int k = 0; k < 5; k++) {
                libros.add(new Libros(4, "El Conde de Montecristo", "Alejandro Dumas", 80000, true, false, 0.25,stands.get(3)));
                
        }
        stands.get(3).setLibros(libros);
        libros.clear();
        for (int k = 0; k < 5; k++) {
                libros.add(new Libros(5, "Angelitos Empantanados", "Andrés Caicedo", 7000, true, true, 0, stands.get(4)));
                
        }
        stands.get(4).setLibros(libros);
        libros.clear();
        System.out.println("Ingrese el codigo del libro");
        String busqueda= lit.nextLine();
        for (int i = 0; i < 5; i++) {
        for (int j = 0; j < stands.size(); j++) {
            stands.get(j).getLibro(stands.get(i), busqueda);
        }
        }
        }
}