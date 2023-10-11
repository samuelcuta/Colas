import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AgendaLlamadas {
    private Queue<String> agenda;

    public AgendaLlamadas() {
        agenda = new LinkedList<>();
    }

    public void agregarLlamada(String nombre) {
        agenda.offer(nombre);
        System.out.println("Llamada agregada a la agenda: " + nombre);
    }

    public String realizarLlamada() {
        if (agenda.isEmpty()) {
            System.out.println("La agenda está vacía. No hay llamadas para realizar.");
            return null;
        }

        String nombre = agenda.poll();
        System.out.println("Realizando llamada a: " + nombre);
        return nombre;
    }

    public void mostrarAgenda() {
        if (agenda.isEmpty()) {
            System.out.println("La agenda está vacía.");
            return;
        }

        System.out.println("Agenda de llamadas:");
        for (String nombre : agenda) {
            System.out.println("- " + nombre);
        }
    }

    public static void main(String[] args) {
        AgendaLlamadas agenda = new AgendaLlamadas();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("--- AGENDA DE LLAMADAS ---");
            System.out.println("1. Agregar llamada a la agenda");
            System.out.println("2. Realizar una llamada");
            System.out.println("3. Mostrar la agenda completa");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opcion deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine(); // Limpiar el salto de línea pendiente
                    System.out.print("Ingrese el nombre de la persona a llamar: ");
                    String nombre = scanner.nextLine();
                    agenda.agregarLlamada(nombre);
                    break;
                case 2:
                    agenda.realizarLlamada();
                    break;
                case 3:
                    agenda.mostrarAgenda();
                    break;
                case 4:
                    System.out.println("Saliendo de la agenda de llamadas...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
            System.out.println(); // Línea en blanco para separar las iteraciones
        }
    }
}
