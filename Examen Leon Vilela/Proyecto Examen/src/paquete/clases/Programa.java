/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.util.Random;

/**
 *
 * @author o13309
 */
public abstract class Programa {
    protected String codigo,descripcion;
    protected int montocapital,rating;

    public Programa(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMontocapital() {
        return montocapital;
    }

    public void setMontocapital(int montocapital) {
        this.montocapital = montocapital;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    public abstract void calcularmontocapital();
    
    public void calcularrating(){
        Random r1 =new Random();
        this.rating=r1.nextInt(25-5+1)+5;
        
    }

    @Override
    public String toString() {
        return "Programa{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", montocapital=" + montocapital + ", rating=" + rating + '}';
    }
    
}
