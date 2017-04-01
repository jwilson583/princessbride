/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Ben
 */
public class Scene implements Serializable{
    
    //class instance variables
    private String description; 
    private double travelTime;
    private String type;
    private String mapSymbol;
    private boolean blocked;

    public Scene() {
    }

    
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
        public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }
    
        public boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.description);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 41 * hash + Objects.hashCode(this.type);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", travelTime=" + travelTime + ", type=" + type + '}';
    }

    public boolean isBlocked() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
    
}
