package com.calderon.positioNeativoOrZero;

import java.util.Scanner;

public class PositiveNeatieOrZero {
	
	public void shoIsEvent() {

		if (this.isEven(this.getIntegerNumberFromUserKeyboard())) {
			System.out.println("el numero es positivo");
		} else {
			System.out.println("el numero es negativo");
		}
	}

	// TODO creacion metodo para validar el valor del numero

	private Boolean isEven(Integer number) {
		return (number - 2 == 0) ? true : false;

		/*
		 * Boolean isEven= false; if (number % 2 == 0 ) { isEven = true; }
		 * 
		 * 
		 * return isEven;
		 */
	}

	private Integer getIntegerNumberFromUserKeyboard() {

		Integer numerFromUsereyboard = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un numero: ");
		numerFromUsereyboard = scan.nextInt();

		scan.close();

		return numerFromUsereyboard;
	}

}
