import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de calificaciones:");
        int cantidadCalificaciones = scanner.nextInt();
        
        int sumaCalificaciones = 0;
        
        for (int i = 1; i <= cantidadCalificaciones; i++) {
            System.out.println("Ingrese la calificación #" + i + ":");
            int calificacion = scanner.nextInt();
            
            sumaCalificaciones += calificacion;
        }
        
        double promedio = (double) sumaCalificaciones / cantidadCalificaciones;
        
        System.out.println("El promedio final es: " + promedio);
        
        if (promedio >= 71) {
            System.out.println("Felicidades, usted esta aprobado :D");
        } else {
            System.out.println("Lo la mento usted esta reprobado :(");
        }
        
        scanner.close();
    }
}
