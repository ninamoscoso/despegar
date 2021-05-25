package com.despegar.Hoteles;

import Vuelos.AvionAPI;

import java.util.Scanner;

public class HotelCaro extends HotelAPI
{
    public void hospedaje()
    {
        int respuesta;
        System.out.println("¿Cual deseas? : 1= habitacion por una noche $977.500, 2= habitación  por una noche mas desayuno $1'200.000, 3=habitacion doble mas desayuno especial y piscina $1'600.000");
        Scanner r= new Scanner(System.in);
        respuesta=r.nextInt();
    }
}
