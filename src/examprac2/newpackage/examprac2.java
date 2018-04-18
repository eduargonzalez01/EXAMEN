/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examprac2.newpackage;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author Administrador
 */
public class examprac2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Efrain Eduardo Landaverde Gonzalez
        //Vincent Steve Torres Sanchez
        int lk;
        int op=0;
        double total = 0;
        int cantEmpleado = 0;
        double desc, sf = 0, salario;
        String nombre[]=new String[10];
         int numeroHoras[] = new int[10];
         double salarioH[] = new double[10];
          
        while(op!=3)
        {
            
             op=Integer.parseInt(JOptionPane.showInputDialog("**************MENU************\nIngrese Opcion \n 1) Agregar Empleado \n 2) Calcular Planilla \n 3) Salir \n" ));  
            
             switch(op){
                 case 1:
             cantEmpleado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados"));
              for (int i = 0; i < cantEmpleado; i++) {
                  
            nombre[i]=JOptionPane.showInputDialog("Ingrese su nombre");
            numeroHoras[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario por hora ingresada"));
            salarioH[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas"));
          
              }
              
              break;
              
                 case 2:

                     
                     for (int i = 0; i < cantEmpleado; i++) {
                         
                    
                
                     salario= salarioH[i]*numeroHoras[i];
                     desc=salario*0.1;
                     sf=salario-desc;
                     total=salarioH[i]*numeroHoras[i];
                     
                        JOptionPane.showMessageDialog(null, "Registros\n Nombre: "+nombre[i]+"\n Salario por hora:"+salarioH[i]+"\n Numero de horas:"+numeroHoras[i]+"\n Salario Final:"+sf);
                      }
                     JOptionPane.showMessageDialog(null, "El total de la planilla" +total);
                     
                     break;
                 case 3:
                     JOptionPane.showMessageDialog(null,"Adios vaquero");
                     System.exit(op);
                     break;
              //Termina switch
            }
        }
    }
    
}

