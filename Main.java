/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio5;

/**
 *
 * @author Luis
 */
public class Main {
     public static void main(String args[]){
	//Se declara el arreglo y damos la opcion al usuario de capturar el tamaño
        Alumno als[] = new Alumno[CapturaEntrada.capturarEntero("Introduce tamaño del arreglo als ")];
        Coche c[]=new Coche[CapturaEntrada.capturarEntero("Introduce tamaño del arreglo")];
        
        System.out.println("Datos para alumno : ");
            for(int i = 0; i < als.length; i++){//Agregamos los datos al arreglo mediante un ciclo for
                    als[i] = new Alumno(CapturaEntrada.capturarCadena("Introduce nombre "), CapturaEntrada.capturarEntero("Introduce matricula "), CapturaEntrada.capturarCadena("Introduce correo "),CapturaEntrada.capturarCadena("Introduce carrera "),CapturaEntrada.capturarCadena("Introduce telefono "));
            }
        System.out.println("Datos para coche : ");
        for(int k=0;k<c.length;k++){///Agregamos los datos al arreglo mediante un ciclo for
            c[k]=new Coche(CapturaEntrada.capturarCadena("Ingresa la marca"), CapturaEntrada.capturarCadena("Ingresa tu numero de serie")); 
        }
            
        System.out.println("Datos de alumno : ");
            for(int j = 0; j < als.length; j++){//Impresion de los datos del alumno 
                    System.out.println("Nombre(als)" + "[" + j + "]: " + als[j].getNombre());
                    System.out.println("Matricula(als)" + "[" + j + "]: " + als[j].getMatricula());
                    System.out.println("Correo(als)"+"["+j+"]"+als[j].getCarrera());//Llamamos a los datos que se ingresaron anetriormente
                    System.out.println("Carrera(als)"+"["+j+"]"+als[j].getCarrera());
                    System.out.println("Telefono(als)"+"["+j+"]"+als[j].getTelefono());
                    
            }
        System.out.println("Datos de coche: ");   
        for(int l=0;l<c.length;l++){//Impresion de los datos del alumno 
            System.out.println("Marca(c)" + "[" + l + "]: " + c[l].getMarca());//Llamamos a los datos que se ingresaron anetriormente
            System.out.println("Numero de serie(c)" + "[" + l + "]: " + c[l].getNumSerie());
        }
    } 
}
