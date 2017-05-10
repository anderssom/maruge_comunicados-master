package br.com.maruge.maruge_comunicados.model;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import br.com.maruge.maruge_comunicados.MainActivity;

/**
 * Created by Anderson on 09/05/2017.
 */

public class MeuAdaptador extends BaseAdapter {
    private String[] itens = new String[]{
            "Pedro",
            "João",
            "carlos",
            "jose"
    };

    private Context context;

    public MeuAdaptador(Context context) {
        this.context = context;
    }

    public MeuAdaptador(MainActivity mainActivity) {
    }

    @Override
    public int getCount() {
        return itens.length;
    }

    @Override
    public Object getItem(int i) {
        return itens[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        String texto = itens[i];
       TextView tv = new TextView(this.context);
        tv.setText(texto);
        return tv;
    }
}
