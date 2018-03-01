/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashCode18;

/**
 *
 * @author josep
 */
public class Ride implements Comparable<Ride>{
    int IniX;
    int IniY;
    int id;
    int FinX;
    int FinY;
    
    int earlierStart;
    int latestFinish;
    
    boolean done;
    
    public Ride(int id, int a, int b, int x, int y, int e, int f){
        this.id = id;
        this.IniX = a;
        this.IniY = b;
        this.FinX = x;
        this.FinY = y;
        this.earlierStart = e;
        this.latestFinish = f;
        this.done = false;
    }
    
    public int getDistance(){
        int horiz, vert;
        
        horiz = Math.abs(this.IniX - this.FinX);
        vert = Math.abs(this.IniY - this.FinY);
        
        return horiz + vert;
    }
    
    public int getStartX(){
        return this.IniX;
    }
    public int getStartY(){
        return this.IniY;
    }
    public int getEndX(){
        return this.FinX;
    }
    public int getEndY(){
        return this.FinY;
    }
    public int getInitTime(){
        return this.earlierStart;
    }
    public int getEndTime(){
        return this.latestFinish;
    }
    
    public void routeDone(){
        this.done = true;
    }

    @Override
    public int compareTo(Ride o) {
        return o.getDistance() - this.getDistance();
    }
}
