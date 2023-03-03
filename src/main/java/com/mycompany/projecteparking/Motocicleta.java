/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projecteparking;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 *
 * @author alumne
 */
public class Motocicleta extends Vehicle{
    
    private int cc;

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
    
    
    
    @Override
    public double calcularPreu() {
        
        
        double preu = super.calcularPreu()*(0.5);
        return preu; 
    }
}
