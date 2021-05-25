package Vuelos;

import java.util.Scanner;

public class AvionBarato extends AvionAPI
{
    public void avionBarato()
    {
        int respuesta;
        System.out.println("¿Cual deseas? : 1=Avianca 874.500  , 2=Viva ir Colombia $974.800 ");
        Scanner r = new Scanner(System.in);
        respuesta = r.nextInt();
        if (respuesta == 1)
        {
            System.out.println("El vuelo que reservaste es: " + respuesta);
        }
        else
        {
            System.out.println("El vuelo que reservaste es: " + respuesta);
        }

    }
}
