package org.ch25.util;

import org.ch25.util.banco.Cuenta;

public interface Imprimible {
	
	public double getSaldo();
	public double retiro(double cantidad); 
	public double deposito(double cantidad); 
	}//interface imprimible
