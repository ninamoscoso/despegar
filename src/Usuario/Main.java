package Usuario;

import Vuelos.AvionAPI;
import com.despegar.Hoteles.HotelAPI;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        int respuesta,opciones;
        String viajar,origen,fechaIda,fechaRegreso;

        System.out.println("Bienvenido querido usuario ");

        System.out.println("ingrese  el destino al que quiere ir:\n");Scanner viaje= new Scanner(System.in); viajar=viaje.next();

        System.out.println("ingrese su localizacion de origen :\n");Scanner orig= new Scanner(System.in);origen = orig.next();

        System.out.println("por favor ingrese fecha de ida: ");Scanner ida= new Scanner(System.in); fechaIda=ida.next();

        System.out.println("por favor ingrese fecha de regreso");Scanner regreso = new Scanner(System.in); fechaRegreso=regreso.next();

        System.out.println(" por favor selecione que desea reservar: 1=Avion, 2=Hotel");
        Scanner res = new Scanner(System.in);
        respuesta = res.nextInt();

        if (respuesta ==1)
        {

            AvionAPI avionAPI = new AvionAPI();
            avionAPI.Reservar("viajar" + viajar, "origen" + origen, "+ fechaIda" + fechaIda, "fechaRegreso" + fechaRegreso);
            avionAPI.getRespuesta();

        }
            else
            {
                HotelAPI hotelAPI = new HotelAPI();
                hotelAPI.Reservar("viajar"+ viajar,"origen" +origen,"+ fechaIda"+fechaIda,"fechaRegreso"+fechaRegreso);
                hotelAPI.buscar_hoteles();
            }
        System.out.println("¿Desea hacer otra reserva? : 1=si 2=no \n");
        Scanner num= new Scanner(System.in);
        opciones= num.nextInt();
        if (opciones==1)
        {
            System.out.println(" por favor selecione que desea reservar: 1=Avion, 2=Hotel");
            Scanner R = new Scanner(System.in);
            respuesta = R.nextInt();

            if (respuesta ==1)
            {

                AvionAPI avionAPI = new AvionAPI();
                avionAPI.Reservar("viajar" + viajar, "origen" + origen, "+ fechaIda" + fechaIda, "fechaRegreso" + fechaRegreso);
                avionAPI.getRespuesta();

            }
            else
            {
                HotelAPI hotelAPI = new HotelAPI();
                hotelAPI.Reservar("viajar"+ viajar,"origen" +origen,"+ fechaIda"+fechaIda,"fechaRegreso"+fechaRegreso);
                hotelAPI.buscar_hoteles();
            }

        }
        else
        {
            System.out.println("tu reserva se hizo con exito :)");
        }

            System.out.println("tu reserva se hizo con exito :)");
    }

}