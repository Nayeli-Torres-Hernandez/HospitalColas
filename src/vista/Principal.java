package vista;
/**
 *EDA: Colas
 * 13/07/2020
 * @author Nayeli Torres Hernández
 * DSM304
 */
import control.ColaDinamica;
import control.Teclado;
import modelo.Tickets;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException {

        ColaDinamica<Tickets> espera = new ColaDinamica<>();
        ColaDinamica<Tickets> atendidos = new ColaDinamica<>();
        Teclado sc = new Teclado();

        int op;
        
        do {
            System.out.println("\n\n<<< COLAS >>>");
            System.out.println("1.- Registro de Pacientes");
            System.out.println("2.- Registro de Pacientes atendidos");
            System.out.println("3.- Pacientes en espera");
            System.out.println("4.- Pacientes atendidos");
            System.out.println("5.- Total de pacientes");
            System.out.println("6.- Reporte pacientes en espera");
            System.out.println("7.- Reporte pacientes en asientos");
            System.out.println("8.- Salir");
            System.out.print("Opcion: ---> ");
            op = sc.getInt();

            switch (op) {
                case 1:
                    //Registrar el arribo de un paciente y mandarlo a la sala de espera
                        System.out.println("\n\n<<< Registro de Pacientes>>>");
                        System.out.print("Número de seguro: ");
                        int numSeguro = sc.getInt();
                        System.out.print("Nombre del Paciente: ");
                        String nombre = sc.getString();
                        System.out.print("Padecimiento de ingreso: ");
                        String padecimiento = sc.getString();
                        System.out.print("Alegias: ");
                        String alergias = sc.getString();
                        System.out.println("¿Tipo de atención requerida?\n   Atención inminente\n   Atención urgente\n   Atención próxima");
                        String tipoAtencion = sc.getString();
                        Tickets e = new Tickets(numSeguro, nombre, padecimiento, alergias, tipoAtencion);
                        espera.enqueue(e);
                        System.out.println("***Registrado Correctamente ***");
                        
                        break;
                case 2: System.out.println("\n\n<<< Registro de Atendidos>>>");
                        e = espera.dequeue();
                        System.out.println("El paciente con los siguientes datos \n"+ atendidos.enqueue(e));
                        System.out.println("***Ha sido atendido***");
                        break;
                case 3: System.out.println("\n\n<<<Clientes en espera>>>");
                        System.out.println("Los pacientes en espera son: " +espera.size());
                        System.out.println("*****************************************");
                        break;
                case 4: System.out.println("\n\n<<<Pacientes atendidos>>>");
                        System.out.println("Los pacientes atendidos son: " +atendidos.size());
                        System.out.println("*****************************************");
                        break;
                case 5: System.out.println("\n\n<<<Total de pacientes>>>");
                        int suma = espera.size()+atendidos.size();
                        System.out.println("Los pacientes en el hospital son: " + suma);
                        System.out.println("*****************************************");
                        break;
                case 6: System.out.println("\n\n<<<Reporte de pacientes en espera>>>");
                        System.out.println(espera.toString());
                        System.out.println("*****************************************");
                        break;        
                case 7: System.out.println("\n\n<<<Reporte de pacientes atendidos>>>");
                        System.out.println(atendidos.toString());
                        System.out.println("*****************************************");
                        break; 
                case 8:
                    System.out.println("Saliendo");
                    break;
                default:
                      System.out.println("\n\n<<<Opción incorrecta>>>");
                        break;
            }
        } while (op != 8);
    }

}
