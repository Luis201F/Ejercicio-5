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
class Coche{
    //Declaracion de los atributos que tendra la clase indicando el tipo de dato que son
    String marca;
    String numSerie;
    String modelo;
    int version;
    String tipo;//[sedan,suv,picup,etc]
    String transmision;
    double precio;
    //Método constructor
    //Recibimos lo parametros de los atributos
    //El metodo es publico por lo que podemos acceder a el desde cualquier parte.
    public Coche(String marca,String numSerie){
		setMarca(marca);
		setNumSerie(numSerie);
		
	}
    //setters
    public void setMarca(String marca){
	this.marca = marca;
    }
    public void setNumSerie(String numSerie){
        this.numSerie =numSerie ;
    }
  
    
    //getters
    public String getMarca(){
        return marca;
    }
    public String getNumSerie(){
        return numSerie;
    }

    
   
}