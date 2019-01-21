package br.com.alura.aluraviagens.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class ResourceUtil {

    public static Drawable retornaDrawable(Context context, String drawableEmTexto) {
        Resources resources = context.getResources();                                //retorna br.com.alura.aluraviagens
        int idDoDrawable = resources.getIdentifier(drawableEmTexto, "drawable", context.getPackageName());
        return resources.getDrawable(idDoDrawable);
    }
}
