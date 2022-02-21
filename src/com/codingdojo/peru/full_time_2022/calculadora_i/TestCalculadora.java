package com.codingdojo.peru.full_time_2022.calculadora_i;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora testApp = new Calculadora();
		testApp.setOperandoUno(10.5);
		testApp.setOperacion("+");
		testApp.setOperandoDos(5.2);
		// No es necesario que el usuario mande realizar la operación, en un App real generalmente se ingresan los operandos, la operación y se manda pedir el resultado. Al mandar pedir el resultado es que internamente se manda realizar la operación.
		// testApp.realizarOperacion();
		testApp.getResultados();
	}
}
