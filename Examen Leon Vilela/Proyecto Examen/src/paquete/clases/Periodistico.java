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
public class Periodistico extends Programa implements Interfaz{

    private int personal;
    
    public Periodistico(String codigo, String descripcion) {
        super(codigo, descripcion);
    }

    @Override
    public void calcularmontocapital() {
       Random r1 =new Random();
       Random r2 =new Random();
       int x=r1.nextInt(50000-40000+1)+40000;
       int y=r2.nextInt(7-3+1)+3;
       this.montocapital=x*y;
       
    }

   

    @Override
    public void cantidadDePersonal() {
        if(5<this.rating&this.rating<15){
           Random r1 =new Random();
           this.personal=r1.nextInt(25-15+1)+15;
            
        }
        else{
            this.personal=30;
        }
    }
    @Override
    public String toString() {
         return "codigo:" + this.codigo + "\ndescripcion:" + this.descripcion +
                "\nmontocapital:" + this.montocapital + "\nrating:" + this.rating+
                "\nCantidad de personal:"+this.personal;
    }
    
}
