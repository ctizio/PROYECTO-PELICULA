/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelicula;

import pelicula.servicios.ServicioPelicula;

/**
 *
 * @author crist
 */
public class PELICULA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioPelicula sp=new ServicioPelicula();
        
        sp.misPelis();
        sp.mostrarPeliculas();
         sp.mostrarPeliculasde1Hs();
        sp.ordenarPeliPorDuracionMayor();
                
        sp.ordenarPeliTitulo();
        sp.ordenarPeliPorDirector();
        // TODO code application logic here
    }
    
}
