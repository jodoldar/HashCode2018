/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashCode18;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Main {
    
    public static int R,C,T; 
    
    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("HashCode2018");
        if(args.length!=1){
            System.err.println("Numero de argumentos incorrecto");
            System.exit(1);
        }else{
            File f = new File(args[0]);
            Scanner in = new Scanner(f);
            Car [] cars;
            Ride [] rides;
            int F,N,B;
            int grid [][];
            R = in.nextInt(); 
            C = in.nextInt(); 
            grid = new int [R] [C]; //Ciudad 
            F = in.nextInt(); //Cars 
            N = in.nextInt(); //Rides
            B = in.nextInt(); //Bonus
            T = in.nextInt(); //Steps
            
            cars = new Car[F];
            rides = new Ride[N]; 
            
            //Inicializacion de las rutas
            
            for(int i=0; i<N-1; i++){
                rides[i] = new Ride(i,in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());
                in.nextLine();
            } 
            
            //Inicizalizacion de los coches 
            
            for(int i =0; i< F -1 ; i++){
                cars[i] = new Car(); 
            }
        }


    }
}
