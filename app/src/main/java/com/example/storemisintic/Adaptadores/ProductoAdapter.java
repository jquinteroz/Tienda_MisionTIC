package com.example.storemisintic.Adaptadores;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.storemisintic.Entidades.Producto;
import com.example.storemisintic.Info;
import com.example.storemisintic.R;

import java.util.ArrayList;

public class ProductoAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Producto> arrayProducts;

    public ProductoAdapter(Context context, ArrayList<Producto> arrayProducts) {
        this.context = context;
        this.arrayProducts = arrayProducts;
    }


    @Override
    public int getCount() {
        return arrayProducts.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayProducts.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater=LayoutInflater.from(this.context);
        view=layoutInflater.inflate(R.layout.product_template,null);

        ImageView imgproduct =(ImageView) view.findViewById(R.id.imgproduct);
        TextView txtnameproducts= (TextView) view.findViewById(R.id.txtnameproducts);
        TextView txtdescriptionproducts= (TextView) view.findViewById(R.id.txtdescriptionproducts);
        TextView txtpriceproducts=(TextView) view.findViewById(R.id.txtpriceproducts);

        Producto producto=arrayProducts.get(i);

        imgproduct.setImageResource(producto.getImage());
        txtnameproducts.setText(producto.getName());
        txtdescriptionproducts.setText(producto.getDescription());
        txtpriceproducts.setText(String.valueOf(producto.getPrice()));

        imgproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context.getApplicationContext(), Info.class);
                intent.putExtra("name",producto.getName());
                intent.putExtra("description",producto.getDescription());
                intent.putExtra("price",producto.getPrice());
                intent.putExtra("image",producto.getImage());

                context.startActivity(intent);
            }
        });





        return view;
    }
}
