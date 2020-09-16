package com.upc.autentication.entities;

import javax.persistence.*;

@Entity
@Table(name = "preferences_table")
public class Preferences {
    @Id
    @Column(name = "user_code")
    private Long user_code;
    private String numero_celular;
    private double peso;
    private double talla;
    private int edad;
    private short sexo;
    private short restricciones;
    private short frecuencia_actividad;
    private short objetivo;

    public Long getUserCode() {
        return user_code;
    }

    public void setUserCode(Long user_code) {
        this.user_code = user_code;
    }

    public String getNumero_celular() {
        return numero_celular;
    }

    public void setNumero_celular(String numero_celular) {
        this.numero_celular = numero_celular;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public short getSexo() {
        return sexo;
    }

    public void setSexo(short sexo) {
        this.sexo = sexo;
    }

    public short getRestricciones() {
        return restricciones;
    }

    public void setRestricciones(short restricciones) {
        this.restricciones = restricciones;
    }

    public short getFrecuencia_actividad() {
        return frecuencia_actividad;
    }

    public void setFrecuencia_actividad(short frecuencia_actividad) {
        this.frecuencia_actividad = frecuencia_actividad;
    }

    public short getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(short objetivo) {
        this.objetivo = objetivo;
    }
}
