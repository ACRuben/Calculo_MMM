/*
 * Realizar un vector que guarde 200 estaturas, calcular las medidas de 
 * media, mediana y moda 
 */
package examen;

/**
 *
 * @author Ruben Aellano Correa
 */
public class Examen {

    public static void main(String[] args) 
    {
    
        calculos cl=new calculos();
        System.out.println("\t------Medidas------");
        cl.vector();
        cl.media();
        cl.mediana();
        cl.moda();
    }
    
}
