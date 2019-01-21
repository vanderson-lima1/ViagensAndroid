package br.com.alura.aluraviagens.util;

import android.support.annotation.NonNull;

public class DiaUtil {

    @NonNull
    public static String formataTextoDia(int dia) {
        String diaTexto = String.valueOf(dia);
        diaTexto += " dia";
        if(dia>1)
            return diaTexto += "s";
        return diaTexto;
    }
}
