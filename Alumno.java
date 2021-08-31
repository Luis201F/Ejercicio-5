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
//EL objetivo de la clase es obtener los datos de un alumno.
class Alumno{

	//Atributos de la clase alumno
	String nombre;//Tipo de dato cadena
	int matricula;//Tipo de dato entero
	String correo;//Tipo de dato cadena
	String carrera;//Tipo de dato cadena
	String telefono;//Tipo de dato cadena
	
	//Método constructor
        //Recibimos lo parametros de los atributos
        //El metodo es publico por lo que podemos acceder a el desde cualquier parte.
	public Alumno(String nombre, int matricula, String correo, String carrera, String telefono){
		setNombre(nombre);
		setMatricula(matricula);
		setCorreo(correo);      //Mandamos a llamar cada uno de los metos locales 
		setCarrera(carrera);
		setTelefono(telefono);
	}
	
	//Sección de metodos: setters, getters
	//Se le asigna un valor a la variable local que llega fuera de la clase
	public void setNombre(String nombre){
		this.nombre = nombre;//El valor que esta en esta clase es igual al valor que llega como parametro 
	}
	
	public void setMatricula(int matricula){
			this.matricula=matricula;
	}
	public void setCorreo(String correo){
		this.correo = correo;
	}
	public void setCarrera(String carrera){
		this.carrera = carrera;
	}
	
	public void setTelefono(String telefono){
		this.telefono = telefono;
	}
	
        //Regresa los atributos
	public String getNombre(){
		return nombre;
	}
	
	public int getMatricula(){
		return matricula;
	}
	public String getCorreo(){
		return correo;
	}
	
	public String getCarrera(){
		return carrera;
	}
	
	public String getTelefono(){
		return telefono;
	}
	
	
} //fin de clase Alumno

