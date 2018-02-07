import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.fabricio.trocajogos.Jogo;
import com.fabricio.trocajogos.R;

import java.util.List;

public class ListaJogosActivity extends AppCompatActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.content_main);
        ListView lista = (ListView) findViewById(R.id.lista_jogo);
        //List<Jogo> listaJogos =    //	recupera	listagem
        lista.setAdapter(new JogoAdapter(Jogo));
    }

}
