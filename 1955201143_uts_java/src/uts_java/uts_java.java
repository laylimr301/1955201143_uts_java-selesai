/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_java;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class  uts_java{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Tekanan Udara Ban");
        
        int n = 2;
        for(int i = 1; i<=n; i++){
            System.out.println("perulangan ke-"+i);
        
        Scanner s = new Scanner(System.in);
       System.out.printf("input tekanan : ");
       int tekanan = s.nextInt();
       
       
        if(tekanan < 28){
            System.out.println("Keras");
        }
            else if (tekanan < 31){
                    
            System.out.println("Kempes");
        }
            else if (tekanan > 31){
            System.out.println("Keras");
        }
            else if (tekanan > 33){
                    System.out.println("Keras");
        }
            else{
            System.out.println("Normal");
        }    
        }
    }
}   
    
       
    
    
    
    
    
    
    
    
    
    
    
    
    

