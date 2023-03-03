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
public class Vehicle {
    protected String matricula; // Matrícula del vehicle
    protected LocalDateTime dataHoraEntrada; // Hi desaré quan el vehicle entra al parking

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDateTime getHoraEntrada() {
        return dataHoraEntrada;
    }

    // Posa una hora d'entrada específica
    public void setDataHoraEntrada(LocalDateTime horaEntrada) {
        this.dataHoraEntrada = horaEntrada;
    }

    // Posa com hora d'entrada l'hora actual
    public void setDataHoraEntrada() {
        this.dataHoraEntrada = LocalDateTime.now();
    }

    public double calcularPreu() {
        LocalDateTime dataHoraActual = LocalDateTime.now();
        Duration durada = Duration.between(this.dataHoraEntrada,dataHoraActual);
        double preu = durada.getSeconds() * Parking.PREU_MINUT;
        // La constant PREU_MINUT no està definida encara, substitueix-la pel valor 3.

        //double preu = durada.getSeconds() * 3;

        return preu; 
    } 
}
