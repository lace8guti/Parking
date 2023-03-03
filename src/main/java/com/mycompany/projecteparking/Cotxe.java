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
public class Cotxe extends Vehicle{
    
    private double descompte;
    
    //constructor de descompte
    public Cotxe(double descompte) {
        this.descompte = descompte;
    }
    
    public double getDescompte() {
        return descompte;
    }

    public void setDescompte(double descompte) {
        this.descompte = descompte;
    }

    
    
    
    
    
    
    @Override
    public double calcularPreu() {
        
        
        double preu = super.calcularPreu()-super.calcularPreu()*(this.getDescompte());
        return preu; 
    }
}

