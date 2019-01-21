package br.com.alura.aluraviagens.util;

import android.support.annotation.NonNull;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataUtil {


    @NonNull
    public static String  PeriodoEmTexto(int dias) {
        Calendar dataIda = Calendar.getInstance();
        Calendar dataVolta = Calendar.getInstance();
        dataVolta.add(Calendar.DATE, dias);
        SimpleDateFormat formatoBrasil = new SimpleDateFormat("dd/MM");
        String formatadaDataIda = formatoBrasil.format(dataIda.getTime());
        String formatadaDataVolta = formatoBrasil.format(dataVolta.getTime());
        return formatadaDataIda + " - "
                + formatadaDataVolta + " de "
                + dataVolta.get(Calendar.YEAR);
    }
}
