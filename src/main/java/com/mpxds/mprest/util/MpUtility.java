package com.mpxds.mprest.util;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MpUtility {
	//    
	public static int mpObterTamanhoTexto(String texto) {
		//
		texto = texto.replace(System.getProperty("line.separator"), "");
		
		int tamTexto = texto.length();	
		//
		return tamTexto;
	}

	public static String diaSemana(Date dataX) {
		//
		Locale objLocale = new Locale("pt", "BR");
		//
		Calendar cal = Calendar.getInstance();
		cal.setTime(dataX);
		//
	  	String diaSemana = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, objLocale);
		//
		return diaSemana;
	}
	
	public static String mpFormataNumero(String numero, Integer tamanho) {
        //
		final String ZEROS = repeat("0", tamanho);

		String numeroX = numero.replace(".", "");

		numeroX = ZEROS.substring(numeroX.length()) + numeroX;		

//		System.out.println("Mpmprest.mpFormataNumero() - ( Numero = " + numero + "/" + ZEROS + "/" + numeroX);
		//
		return numeroX;
	}
	
	public static String repeat(String str, int count) {
	    return count > 0 ?  repeat(str, count -1) + str: "";
	}

	public static String mpFormataData(String data) {
		//	System.out.println("Mpmprest.mpFormataData() - ( Data = " + data);
        // xx/MM/yyyy -> xxMMyyyy ...
		// 0123456789
		if (data.isEmpty() || data.trim().length() < 10)
		    return data;
		//
		data = data.substring(0,2) + data.substring(3,5) + data.substring(6,10); 
		//
		return data;
	}
		
}
