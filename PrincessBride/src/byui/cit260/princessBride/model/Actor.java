/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.model;

//import java.awt.Point;
import java.awt.Point;
import java.util.Random;
//import java.io.Serializable;

/**
 *
 * @author Ben
 */
public enum Actor /*implements Serializable*/ {
    
inigoMontoya("A spaniard seeking to avenge his father"),
fezzik("A large Hearted Giant that only wants to help his friends"),
miracleMax("A miracle worker fired by the Prince"),
vizzini("A know it all that doesn't know the definition of inconceivable");
   /*vizzini, 
   fezzik, 
   miracleMax, 
   inigoMontoya;*/
    
// class instance variables

private final String description;
private final Point coordinates;
Random rannum = new Random();
       
int health=100;
int attack= 1+rannum.nextInt(100);
int defense= 1+rannum.nextInt(100);
int skill= 1+rannum.nextInt(100);

    Actor(String description) {
        this.description = description;
        coordinates = new Point(0,0);
    }
        
    public String getDescription() {
        return description;
    }
    public Point getCoordinates() {
        return coordinates;
    }
}