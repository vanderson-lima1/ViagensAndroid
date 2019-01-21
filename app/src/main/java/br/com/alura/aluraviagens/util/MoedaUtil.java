package br.com.alura.aluraviagens.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MoedaUtil {

    public  static String formataMoedaBr(BigDecimal valor){
        NumberFormat formatoMoedaBrasil = DecimalFormat.getCurrencyInstance(new Locale("pt", "br"));
        String precoFormatadoBrasil = formatoMoedaBrasil
                .format(valor)
                .replace("$", "$ ");
        return precoFormatadoBrasil;
    }
}
