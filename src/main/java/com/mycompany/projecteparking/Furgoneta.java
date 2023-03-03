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
public class Furgoneta extends Vehicle{
    
    private int tara;

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }
    
    
    
    
    @Override
    public double calcularPreu() {
        
        double preu = super.calcularPreu()*2;
        
        return preu; 
    }
}
