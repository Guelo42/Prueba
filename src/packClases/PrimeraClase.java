/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packClases;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class PrimeraClase {
    public String unaCadena;
    public int unEntero;
    
    public void mostrar(){
        System.out.println("Los atributos son: " + unaCadena + " y " + unEntero);
    }
    
    public static void main(String[] args) {
        int a = 5;
        float b = 53.8f;
        double c = 13.2;
        String d = new String("Hola");
        
        ArrayList<Float> Flotantes = new ArrayList<>();
        
        Flotantes.add(3.14f);
        Flotantes.add(6.28f);     
        Flotantes.add(b);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("\nArraylist:");
        b = 0f;
        a = 0;
        for(Float i : Flotantes){
            b += i;
            a++;
            System.out.println(i);
        }
        
        System.out.println("El promedio es: " + b/a);
        
        PrimeraClase unObjeto1 = new PrimeraClase();
        PrimeraClase unObjeto2 = new PrimeraClase();
        PrimeraClase unObjeto3 = new PrimeraClase();
        PrimeraClase unObjeto4 = new PrimeraClase();
        PrimeraClase unObjeto5 = new PrimeraClase();
        
        unObjeto1.unaCadena = "Ventilador";
        unObjeto1.unEntero = 5;
        unObjeto2.unaCadena = "Escritorio";
        unObjeto2.unEntero = 6;
        unObjeto3.unaCadena = "Lámpara";
        unObjeto3.unEntero = 8;
        unObjeto4.unaCadena = "Silla";
        unObjeto4.unEntero = 9;
        unObjeto5.unaCadena = "Cable";
        unObjeto5.unEntero = 10;
        
        unObjeto1.mostrar();
        unObjeto2.mostrar();
        unObjeto3.mostrar();
        unObjeto4.mostrar();
        unObjeto5.mostrar();
        
        ArrayList<PrimeraClase> Lista = new ArrayList<>();
        
        Lista.add(unObjeto1);
        Lista.add(unObjeto2);
        Lista.add(unObjeto3);
        Lista.add(unObjeto4);
        Lista.add(unObjeto5);
        
        System.out.println("\nLista de objetos: ");
        
        for(PrimeraClase i : Lista){
            i.mostrar();
        }
        
        unObjeto2.unEntero = 17;
        unObjeto3.unaCadena = "Tubo";
        unObjeto3.unEntero = 18;
        unObjeto4.unaCadena = "Pizarra";
        
        System.out.println("\nLista de objetos (con cambios): ");
        
        for(PrimeraClase i : Lista){
            i.mostrar();
        }
        
    }
    
}
