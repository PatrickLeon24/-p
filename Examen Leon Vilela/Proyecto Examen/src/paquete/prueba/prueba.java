/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.prueba;

import paquete.clases.*;
import paquete.gestion.Gestionar;

/**
 *
 * @author o13309
 */
public class prueba {
    public static void main(String[] args) {
        
        Infantil obj1=new Infantil("22","Infantil");
        obj1.calcularmontocapital();
        obj1.Calcularmontoseguro();
        obj1.calcularrating();
        System.out.println(obj1.toString());
        System.out.println("");
        
        Periodistico obj2=new Periodistico("23","Periodistico");
        obj2.calcularmontocapital();
        obj2.calcularrating();
        obj2.cantidadDePersonal();
        System.out.println(obj2.toString());
        System.out.println("");
        
        Entretenimiento obj3=new Entretenimiento("24","Entretenimiento");
        obj3.calcularmontocapital();
        obj3.calcularrating();
        obj3.cantidadDePersonal();
        System.out.println(obj3.toString());
        
        System.out.println("");
        System.out.println("Ingresar");
        
        Gestionar g1=new Gestionar();
        g1.IngresarPrograma(obj2);
        g1.IngresarPrograma(obj1);
        System.out.println(g1.VerInfo());
        
        System.out.println("///");
        System.out.println("Eliminar");
        g1.Eliminarporcodigo("P23");
        System.out.println(g1.VerInfo());
        System.out.println("***");
        System.out.println("ordenar por monto");
        g1.IngresarPrograma(obj2);
        g1.IngresarPrograma(obj3);
        g1.Ordenar();
        System.out.println(g1.VerInfo());
        
        
   
    }
    
}
