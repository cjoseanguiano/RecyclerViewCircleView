package com.devix.recyclerviewcircleview;
/*
 *Created by Carlos Anguiano on 15/03/17.
 *For more info contact : c.joseanguiano@gmail.com
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

class DatosAdapter extends RecyclerView.Adapter<DatosAdapter.DatosViewHolder> {

    private List<Datos> datosList;

    public DatosAdapter(List<Datos> datosList) {
        this.datosList = datosList;
    }

    @Override
    public DatosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_dialog, parent, false);
        return new DatosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DatosViewHolder holder, int position) {
        holder.circleImageView.setImageResource(datosList.get(position).getImage());
        holder.nombre.setText(datosList.get(position).getNombre());
    }

    @Override
    public int getItemCount() {
        return datosList.size();
    }

    public static class DatosViewHolder extends RecyclerView.ViewHolder {
        public CircleImageView circleImageView;
        public TextView nombre;


        public DatosViewHolder(View itemView) {
            super(itemView);
            circleImageView = (CircleImageView) itemView.findViewById(R.id.profile_image);
            nombre = (TextView) itemView.findViewById(R.id.txtNombreUser);

        }
    }

}
