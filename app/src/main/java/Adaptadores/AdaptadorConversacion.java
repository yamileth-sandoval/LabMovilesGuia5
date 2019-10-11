package Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.labmovilesguia5.R;
import Entidades.conversacion;
import java.util.List;

public class AdaptadorConversacion extends BaseAdapter {
    private List<conversacion> datasource;
    private Context cntx;
    private int IdLayoutPlantilla;

    public List<conversacion> GetData(){
        return this.datasource;
    }

    /**
     * Constructor que permite inicializar las variables de la clase
     * @param context
     * @param IdPlantilla
     * @param sources
     */

    public AdaptadorConversacion(Context context, int IdPlantilla, List<conversacion> sources){
        //Inicializamos las variables
        this.cntx = context;
        this.IdLayoutPlantilla = IdPlantilla;
        this.datasource = sources;
    }

    @Override
    public int getCount() {
        return this.datasource.size();
    }

    @Override
    public conversacion getItem(int position) {
        return this.datasource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Creamos el Administrador de Layout
        LayoutInflater inflater = (LayoutInflater) this.cntx.getSystemService(this.cntx.LAYOUT_INFLATER_SERVICE);
        //Le damos vida al archivo xml ahora es un Layout
        convertView = inflater.inflate(this.IdLayoutPlantilla,null);

        //Buscamos los controles de nuestra plantilla
        TextView texNombre = convertView.findViewById(R.id.texNombre);
        TextView texMensaje = convertView.findViewById(R.id.texMensaje);
        TextView texUltimaConexion = convertView.findViewById(R.id.texUltimaConexion);
        ImageView icono=convertView.findViewById(R.id.icono);

        //Obtenemos el dato a mostrar
        texNombre.setText(this.datasource.get(position).getNombre());
        texMensaje.setText(this.datasource.get(position).getMensaje());
        texUltimaConexion.setText(this.datasource.get(position).getUltimaConexion());
        icono.setImageResource(this.datasource.get(position).getImg());
        return convertView;
    }
}
