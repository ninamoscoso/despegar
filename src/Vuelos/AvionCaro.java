package Vuelos;

import Vuelos.AvionAPI;

import java.util.Scanner;

public class AvionCaro extends AvionAPI
{
    public void Primera_clase()
    {
        int respuesta;
        System.out.println("¿Cual deseas? : 1= Avianca $ 1.300.450, 2=Viva ir Colombia $ 1.800.750");
        Scanner r= new Scanner(System.in);
        respuesta=r.nextInt();

    }
}
