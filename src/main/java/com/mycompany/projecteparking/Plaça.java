/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projecteparking;

/**
 *
 * @author alumne
 */
public class Plaça {
    private int número;
    private String ubicació;
    //inicializada nula por defecto
    private Vehicle vehicle;

    public Plaça() {
    }
    
    //constructor número i ubicació
    public Plaça(int número, String ubicació) {
        this.número = número;
        this.ubicació = ubicació;
    }

    public int getNúmero() {
        return número;
    }

    public void setNúmero(int número) {
        this.número = número;
    }

    public String getUbicació() {
        return ubicació;
    }

    public void setUbicació(String ubicació) {
        this.ubicació = ubicació;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    // Implementa un mètode que retorni true/false segons la plaça estigui ocupada o no.
    
    public boolean isOcupada(){
        
        if(this.getVehicle()!=null){
            return true;
        }else{
            return false;
        }
    }
    
    
    @Override
    public String toString() {
        if(this.isOcupada())
            return número+" "+ this.vehicle.getMatricula();
        else return número+" lliure";
    }

    
}
