/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelicula.servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import pelicula.entidades.Pelicula;

/**
 *
 * @author crist
 */
public class ServicioPelicula {
    
   private java.util.Scanner leer=new java.util.Scanner(System.in).useDelimiter("\n");
   
   private static ArrayList <Pelicula> misPelis; 
//   Las variables de clase  pueden ser manipuladas sin crear una instancia de la clase.

    public ServicioPelicula() {
       
        
        this.misPelis=new ArrayList(); 
//        CONSTRUCTOR VACIO PERO CON INSTANCIACION DE LA LISTA
    }
   
   private  void creaPeli(){
                
       Pelicula p= new Pelicula();    
       
       System.out.println("Ingrese titulo de la pelicula");
       p.setTitulo(leer.next());
       System.out.println("Ingrese Director de la pelicula");
       p.setDirector(leer.next());
       System.out.println("Ingrese duracion de la pelicula en minutos");
       p.setDuracionHs(leer.nextInt());
       
       misPelis.add(p);
       
   }
   public void misPelis(){
       
       char rsta;
       
       do{
           creaPeli();
           System.out.println("Desea ingresar otra pelicula?, S/N");
           rsta=leer.next().toUpperCase().charAt(0);
           
           
       }while (rsta!='N');
       
   }
    
   public void mostrarPeliculas(){
       
       System.out.println("PELICULAS INGRESADAS");
       
       for (Pelicula unitario : misPelis) {
           
           System.out.println(unitario);
           
       }
   }
   
   public void mostrarPeliculasde1Hs(){
       
       System.out.println("MOSTRAR PELICULAS CON DURACION MAYOR A UNA HORA");
       
       misPelis.stream().filter(peli-> (peli.getDuracionHs()>60)).forEachOrdered(peli-> {
           System.out.println(peli);
       });
       System.out.println("");
       }
   
   public void ordenarPeliPorDuracionMayor(){
       
       System.out.println("MOSTRAR PELICULAS DE ACUERDO A SU DURACION DE MAYOR A MENOR");
       
       Comparator <Pelicula> comparaDuracionM=(Pelicula p1, Pelicula p2)->p2.getDuracionHs().compareTo(p1.getDuracionHs());
       
       Collections.sort(misPelis, comparaDuracionM);
       
       misPelis.forEach(peli->{
           
           System.out.println(peli);
       });
       System.out.println("");
   }
   
   public void ordenarPeliTitulo(){
       
       System.out.println("MOSTRAR PELICULAS ORDENADAS ALFABETICAMENTE POR TITULO");
       
       Comparator<Pelicula> comparaTitulo=(Pelicula p1, Pelicula p2)->p1.getTitulo().compareTo(p2.getTitulo());
       
       Collections.sort(misPelis, comparaTitulo);
       
       for (Pelicula unitario : misPelis) {
           
           System.out.println(unitario);
       };
       System.out.println("");
   }
   public void ordenarPeliPorDirector(){
       
       System.out.println("PELICULAS ORDENADAS ALFABETICAMENTE POR DIRECTOR");
       
       Comparator<Pelicula> comparaDirector=(Pelicula p1, Pelicula p2)->p1.getDirector().compareTo(p2.getDirector());
       
       Collections.sort(misPelis, comparaDirector);
       
       for (Pelicula unitario : misPelis) {
           
           System.out.println(unitario);
           
       }
           
       }
   }
   

