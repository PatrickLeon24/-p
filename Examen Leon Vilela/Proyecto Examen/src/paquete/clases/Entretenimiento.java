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
public class Entretenimiento extends Programa implements Interfaz{
    private int personal;

    public Entretenimiento(String codigo, String descripcion) {
        super(codigo, descripcion);
    }

    @Override
    public void calcularmontocapital() {
        Random r1 =new Random();
        this.montocapital=r1.nextInt(80000-60000+1)+60000;
    }

    @Override
    public void cantidadDePersonal() {
        Random r2 =new Random();
        this.personal=r2.nextInt(20-10+1)+10;
        
    }

    @Override
    public String toString() {
        return "codigo:" + this.codigo + "\ndescripcion:" + this.descripcion +
                "\nmontocapital:" + this.montocapital + "\nrating:" + this.rating+
                "\nCantidad de personal:"+this.personal;
    }
    
    
    
    
}
