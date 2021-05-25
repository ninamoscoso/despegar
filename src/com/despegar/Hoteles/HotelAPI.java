package com.despegar.Hoteles;

import Usuario.Buscar;

import java.util.Scanner;


public  class HotelAPI implements Buscar
{
    public void Reservar(String viajar, String origen, String fechaIda, String fechaRegreso)
    {
    }
    public void buscar_hoteles()
    {
        int respuesta;
        System.out.println("com.despegar.Hoteles encontrados");
        System.out.println("¿Que tipo de hotel deseas: 1=economico 2=caro \n");
        Scanner res= new Scanner(System.in);
        respuesta=res.nextInt();
        if(respuesta ==1)
        {
            HotelBarato hotelBarato= new HotelBarato();
            hotelBarato.Incluido();
        }
        else
        {
            HotelCaro hotelCaro = new HotelCaro();
            hotelCaro.hospedaje();
        }

    }

}
