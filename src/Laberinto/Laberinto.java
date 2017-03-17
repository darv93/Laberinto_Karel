package Laberinto;
import becker.robots.*;
/**
 * Clase para crear el laberinto donde Karel se va a mover, y adicionalmente
 * los metodos necesarios para que salga de este mismo.
 * @author Diego Alejandro Gutierrez Rojas
 * @author Lina Paola Correa Ballen
 * @author Diego Alexander Ramirez Vela
 * @author Julian David Escobar Jamioy
 */
public class Laberinto {

    private Robot joe;
    private City Laberinto;
    private Wall pared;
    private Thing balon;   
    
    /**
     * Constructor para el Laberinto.
     * Se Crea el laberinto como una ciudad de la clase City
     * y ademas se ponen las paredes (Wall's) y el thing (Thing) que indica la salida.
     * 
     */
    public Laberinto(){
        
      this.Laberinto = new City(10,10);
      this.balon = new Thing(Laberinto,2,11);
      
      for (int i=1; i<11;i++){
            this.pared = new Wall(Laberinto,i,1,Direction.WEST);
        }
      
      for (int i=1; i<11;i++){
            this.pared = new Wall(Laberinto,1,i,Direction.NORTH);
        }
      
      for (int i=2; i<11;i++){
            this.pared = new Wall(Laberinto,i,10,Direction.EAST);
        }
      
      for (int i=1; i<9;i++){
            this.pared = new Wall(Laberinto,i,6,Direction.EAST);
        }
      
      for (int i=2; i<11;i++){
            this.pared = new Wall(Laberinto,i,7,Direction.EAST);
        }
      
      for (int i=1; i<10;i++){
            this.pared = new Wall(Laberinto,i,8,Direction.EAST);
        }
      
      this.pared = new Wall(Laberinto,10,6,Direction.EAST);
      
      for (int i=1; i<11;i++){
            this.pared = new Wall(Laberinto,10,i,Direction.SOUTH);
        }
      
      for (int i=3; i<10;i++){
          this.pared = new Wall(Laberinto,i,4,Direction.EAST);
          
      }
         
      for (int i=4; i<9;i++){
          this.pared = new Wall(Laberinto,i,1,Direction.EAST);
          
      }
          
      this.pared = new Wall(Laberinto,4,1,Direction.SOUTH);
      
      for (int i=3;i<7;i++){
      this.pared = new Wall(Laberinto,10,i,Direction.NORTH);
      }
      
      for (int i=1; i<3;i++){
          this.pared = new Wall(Laberinto,i,1,Direction.EAST);
          
      }
      
      for (int i=2; i<4;i++){
          this.pared = new Wall(Laberinto,2,i,Direction.EAST);
          
      }   
      
      for (int i=4; i<6;i++){
          this.pared = new Wall(Laberinto,1,i,Direction.EAST);
          
      }   
      
      for (int i=2; i<4;i++){
          this.pared = new Wall(Laberinto,9,i,Direction.NORTH);
      }
      
      for (int i=2; i<4;i++){
          this.pared = new Wall(Laberinto,7,i,Direction.NORTH);
      }
      
      for (int i=2; i<4;i++){
          this.pared = new Wall(Laberinto,5,i,Direction.NORTH);
      }
      
      for (int i=3; i<5;i++){
          this.pared = new Wall(Laberinto,3,i,Direction.NORTH);
      }
      
      for (int i=3; i<5;i++){
          this.pared = new Wall(Laberinto,8,i,Direction.NORTH);
      }
      for (int i=3; i<5;i++){
          this.pared = new Wall(Laberinto,6,i,Direction.NORTH);
      }
      
      for (int i=3; i<5;i++){
          this.pared = new Wall(Laberinto,4,i,Direction.NORTH);
      }

      
      this.pared = new Wall(Laberinto,10,1,Direction.NORTH);
      
      for (int i=2; i<10;i++){
          if(i%2!=0){
          this.pared = new Wall(Laberinto,i,5,Direction.NORTH);
          }
          }
      for (int i=1; i<11;i++){
          if(i%2!=0){
          this.pared = new Wall(Laberinto,i,10,Direction.NORTH);
          }
          }
     for (int i=3; i<10;i++){
          if(i%2==0){
          this.pared = new Wall(Laberinto,i,6,Direction.NORTH);
          }
          }
     for (int i=1; i<11;i++){
          if(i%2==0){
          this.pared = new Wall(Laberinto,i,9,Direction.NORTH);
          }
          }
    
    }
    
    /**
     * Método para poner a Karel en una posición particular deseada.
     * @param x me da la posición x de Karel en el laberinto
     * @param y me da la posición y de Karel en el laberinto
     */
    public void Posicion_Karel(int x, int y){
    
        this.joe = new Robot (Laberinto,x,y,Direction.WEST);
        
        
        
    }
    
    /**
     * Método que hace que Karel salga de cualquier laberinto
     */
        
    public void salir(){
      int p=0;
      
        while(this.joe.countThingsInBackpack()==0){
             
            switch(p){
                 
                 case 0:
                     for (int i =0;i<3;i++){
                         this.joe.turnLeft();
                     }
                     if(this.joe.frontIsClear()){
                     this.joe.turnLeft();
                     p=1;
                     break;
                     }else{
                     this.joe.turnLeft();
                     p=2;
                     break;
                     }
                     
                 
                 case 1:
                     
                     for (int i=0;i<3;i++){
                         this.joe.turnLeft();
                     }
                     this.joe.move();
                     if(this.joe.canPickThing()){
                         this.joe.pickThing();
                     }
                     p=0;
                     break;
                 
                 case 2:
                     this.joe.turnLeft();
                     p=0;
                     break;
              
                        
        }              
              
         
     }
             
     
     }  
        
        

}
