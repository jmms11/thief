/**
 * 
 */
package com.teclogi.security.thief.service.dto;

/**
 * @author JhonMauricio
 *
 */
public class TheftDTO {
	
	private int moneyStolen;
	
	

	/**
	 * @param moneyStolen
	 */
	public TheftDTO(int moneyStolen) {
		super();
		this.moneyStolen = moneyStolen;
	}

	/**
	 * @return the moneyStolen
	 */
	public int getMoneyStolen() {
		return moneyStolen;
	}

	/**
	 * @param moneyStolen the moneyStolen to set
	 */
	public void setMoneyStolen(int moneyStolen) {
		this.moneyStolen = moneyStolen;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TheftDTO [moneyStolen=");
		builder.append(moneyStolen);
		builder.append("]");
		return builder.toString();
	}
	

}
