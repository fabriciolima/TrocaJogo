import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class JogoAdapter extends BaseAdapter {
    private List<Jogo> Jogo;

    public JogoAdapter(List<Jogo> jogo) {
        this.Jogo = jogo;
    }

    public int getCount() {
        return Jogo.size();
    }

    public Object getItem(int posicao) {
        return Jogo.get(posicao);
    }

    public long getItemId(int posicao) {
        return Jogo.get(posicao).getId();
    }

    public View getView(int posicao, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.Jogo_item, parent, false);
        //	recupera	o	Jogo	da	posição
        //	popula	a	view
        return view;
    }
}