package com.devix.recyclerviewcircleview;
/*
 *Created by Carlos Anguiano on 15/03/17.
 *For more info contact : c.joseanguiano@gmail.com
 */

public class Datos {
    private int image;
    private String Nombre;

    public Datos(int image, String nombre) {
        this.image = image;
        Nombre = nombre;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
