package com.example.storemisintic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.storemisintic.Adaptadores.ProductoAdapter;
import com.example.storemisintic.Entidades.Producto;

import java.util.ArrayList;

public class Catalogo extends AppCompatActivity {
    private ListView listviewproducts;
    private ProductoAdapter productoAdapter;
    private ArrayList<Producto> arrayProducts;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);

        arrayProducts=new ArrayList<>();

        //***Creación de Productos Para la Lista


        Producto producto1=new Producto("Colombia Local","Última Camiseta de Adidas de la Selección Colombia",230000,R.drawable.camiseta);
        Producto producto2=new Producto("Colombia Visita","Última Camiseta de visita de Adidas de la Selección Colombia",230000,R.drawable.colombiav);

        Producto producto3=new Producto("Pantaloneta","Última Pantaloneta de Adidas de la Selección Colombia",165000,R.drawable.pantaloneta);

        Producto producto4=new Producto("Alemania Local","Camiseta Local de la Selección Alemana",300000,R.drawable.alemania);
        Producto producto5=new Producto("Alemania Visita","Camiseta Visita de la Selección Alemana",340000,R.drawable.alemaniav);
        Producto producto6=new Producto("Millonarios Visita","Camiseta Visita de Millonarios",160000,R.drawable.millosv);
        Producto producto7=new Producto("Medellín Visita","Camiseta Visita de Medellín",170000,R.drawable.medellinv);
        Producto producto8=new Producto("Arsenal FC","Jersey Arsenal Local de Inglaterra",180000,R.drawable.arsenal);
        Producto producto9=new Producto("Japón Local","Jersey Local Seleccionado de Japón ",290000,R.drawable.japon);
        Producto producto10=new Producto("Ajax","Tercera Equipación del Ajax de Holanda",110000,R.drawable.ajax);
        //***Fin de la Creación

        //Añadiendo los productos a la lista

        arrayProducts.add(producto1);
        arrayProducts.add(producto2);
        arrayProducts.add(producto3);
        arrayProducts.add(producto4);
        arrayProducts.add(producto5);
        arrayProducts.add(producto6);
        arrayProducts.add(producto7);
        arrayProducts.add(producto8);
        arrayProducts.add(producto9);
        arrayProducts.add(producto10);



        productoAdapter=new ProductoAdapter(this,arrayProducts);
        listviewproducts=(ListView) findViewById(R.id.listviewproducts);

        listviewproducts.setAdapter(productoAdapter);

    }
}