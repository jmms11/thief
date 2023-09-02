package com.teclogi.security.thief.service.dto;

import java.util.Arrays;

/**
 * 
 * @author JhonMauricio
 *
 */
public class HiddenMoneyDTO {
	
	private int[] money;

	/**
	 * @return the money
	 */
	public int[] getMoney() {
		return money;
	}

	/**
	 * @param money the money to set
	 */
	public void setMoney(int[] money) {
		this.money = money;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HiddenMoneyDTO [money=");
		builder.append(Arrays.toString(money));
		builder.append("]");
		return builder.toString();
	}
	
	

}
