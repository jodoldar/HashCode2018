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
public class Main {
    public static void main(String[] args){
        
        System.out.println("HashCode2017");
        if(args.length!=1){
            System.err.println("Numero de argumentos incorrecto");
            System.exit(1);
        }else{
        	File f = new File(args[0]);
            Scanner in = new Scanner(f);
            int R,C;
            R = f.nextInt();
            C = f.nextInt(); 
            int grid [] [] = new int [R] [C]; 
            
        }


    }
}
