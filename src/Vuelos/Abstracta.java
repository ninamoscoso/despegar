package Vuelos;

import java.util.Scanner;

public abstract class Abstracta
{
    private String respuesta;
    public Abstracta (String respuesta)
    {
        this.respuesta = respuesta;
    }

    public  String getRespuesta()
    {
        return this.respuesta;

    }
    public abstract String getRes();
}
