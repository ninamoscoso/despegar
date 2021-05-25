package com.despegar.Hoteles;

import java.util.Scanner;

public class HotelBarato extends HotelAPI
{
    public void Incluido()
    {
        int respuesta;
        System.out.println("¿Cual deseas? : 1= habitacion por una noche $207.000, 2= habitación  por una noche mas desayuno $240.500, 3=habitacion doble mas desayuno $598.560");
        Scanner r= new Scanner(System.in);
        respuesta=r.nextInt();
    }
}
