/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projecteparking;

/**
 *
 * @author alumne
 */
public class Parking {

    
    
    
    
    private int numPlacesOcupades;
    public static final double PREU_MINUT = 3;

    private Plaça[] places;
    
    
    public Plaça[] getPlaces() {
        return places;
    }

    public void setPlaces(Plaça[] places) {
        this.places = places;
    }
    
    
    
    //constructor
    public Parking(int maxPlaces) {
         places = new Plaça[maxPlaces];
        for (int i = 0; i < places.length/2; i++) {
           Plaça p = new Plaça();
           p.setNúmero(i+1);
           p.setUbicació("Primera planta");
           
           places[i]= p;
        }
        
        for (int i =  places.length/2; i <  places.length; i++) {
           Plaça p = new Plaça();
           p.setNúmero(i+1);
           p.setUbicació("Segona planta");
           
           places[i]= p;
        }
        System.out.println(places.length);
        
    }

    public void initialize(){
        
        
    }

    
    //aparca un vehicle dins una plaça lliure.
    public boolean aparcar(Vehicle vehicle){
        //iteración para modificar las plazas del parking
        for (int i = 0; i <places.length; i++) {
            if(!places[i].isOcupada()){
                vehicle.setDataHoraEntrada();
                places[i].setVehicle(vehicle);
                this.numPlacesOcupades++;
                return true;
            }
        }
        return false;
        
        /*
        if(vehicle!=null){
            return false;
        }
        else{
            return true;
        }
        */
        
    }
    
    /*desaparca el cotxe que té la matrícula indicada,
    deixa la plaça lliure i retorna el preu a pagar segons el temps que s'ha estat dins el pàrquing.
    */ 
    
    public double desaparcar(String matricula){
            
        return 0;
    }
    
    //Mostrar llistat de les places del parking, mostrant si la plaça està lliure o ocupada
    void llistat(){
        
    }
    
    //retorna cert si el pàrquing està ple
    public boolean isPle(){
        
        return false;
    }
    
    //retorna el número de places lliures
    public int numPlacesLliures(){
        
        return places.length;
    }
    
    
    
}
