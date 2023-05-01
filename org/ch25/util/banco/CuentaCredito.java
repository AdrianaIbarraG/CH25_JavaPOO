package org.ch25.util.banco;
import java.util.Date;

import org.ch25.util.Imprimible;

public class CuentaCredito extends Cuenta implements Imprimible {
	double limite; 
	Date fechaCorte;
	Date fechaLimitePago; 
	float tasa; 


	public CuentaCredito(int saldo, String numeroCliente, Date fechaApertura, Date fechaCorte, float tasa, double limite, String nombreCliente) {
		// TODO Auto-generated constructor stub
		super(saldo, numeroCliente, fechaApertura, nombreCliente);
		this.fechaCorte = fechaCorte;
		this.tasa = tasa;
		this.limite = limite; 
	}
	



	public double getLimite() {
		return limite;
	}//getLimite



	public void setLimite(double limite) {
		this.limite = limite;
	}//setLimite



	public Date getFechaCorte() {
		return fechaCorte;
	}//getFechaCorte



	public void setFechaCorte(Date fechaCorte) {
		this.fechaCorte = fechaCorte;
	}//setFechaCorte



	public float getTasa() {
		return tasa;
	}//getTasa



	public void setTasa(float tasa) {
		this.tasa = tasa;
	}//setTasa



	@Override
	public double retiro(double cantidad) {
		// TODO Auto-generated method stub
		return 0;
	}//retiro

	@Override
	public double deposito(double cantidad) {
		// TODO Auto-generated method stub
		return 0;
	}//deposito

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}//getSaldo



	@Override
	public String toString() {
		return "Cuenta Crédito [" + super.toString() + " Tasa=" + getTasa() + "%, Límite=" + getLimite() + "]";
	}//toString

	
	
}//class Cuenta Credito
