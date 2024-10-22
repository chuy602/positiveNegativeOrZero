package com.calderon.positioNeativoOrZero;

import java.util.Scanner;

public class PositiveNegativeOrZero {

	public void shoIsPositiveNegativeOrZero() {
		System.out.println("El numero es : " 
	+ this.getPositiveNegativeOrZero(this.getIntegerNumberFromUserKeyboard()));
	}

	private String getPositiveNegativeOrZero(Integer number) {
		String positiveNegativeOrZero = "";

		if (number > 0) {
			positiveNegativeOrZero = "POSITIVO";
		} else {
			if (number < 0) {
				positiveNegativeOrZero = "NEGATVO";
			} else {
				positiveNegativeOrZero = "CERO";
			}

		}

		return positiveNegativeOrZero;
	}

	private Integer getIntegerNumberFromUserKeyboard() {
		Integer numerFromUsereyboard = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un numero entero: ");
		numerFromUsereyboard = scan.nextInt();

		scan.close();

		return numerFromUsereyboard;
	}

}
