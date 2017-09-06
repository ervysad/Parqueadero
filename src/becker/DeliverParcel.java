package becker;

import becker.robots.*;

import java.util.Scanner;
import java.util.ArrayList; 
import java.util.Arrays;
import java.util.Random;
import java.security.SecureRandom;


public class DeliverParcel
{
    
    
    static int k=4;
    static int j=4;
    static int l=4;
         // CreaciÃ±on de un modulo equivalente a cada zona de parqueo
    static int Modulo1[]=new int[k];
    static int Modulo2[]=new int[j];
    static int Modulo3[]=new int[l];
    
    static void llenaArreglo(){
        // Los modulos estÃ¡n vacÃ­os al incio.
        for(int i=0;i<Modulo1.length;i++){
            Modulo1[i]=0;
        }
    }
    
    static int elemk=0;
    static int eleml=0;
    static int elemj=0;
    
   public static void main(String[] args)
   {  
     // Set up the initial situation
      City Parqueadero = new City();
      
      
      Wall muro0 = new Wall(Parqueadero, 0, 0, Direction.WEST);
      Wall muro1 = new Wall(Parqueadero, 1, 0, Direction.WEST);
      Wall muro2 = new Wall(Parqueadero, 2, 0, Direction.WEST);
      Wall muro3 = new Wall(Parqueadero, 3, 0, Direction.WEST);
      Wall muro4 = new Wall(Parqueadero, 4, 0, Direction.WEST);
      Wall muro5 = new Wall(Parqueadero, 5, 0, Direction.WEST);
      Wall muro6 = new Wall(Parqueadero, 6, 0, Direction.WEST);
      Wall muro7 = new Wall(Parqueadero, 0, 0, Direction.NORTH);
      Wall muro8 = new Wall(Parqueadero, 0, 1, Direction.NORTH);
      Wall muro9 = new Wall(Parqueadero, 0, 2, Direction.NORTH);
      Wall muro10 = new Wall(Parqueadero, 0, 3, Direction.NORTH);
      Wall muro11 = new Wall(Parqueadero, 0, 4, Direction.NORTH);
      Wall muro12 = new Wall(Parqueadero, 0, 5, Direction.NORTH);
      Wall muro13 = new Wall(Parqueadero, 0, 6, Direction.NORTH);
      Wall muro14 = new Wall(Parqueadero, 0, 7, Direction.NORTH);
      Wall muro15 = new Wall(Parqueadero, 0, 8, Direction.NORTH);
      Wall muro16 = new Wall(Parqueadero, 0, 9, Direction.NORTH);
      Wall muro17 = new Wall(Parqueadero, 0, 10, Direction.NORTH);
      Wall muro18 = new Wall(Parqueadero, 0, 11, Direction.NORTH);
      Wall muro19 = new Wall(Parqueadero, 0, 12, Direction.NORTH);
      Wall muro20 = new Wall(Parqueadero, 0, 13, Direction.NORTH);
      Wall muro21 = new Wall(Parqueadero, 0, 14, Direction.NORTH);
      Wall muro73 = new Wall(Parqueadero, 6, 0, Direction.SOUTH);
      Wall muro74 = new Wall(Parqueadero, 6, 1, Direction.SOUTH);
      Wall muro75 = new Wall(Parqueadero, 6, 2, Direction.SOUTH);
      Wall muro76 = new Wall(Parqueadero, 6, 3, Direction.SOUTH);
      Wall muro77 = new Wall(Parqueadero, 6, 4, Direction.SOUTH);
      Wall muro78 = new Wall(Parqueadero, 6, 5, Direction.SOUTH);
      Wall muro79 = new Wall(Parqueadero, 6, 6, Direction.SOUTH);
      Wall muro80 = new Wall(Parqueadero, 6, 7, Direction.SOUTH);
      Wall muro81 = new Wall(Parqueadero, 6, 8, Direction.SOUTH);
      Wall muro82 = new Wall(Parqueadero, 6, 9, Direction.SOUTH);
      Wall muro83 = new Wall(Parqueadero, 6, 10, Direction.SOUTH);
      Wall muro84 = new Wall(Parqueadero, 6, 11, Direction.SOUTH);
      Wall muro85 = new Wall(Parqueadero, 6, 12, Direction.SOUTH);
      Wall muro86 = new Wall(Parqueadero, 6, 13, Direction.SOUTH);
      Wall muro87 = new Wall(Parqueadero, 6, 14, Direction.SOUTH);
      Wall muro88 = new Wall(Parqueadero, 0, 14, Direction.EAST);
      Wall muro89 = new Wall(Parqueadero, 1, 14, Direction.EAST);
      Wall muro90 = new Wall(Parqueadero, 2, 14, Direction.EAST);
      Wall muro91 = new Wall(Parqueadero, 3, 14, Direction.EAST);
      Wall muro92 = new Wall(Parqueadero, 4, 14, Direction.EAST);
      Wall muro93 = new Wall(Parqueadero, 5, 14, Direction.EAST);
      Wall muro94 = new Wall(Parqueadero, 6, 14, Direction.EAST);
    
      
      
      
      
      
      Wall muro64 = new Wall(Parqueadero, 1, 1, Direction.WEST);
      Wall muro65 = new Wall(Parqueadero, 1, 1, Direction.NORTH);
      Wall muro66 = new Wall(Parqueadero, 1, 2, Direction.NORTH);
      Wall muro67 = new Wall(Parqueadero, 2, 1, Direction.WEST);
      Wall muro68 = new Wall(Parqueadero, 3, 1, Direction.WEST);
      Wall muro69 = new Wall(Parqueadero, 4, 1, Direction.WEST);
      Wall muro70 = new Wall(Parqueadero, 5, 1, Direction.WEST);
      Wall muro71 = new Wall(Parqueadero, 5, 1, Direction.SOUTH);
      Wall muro72 = new Wall(Parqueadero, 1, 2, Direction.EAST);
      Wall muro23 = new Wall(Parqueadero, 2, 2, Direction.EAST);
      Wall muro24 = new Wall(Parqueadero, 3, 2, Direction.EAST);
      Wall muro25 = new Wall(Parqueadero, 4, 2, Direction.EAST);
      Wall muro26 = new Wall(Parqueadero, 5, 2, Direction.EAST);
      
      
      Wall muro27 = new Wall(Parqueadero, 1, 4, Direction.WEST);
      Wall muro28 = new Wall(Parqueadero, 2, 4, Direction.WEST);
      Wall muro29 = new Wall(Parqueadero, 3, 4, Direction.WEST);
      Wall muro30 = new Wall(Parqueadero, 4, 4, Direction.WEST);
      Wall muro31 = new Wall(Parqueadero, 5, 4, Direction.WEST);
      Wall muro32 = new Wall(Parqueadero, 1, 5, Direction.EAST);
      Wall muro33 = new Wall(Parqueadero, 2, 5, Direction.EAST);
      Wall muro34 = new Wall(Parqueadero, 3, 5, Direction.EAST);
      Wall muro35 = new Wall(Parqueadero, 4, 5, Direction.EAST);
      Wall muro36 = new Wall(Parqueadero, 5, 5, Direction.EAST);
      Wall muro37 = new Wall(Parqueadero, 1, 4, Direction.NORTH);
      Wall muro38 = new Wall(Parqueadero, 1, 5, Direction.NORTH);
      Wall muro39 = new Wall(Parqueadero, 5, 4, Direction.SOUTH);
      
      Wall muro40 = new Wall(Parqueadero, 1, 7, Direction.WEST);
      Wall muro41 = new Wall(Parqueadero, 2, 7, Direction.WEST);
      Wall muro42 = new Wall(Parqueadero, 3, 7, Direction.WEST);
      Wall muro43 = new Wall(Parqueadero, 4, 7, Direction.WEST);
      Wall muro44 = new Wall(Parqueadero, 5, 7, Direction.WEST);
      Wall muro45 = new Wall(Parqueadero, 1, 8, Direction.EAST);
      Wall muro46 = new Wall(Parqueadero, 2, 8, Direction.EAST);
      Wall muro47 = new Wall(Parqueadero, 3, 8, Direction.EAST);
      Wall muro48 = new Wall(Parqueadero, 4, 8, Direction.EAST);
      Wall muro49 = new Wall(Parqueadero, 5, 8, Direction.EAST);
      Wall muro50 = new Wall(Parqueadero, 1, 7, Direction.NORTH);
      Wall muro51 = new Wall(Parqueadero, 1, 8, Direction.NORTH);
      Wall muro52 = new Wall(Parqueadero, 5, 7, Direction.SOUTH);
      
      Wall muro53 = new Wall(Parqueadero, 4, 10, Direction.WEST);
      Wall muro54 = new Wall(Parqueadero, 3, 10, Direction.WEST);
      Wall muro55 = new Wall(Parqueadero, 3, 10, Direction.NORTH);
      Wall muro56 = new Wall(Parqueadero, 3, 11, Direction.NORTH);
      Wall muro57 = new Wall(Parqueadero, 3, 12, Direction.NORTH);
      Wall muro58 = new Wall(Parqueadero, 3, 13, Direction.NORTH);
      Wall muro59 = new Wall(Parqueadero, 4, 13, Direction.EAST);
      Wall muro60 = new Wall(Parqueadero, 3, 13, Direction.EAST);
      Wall muro61 = new Wall(Parqueadero, 4, 10, Direction.SOUTH);
      Wall muro62 = new Wall(Parqueadero, 4, 11, Direction.SOUTH);
      Wall muro63 = new Wall(Parqueadero, 4, 12, Direction.SOUTH);
     
      
   
      ContarOcuapados1();
      ContarOcuapados2();
      ContarOcuapados3();
       System.out.println("El numero de espacios ocupados son");
       System.out.println(elemk);
       System.out.println(elemj);
       System.out.println(eleml);
       
      System.out.println("Los modulos estan asi");
       System.out.println(Modulo1[0]);
       System.out.println(Modulo2[0]);
       System.out.println(Modulo3[0]);
       
       IngresarVehiculo(Parqueadero);
      ContarOcuapados1();
      ContarOcuapados2();
      ContarOcuapados3();
       System.out.println("El numero de espacios ocupados son");
       System.out.println(elemk);
       System.out.println(elemj);
       System.out.println(eleml);
       
      System.out.println("Los modulos estan asi");
       System.out.println(Modulo1[0]);
       System.out.println(Modulo2[0]);
       System.out.println(Modulo3[0]);
       
       IngresarVehiculo(Parqueadero);
        ContarOcuapados1();
      ContarOcuapados2();
      ContarOcuapados3();
       System.out.println("El numero de espacios ocupados son");
       System.out.println(elemk);
       System.out.println(elemj);
       System.out.println(eleml);
       
      System.out.println("Los modulos estan asi");
       System.out.println(Modulo1[0]);
       System.out.println(Modulo2[0]);
       System.out.println(Modulo3[0]);
       
       IngresarVehiculo(Parqueadero); ContarOcuapados1();
      ContarOcuapados2();
      ContarOcuapados3();
       System.out.println("El numero de espacios ocupados son");
       System.out.println(elemk);
       System.out.println(elemj);
       System.out.println(eleml);
       
      System.out.println("Los modulos estan asi");
       System.out.println(Modulo1[0]);
       System.out.println(Modulo2[0]);
       System.out.println(Modulo3[0]);
       
       













     
     
   }   
     
