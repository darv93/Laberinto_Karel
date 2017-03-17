
package Laberinto;

/**
 * Clase principal desde donde se crea el laberinto para Karel y se le asigna una posición.
 * Seguidamente se le pide que salga del laberinto usando un método.
 * @author Diego Alejandro Gutierrez Rojas
 * @author Lina Paola Correa Ballen
 * @author Diego Alexander Ramirez Vela
 * @author Julian David Escobar Jamioy
 */

public class Main {
    
    public static void main(String[] args){
    
    Laberinto laberinto = new Laberinto();
    laberinto.Posicion_Karel(10, 1);
    laberinto.salir();
    
        
    }   
    
}
