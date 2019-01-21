package br.com.alura.aluraviagens.ui.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.alura.aluraviagens.util.DiaUtil;
import br.com.alura.aluraviagens.util.MoedaUtil;
import br.com.alura.aluraviagens.R;
import br.com.alura.aluraviagens.util.ResourceUtil;
import br.com.alura.aluraviagens.model.Pacote;

public class ListaPacotesAdapter extends BaseAdapter {

    private final List<Pacote> pacotes;
    private final Context context;

    public ListaPacotesAdapter(List<Pacote> pacotes, Context context) {
        this.context = context;
        this.pacotes = pacotes;
    }

    @Override
    public int getCount() {
        return pacotes.size();
    }

    @Override
    public Object getItem(int posicao) {
        return pacotes.get(posicao);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int posicao, View view, ViewGroup parent) {
        View viewPacote = LayoutInflater.from(this.context).inflate(R.layout.item_pacote, parent, false);

        Pacote pacote = pacotes.get(posicao);

        mostraLocal(viewPacote, pacote);
        mostraImagem(viewPacote, pacote);
        mostraDia(viewPacote, pacote);
        mostraPreco(viewPacote, pacote);

        return viewPacote;
    }

    private void mostraPreco(View viewPacote, Pacote pacote) {
        TextView preco = viewPacote.findViewById(R.id.item_pacote_preco);
        String formataMoedaBr = MoedaUtil.formataMoedaBr(pacote.getPreco());
        preco.setText(formataMoedaBr);
    }

    private void mostraDia(View viewPacote, Pacote pacote) {
        TextView dia = viewPacote.findViewById(R.id.item_pacote_dia);
        String diaTexto = DiaUtil.formataTextoDia(pacote.getDias());
        dia.setText(diaTexto);
    }

    private void mostraImagem(View viewPacote, Pacote pacote) {
        ImageView imagem = viewPacote.findViewById(R.id.item_pacote_imagem);
        Drawable drawableImagemPacote = ResourceUtil.retornaDrawable(context,pacote.getImagem());
        imagem.setImageDrawable(drawableImagemPacote);
    }

    private void mostraLocal(View viewPacote, Pacote pacote) {
        TextView local = viewPacote.findViewById(R.id.item_pacote_local);
        local.setText(pacote.getLocal());
    }
}
