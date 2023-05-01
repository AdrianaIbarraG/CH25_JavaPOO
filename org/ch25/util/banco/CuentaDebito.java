package org.ch25.util.banco;
import java.util.Date;

import org.ch25.util.Imprimible;

public class CuentaDebito extends Cuenta implements Imprimible {
	
	double montoMinimo;

	
	public CuentaDebito(double saldo, String numeroCliente, Date fechaApertura, double montoMinimo,
			String nombreCliente) {
		super(saldo, numeroCliente, fechaApertura, nombreCliente);
		this.montoMinimo = montoMinimo;
	}//Constructor
	
	public double getMontoMinimo() {
		return montoMinimo;
	}//getMontoMinimo

	public void setMontoMinimo(double montoMinimo) {
		this.montoMinimo = montoMinimo;
	}//setMontoMinimo


	@Override
	public double retiro(double cantidad) {
		// TODO Auto-generated method stub
		if(getSaldo()>this.retiro(cantidad)) {
			return saldo - cantidad;
		}
		return saldo;
	}//retiro

	@Override
	public double deposito(double cantidad) {
		// TODO Auto-generated method stub
		return saldo + cantidad; 
	}//deposito

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return saldo; //Revisar
	}//getSaldo

	@Override
	public String toString() {
		return "Cuenta Débito [" + super.toString() + ", Monto Mínimo=" + montoMinimo + "]"; 
	}//toString


	
}//class CuentaDebito
