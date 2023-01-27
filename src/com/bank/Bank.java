/* 
*/


package com.bank;

/**
 * @author Administrator
 *
 */
public class Bank {
	
	private int savingsAccNo;
	private double interstRate;
	private double savingsbalance;
	private String state;
	
	
	public void setsavingsAccNo(int savingsAccNo_var) {
		savingsAccNo = savingsAccNo_var;
	}
		
	public int getsavingsAccNo() {
		
		return savingsAccNo;
	}
		
	
	public void setstate (String state_var) {
		state = state_var;
	}
		
	public String getstate() {
		
		return state;
	}
	
	
	public void setinterstRate(double interstRate_var) {
		interstRate = interstRate_var;
	}
		
	public double getinterstRate() {
		
		return interstRate;
	}
	
	public void setsavingsbalance (double savingsbalance_var) {
		interstRate = savingsbalance_var;
	}
		
	public double getsavingsbalance() {
		
		return savingsbalance;
	}
		
}
	
	
	
	
	
	

