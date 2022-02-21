package com.codingdojo.peru.full_time_2022.calculadora_i;

public class Calculadora implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 78402342022422193L;
	private double operandoUno;
	private String operacion;
	private double operandoDos;
	private double resultado;
	
	public Calculadora() {
		super();
	}

	public double getOperandoUno() {
		return operandoUno;
	}

	public void setOperandoUno(double operandoUno) {
		this.operandoUno = operandoUno;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public double getOperandoDos() {
		return operandoDos;
	}

	public void setOperandoDos(double operandoDos) {
		this.operandoDos = operandoDos;
	}
	
	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public void realizarOperacion() {
		if (getOperacion() == "+") {
			setResultado(getOperandoUno() + getOperandoDos());
		} else if (getOperacion() == "-") {
			setResultado(getOperandoUno() - getOperandoDos());
		}
	}
	
	public void getResultados() {
		realizarOperacion();
		System.out.println(getOperandoUno() + " " + getOperacion() + " " + getOperandoDos() + " = " + getResultado());
	}
}
