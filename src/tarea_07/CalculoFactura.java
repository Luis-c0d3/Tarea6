/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_07;

/**
 *
 * @author noelialuis
 */
public class CalculoFactura {
    
    public void aplicarDescuento(double precioProducto, int numProductos){     double Total; 
    if(numProductos>LIMITE_DESCUENTO) 
        precioProducto-=DESCUENTO_MINIMO; 
            if (numProductos!=0){ 
            Total = precioProducto*DESCUENTO_PRIME;
            mostrarTotal(Total); 
        }else { 
            Total = precioProducto*DESCUENTO_NORMAL;
            mostrarTotal(Total); 
        }   
    } 
    private static final int DESCUENTO_MINIMO = 5;
    private static final int LIMITE_DESCUENTO = 3;
    private static final double DESCUENTO_NORMAL = 0.95;
    private static final double DESCUENTO_PRIME = 0.8;

    public void mostrarTotal(double Total) {
        System.out.println("El total a pagar es:"+Total);
        System.out.println("Enviado");
    }
    
}
