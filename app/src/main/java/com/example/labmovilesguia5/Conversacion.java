package com.example.labmovilesguia5;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import Adaptadores.AdaptadorConversacion;
import java.util.ArrayList;
import java.util.List;

import Entidades.conversacion;

public class Conversacion extends AppCompatActivity {
    conversacion item;
    List<conversacion> lista;
    ListView listaContactos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversacion);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        lista=new ArrayList<>();
        listaContactos=findViewById(R.id.listaContactos);
        CargarLista();
        listaContactos.setAdapter(new AdaptadorConversacion(this,R.layout.plantilla_conversacion,lista));
    }

    private void CargarLista(){
        item=new conversacion();
        item.setNombre("David Garcia");
        item.setMensaje("Hola, Que tal?");
        item.setUltimaConexion("6:38 AM");
        item.setImg(R.drawable.persona2);
        lista.add(item);

        item=new conversacion();
        item.setNombre("Jennifer Gonzalez");
        item.setMensaje("Ya hizo la tarea?");
        item.setUltimaConexion("6:20 AM");
        item.setImg(R.drawable.persona1);
        lista.add(item);

        item=new conversacion();
        item.setNombre("Juan Carlos Gonzalez");
        item.setMensaje("No hay clases?");
        item.setUltimaConexion("4:33 AM");
        item.setImg(R.drawable.persona4);
        lista.add(item);

        item=new conversacion();
        item.setNombre("+503 7865-9089");
        item.setMensaje("Documento actualizado, puedes revizarlo");
        item.setUltimaConexion("Viernes");
        item.setImg(R.drawable.contacto);
        lista.add(item);

        item=new conversacion();
        item.setNombre("Esmeralda Valencia");
        item.setMensaje("Eso no es urgente");
        item.setUltimaConexion("Jueves");
        item.setImg(R.drawable.persona3);
        lista.add(item);

        item=new conversacion();
        item.setNombre("Robert Jones");
        item.setMensaje("Actualiza la informaicon de tu perfil");
        item.setUltimaConexion("Miercoles");
        item.setImg(R.drawable.persona5);
        lista.add(item);

        item=new conversacion();
        item.setNombre("Pedro Peralta");
        item.setMensaje("Necesito ayuda");
        item.setUltimaConexion("Lunes");
        item.setImg(R.drawable.contacto);
        lista.add(item);

        item=new conversacion();
        item.setNombre("Claudia Zapata");
        item.setMensaje("Actualiza la informaicon de tu perfil");
        item.setUltimaConexion("Lunes");
        item.setImg(R.drawable.persona6);
        lista.add(item);
    }
}