  static int ContarOcuapados1(){
      for (int q = 0; q < Modulo1.length; q++) {
          if (Modulo1[q] != 0) {
             elemk++;
          }
      }
      return elemk;
  }
  static int ContarOcuapados2(){
      for (int w = 0; w < Modulo2.length; w++) {
          if (Modulo2[w] != 0) {
             elemj++;
          }
      }
      return elemj;
  }
  static int ContarOcuapados3(){
      for (int i = 0; i < Modulo1.length; i++) {
          if (Modulo3[i] != 0) {
              eleml++;
          }
      }
      return eleml;
  }
  
  
                     
    public static int IngresarVehiculo(City Parqueadero) {
    int situacion =0;
    int placa; 
    Scanner capt = new Scanner(System.in);
    System.out.print("Ingrese la placa del vehiculo: ");
    placa = capt.nextInt();
    Random aleatorio = new Random(System.currentTimeMillis());
    int intAletorio = aleatorio.nextInt(100);
    Robot auto  = new Robot(Parqueadero, 6, 14, Direction.WEST, intAletorio);
    
    ContarOcuapados1();
    ContarOcuapados2();
    ContarOcuapados3();
    
        if (elemk==elemj & elemj==eleml & elemk==eleml) {
                 int numero = (int) (Math.random() * 3) + 1;
                    
                    if (numero==1) { 
                        situacion = elemk;
                        Modulo1[elemk] = placa;
                    }
                    
                    if (numero==2) { 
                        situacion = 5+elemj;
                        Modulo2[elemj] = placa;
                    }
                    
                    if (numero==3) { 
                        situacion = 10+eleml;
                        Modulo3[eleml] = placa;
                    }
        }
        
        
        
        
        if (elemk<elemj & elemk<eleml & elemj==eleml) {
                 situacion=elemk;
                 Modulo1[elemk] = placa;                  
        }
        
         if (elemk<elemj & elemk<eleml & elemj>eleml) {
                 situacion=elemk;
                 Modulo1[elemk] = placa;                  
        }
         
          if (elemk<elemj & elemk<eleml & elemj<eleml) {
                 situacion=elemk;
                 Modulo1[elemk] = placa;                  
        }
          
         if (elemj<elemk & elemj<eleml & elemk==eleml) {
                 situacion=5+elemj;
                 Modulo2[elemj] = placa;                  
        }
         
         if (elemj<elemk & elemj<eleml & elemk>eleml) {
                 situacion=5+elemj;
                 Modulo2[elemj] = placa;                  
        }
         
         if (elemj<elemk & elemj<eleml & elemk<eleml) {
                 situacion=5+elemj;
                 Modulo2[elemj] = placa;                  
        }
         
         if (eleml<elemk & eleml<elemj & elemk==elemj) {
                 situacion=10+eleml;
                 Modulo3[eleml] = placa;                  
        }
         if (eleml<elemk & eleml<elemj & elemk>elemj) {
                 situacion=10+eleml;
                 Modulo3[eleml] = placa;                  
        }
         if (eleml<elemk & eleml<elemj & elemk<elemj) {
                 situacion=10+eleml;
                 Modulo3[eleml] = placa;                  
        }
        
 
 if (situacion == 0) {
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
     auto.turnLeft();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
            
        }
 
  if (situacion == 1) {
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
     auto.turnLeft();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
            
        }
   
  if (situacion == 2) {
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
     auto.turnLeft();
     auto.move();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
            
        }
  if (situacion == 3) {
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
     auto.turnLeft();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
            
        }
  
  if (situacion == 4) {
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
     auto.turnLeft();
     auto.move();
     auto.turnLeft();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
            
        }
 if (situacion == 5) {
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
     auto.turnLeft();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
            
        }
 
if (situacion == 6) {
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
     auto.turnLeft();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
            
        }

if (situacion == 7) {
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
     auto.turnLeft();
     auto.move();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
            
        }

if (situacion == 8) {
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
     auto.turnLeft();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
            
        }

if (situacion == 9) {
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
     auto.turnLeft();
     auto.move();
     auto.turnLeft();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
            
        }
 
 if (situacion == 10) {
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
     auto.turnLeft();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
            
        }
 
  if (situacion == 11) {
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
     auto.turnLeft();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
            
        }
  if (situacion == 12) {
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
     auto.turnLeft();
     auto.move();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
  }    
        
if (situacion == 13) {
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
     auto.turnLeft();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
            
        }
 
if (situacion == 14) {
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
     auto.turnLeft();
     auto.move();
     auto.turnLeft();
     auto.move();
     auto.turnLeft();
     auto.turnLeft();
            
        }
 return situacion;
    }
}

