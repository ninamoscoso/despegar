package Vuelos;

import Usuario.Buscar;
import com.despegar.Hoteles.HotelCaro;

import java.util.Scanner;

public  class AvionAPI extends Abstracta implements Buscar
{
    public void Reservar(String viajar, String origen, String fechaIda, String fechaRegreso)
    {
        int respuesta;
        System.out.println("Vuelos encontrados");
        System.out.println("¿Que tipo de vuelo deseas: 1=economico 2=caro \n");
        Scanner res= new Scanner(System.in);
        respuesta=res.nextInt();
        if(respuesta ==1)
        {
           AvionBarato avionBarato = new AvionBarato();
           avionBarato.avionBarato();
        }
        else
        {
            AvionCaro avionCaro = new AvionCaro();
            avionCaro.Primera_clase();
        }
    }
    public  AvionAPI()
    {

        super("respuesta");
    }

    public String getRes()
    {

        return "el resultado ";
    }
}
