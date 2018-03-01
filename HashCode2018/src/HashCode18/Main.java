/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashCode18;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Main {
    
    public static int R,C,T; 
    
    public static void main(String[] args) throws FileNotFoundException{
        int T1;
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
            T1 = in.nextInt(); //Steps
            System.out.println(R +" " + C + " "+ F +" "+N + " "+B+" "+T1);
            cars = new Car[F];
            rides = new Ride[N]; 
            
            //Inicializacion de las rutas
            
            for(int i=0; i<N; i++){
                rides[i] = new Ride(i,in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());
                in.nextLine();
                System.out.println(rides[i].IniX + " " + rides[i].IniY);
            } 
            
            //Inicizalizacion de los coches 
            
            for(int i =0; i< F ; i++){
                cars[i] = new Car(); 
            }
            
            Arrays.sort(rides);
            List<Ride> sortedRides = new ArrayList<Ride>(Arrays.asList(rides));
            System.out.println(sortedRides.size());
            for(int j = 0; j<T1-1; j++){
                T = j+1;
                
                for(int c=0; c<F;c++){
                    if(!cars[c].isRouteAssigned()){
                        if(!sortedRides.isEmpty()){
                            cars[c].setRouteassigned(sortedRides.get(0));
                            System.out.println("Le asigno la ruta al coche " + c);
                            System.out.println("Estado: " + cars[c].isRouteAssigned());
                            sortedRides.remove(0);
                        }
                    }
                    
                    if(cars[c].isRouteAssigned()){
                        cars[c].move();
                    }
                }
                
            }
            
            
            File outF = new File(args[0] + ".out");
            PrintWriter out = new PrintWriter(outF);
            
            for (int i=0; i<F; i++){
                Car aux = cars[i];
                System.out.println("Al final, coche " + i + ". " + aux.carrerasHechas.size());
                out.print(aux.carrerasHechas.size());
                for (int j=0; j<aux.carrerasHechas.size(); j++){
                    out.print(" " + aux.carrerasHechas.get(j).id);
                }
                out.println();
            }
            out.close();
        }


    }
}
