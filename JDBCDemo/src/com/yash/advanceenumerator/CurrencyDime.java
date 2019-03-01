package com.yash.advanceenumerator;

import java.awt.Color;

public class CurrencyDime {
public static void main(String[] args) {
	Currency usCoin = Currency.DIME;
	switch(usCoin) {
	case PENNY:System.out.println("Penny coin : ");
	break;
	case NICKLE:System.out.println("Nickle coin : ");
	break;
	case DIME:System.out.println("Dime coin : ");
	break;
	case QUARTER:System.out.println("Quarter coin : ");
	break;
	}
	for(Currency coin : Currency.values()) {
		System.out.println("coin : "+coin);
	}
}
}
