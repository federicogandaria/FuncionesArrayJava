import java.util.Arrays;
import java.util.Scanner;

public class EjFun1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrNombres = new String[8];
        int[] arrNotas = new int[8];
        int aprobado = 6;

        System.out.println("Seleccione una opcion:\n Opcion 1: Registrar Usuarios \n Opcion 2: Salir");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                rellena(arrNombres);
                rellenaInt(arrNotas);
                System.out.println("Ver quienes aprobaron?\n 4-Si \n 5-Salir");
                int opcion2 = sc.nextInt();
                switch (opcion2){
                    case 4:
                        for (int i=0; i < arrNotas.length; i++){
                            if (arrNotas[i] >= aprobado){
                                System.out.println(arrNombres[i]+", aprobaste nota: "+ arrNotas[i]+"/10 puede continuar con el tramite para la obtencion de licencia de conducir");


                            } else if (arrNotas[i] < aprobado) {
                                System.out.println(arrNombres[i]+", no aprobaste nota: " + arrNotas[i]+"/10 no puede continuar con el tramite para la obtencion de licencia de conducir");


                            }
                        }
                        break;
                    case 5:
                        System.out.println("SALIR");
                        break;
                }

        }
    }


    static void rellena(String[] relleno) { // Función para rellenar array de nombres

        Scanner sc = new Scanner(System.in);
        System.out.println("Registre nombre de usuario seguido de tecla enter (Registrar 8): ");

        for (int i = 0; i < relleno.length; i++) {

            relleno[i] = sc.next();

        } // for
        Arrays.sort(relleno); // Ordena el array.
    }
    static void rellenaInt(int[] relleno) { // Función para rellenar array de Notas

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < relleno.length; i++) {

            switch (i) {
                case 0:
                    System.out.println("Ingrese la nota del primer usuario");
                    break;
                case 1:
                    System.out.println("Ingrese la nota del segundo usuario");
                    break;
                case 2:
                    System.out.println("Ingrese la nota del tercer usuario");
                    break;
                case 3:
                    System.out.println("Ingrese la nota del cuarto usuario");
                    break;
                case 4:
                    System.out.println("Ingrese la nota del quinto usuario");
                    break;
                case 5:
                    System.out.println("Ingrese la nota del sexto usuario");
                    break;
                case 6:
                    System.out.println("Ingrese la nota del septimo usuario");
                    break;
                case 7:
                    System.out.println("Ingrese la nota del octavo usuario");
                    break;


            }
            relleno[i] = sc.nextInt();

        } // for
        //Arrays.sort(relleno); // Ordena el array.
    }
}
