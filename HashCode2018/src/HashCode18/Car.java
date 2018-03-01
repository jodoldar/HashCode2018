/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashCode18;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josep
 */
public class Car {
    private Ride routeassigned;
    private boolean isRouteAssigned;
    private boolean inRoute;
    private int posX;
    private int posY;
    List<Ride> carrerasHechas = new ArrayList<Ride>();
    
    public void goLeft(){
            this.posX--;
    }
    public void goRight(){
        this.posX++;
    }
    public void goUp(){
        this.posY++;
    }
    public void goDown(){
        this.posY--;
    }
    
    public void move(){
        if (isRouteAssigned){
            if (inRoute){
                // Ya estoy en la ruta
                if(Main.T >= routeassigned.earlierStart){
                    // Me puedo mover
                    if (this.posX == routeassigned.getEndX()){
                        // Voy a la vertical
                    }else{
                        // Voy a la horizontal
                        if (this.posX > routeassigned.getEndX()){
                            goLeft();
                        }else{
                            goRight();
                        }  
                    }
                }else{
                    // Me tengo que esperar
                }
            }else{
                // Tengo que ir al inicio
            }
        }
    }
    
    /**
     * @param routeassigned the routeassigned to set
     */
    public void setRouteassigned(Ride routeassigned) {
        this.routeassigned = routeassigned;
    }

    /**
     * @return the routeAssigned
     */
    public boolean isRouteAssigned() {
        return isRouteAssigned;
    }

    /**
     * @param routeAssigned the routeAssigned to set
     */
    public void setRouteAssigned(boolean routeAssigned) {
        this.isRouteAssigned = routeAssigned;
    }

    /**
     * @return the posX
     */
    public int getPosX() {
        return posX;
    }

    /**
     * @param posX the posX to set
     */
    public void setPosX(int posX) {
        this.posX = posX;
    }

    /**
     * @return the posY
     */
    public int getPosY() {
        return posY;
    }

    /**
     * @param posY the posY to set
     */
    public void setPosY(int posY) {
        this.posY = posY;
    }
}
