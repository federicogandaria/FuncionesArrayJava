/*
El parqueadero "El guardián" presta sus servicios de parqueadero nocturno para los usuarios del barrio y requiere una aplicación que permita
        registrar los vehículos que se cuidan en estas instalaciones.
        Se sugiere que el parqueadero tenga los atributos del vehículo como
        son, placa y marca, y los datos del cliente como son nombre completo y número de teléfono.
        Para cada vehículo se debe permitir la opción de ingresar al parqueadero,
        retirar del parqueadero y consultar si un vehículo se encuentra en el parqueadero.
        Recuerde que el sistema debe terminar cuando el usuario así lo indique.
        Tenga en presente que el parqueadero solo puede almacenar máximo 5 vehículos.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class EjFun2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Arrays info vehículos
        ArrayList<Integer> listaPlaca = new ArrayList<Integer>(5);
        ArrayList<String> listaMarca = new ArrayList<String>(5);
        //Arrays info persona
        ArrayList<String> listaNombres = new ArrayList<String>(5);;
        ArrayList<String> listaApellidos = new ArrayList<String>(5);;
        ArrayList<Integer> listaTelefono = new ArrayList<Integer>(5);
        //Array info si vehiculo está en parqueadero
        ArrayList<Boolean>listaAdentroAfuera = new ArrayList<Boolean>(5);

        System.out.println("Ingrese una opcion:\n 1)Registrarse en el parqueadero");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                cargarDatosUsuario(listaNombres,listaApellidos,listaTelefono);
                cargarDatosAuto(listaPlaca,listaMarca);
                System.out.println("Ingrese una opcion:\n 2) Ingresar vehiculo al parqueadero / Salir del parqueadero \n 3)Consultar si vehiculo se encuentra en el parqueadero" );
                int opcion2 = sc.nextInt();
                switch (opcion2){
                    case 2:
                        adentroAfuera(listaAdentroAfuera);
                        break;
                    case 3:
                        consultarSiEsta(listaPlaca);
                        break;
                    case 4:
                        System.out.println("Salir");
                        break;
                }

        }
    }

    private static void consultarSiEsta(ArrayList<Integer> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte numero de placa");
        int placa = sc.nextInt();
        if(array.contains(placa)){
            System.out.println("El vehiculo con numero de placa "+placa +"  se encuentra dentro del parkeadero");
        }else {
            System.out.println("Su vehiculo no se encuentra en el parqueadero");
        }

    }

    private static void adentroAfuera(ArrayList<Boolean> array) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a cargar");
        int N = sc.nextInt();
        System.out.println("ingresaste "+ N);
        for (int i = 0; i < N; i++) {

            if(i < 5) {
                System.out.println("Escriba si, para ingresar y no para salir");
                String res = sc.next();
                if (res.toLowerCase().equals("si")) {
                    array.add(i, true);
                    System.out.println("Su vehiculo fue registrado dentro del parkeadero");
                }else {
                    array.add(i, false);
                    System.out.println("Su vehiculo fue registrado fuera del parkeadero");
                }
                }


    }}

    private static void mostrarUsuarios(ArrayList<String> array, ArrayList<String> array2 ,ArrayList<Integer> array3) {

        for (int i = 0; i < array.size(); i++) {
            System.out.println("Espacio de parking numero "+i+ " "+array.get(i) +" "+ array2.get(i)+" "+ array3.get(i));
        }


    }
    private static void mostrarAuto(ArrayList<Integer> array, ArrayList<String> array2) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println("Espacio de parking numero "+i+ " "+"Numero de placa: "+array.get(i) +" "+" Marca del vehiculo "+ array2.get(i));
        }

    }


/*    private static void funcion1() {
        Scanner sc = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("Hola");
            System.out.print("Desea continuar cargando si o no?");
            respuesta = sc.nextLine();
        }while (respuesta.toLowerCase().equals("si") );
    }*/



    private static void cargarDatosUsuario (ArrayList<String> array,ArrayList<String> array2,ArrayList<Integer> array3){
        System.out.println();

        Scanner sc = new Scanner(System.in);


        System.out.println("Cuantos usuarios desea cargar al sistema?");
        int N = sc.nextInt();
        System.out.println("ingresaste "+ N);
        for (int i = 0; i < N; i++) {


            if(i < 5) {
                System.out.println("Ingrese el nombre del usuario \n Se le asignara el espacio numero:"+i+" "+"En nuestro parkeadero");
                array.add(i, sc.next());
                System.out.println("Ingrese el apellido del usuario con espacio numero :"+i +" "+"en nuestro pakeadero");
                array2.add(i, sc.next());
                System.out.println("Ingrese el numero de teléfono del usuario con espacio numero :"+i +" "+"en nuestro pakeadero");
                array3.add(i, Integer.valueOf(String.valueOf(sc.nextInt())));

            }
        }
    }



        private static void cargarDatosAuto (ArrayList<Integer> array1,ArrayList<String> array2){
            System.out.println();

            Scanner sc = new Scanner(System.in);


            System.out.println("Se permite 1 vehiculo por usuario, cuantos vehiculos desea cargar?");
            int N = sc.nextInt();
            System.out.println("ingresaste "+ N);
            for (int i = 0; i < N; i++) {


                if(i < 5) {
                    System.out.println("Ingresa numero de placa del vehiculo que se encontrara en el espacio "+i + " "+ "de nuestro parkeadero");
                    array1.add(i, Integer.valueOf(String.valueOf(sc.nextInt())));
                    System.out.println("Ingresa marca del vehiculo numero "+i);
                    array2.add(i, sc.next());
                }
            }
    }
}

