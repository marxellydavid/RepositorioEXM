/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaprac2;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author David Marxelly
 */
public class nombre1Apellido1 {
    
    public static void main(String[] args)
    {
        String producto="";
        int opcion=0;
        int cantidad = 0;
        int cp;//cantidad de productos
        double pv = 0; //precio con iva
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Buenas tardes\n"
                + "Escoga la opcion 1 para agregar un producto\n"
                + "Escoga 2 para calcular total\n"
                + "Escoga 3 para salir"));
        
        //creando switch
        switch(opcion){
            
            //caso de agregar un producto
            case 1:
            cp = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la CANTIDAD de productos "));//pidiendo cantidad de productos
            for(int i=0; i<cp; i++){
                
            producto = JOptionPane.showInputDialog("Ingrese NOMBRE de producto");//ingresando nombres de productos
            cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese CANTIDAD DEL PRODUCTO"));//pidiendo cantidad de productos ingresados
            double precio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese PRECIO SIN IVA del producto"));//pidiendo precio sin IVA
            
            //añadiendo iva a precio
            pv = precio * 0.13;
            precio = (precio + pv);
            
            //tratando de imprimir el listado de productos
            JOptionPane.showMessageDialog(null,"Los productos ingresados son: ");
            JOptionPane.showMessageDialog(null, producto);
            JOptionPane.showMessageDialog(null, "Las cantidades han sido: ");
            JOptionPane.showMessageDialog(null, cantidad);
            JOptionPane.showMessageDialog(null, "El precio unitario de producto con IVA es: ");
            JOptionPane.showMessageDialog(null, precio);
            JOptionPane.showMessageDialog(null, "El total de la venta es: ");
            
            }//fin de for que recoge la cantidad de productos, junto a su nombre, cantidad y precio
            
            break;
            
            //caso de calcular total
            case 2:
                
            /*//tratando de imprimir el listado de productos
            for(int i = 0; i<cp; i++)
                {
                    JOptionPane.showMessageDialog(null,"Los productos ingresados son");
                    JOptionPane.showMessageDialog(null, producto);
                    JOptionPane.showMessageDialog(null, "Las cantidades han sido");
                    JOptionPane.showMessageDialog(null, cantidad);
                }*/
                
            break;
            
            //caso de salida
            case 3:
            System.out.println("Nos vemos");
            default:
        }
    }
}