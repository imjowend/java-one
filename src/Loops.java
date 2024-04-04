import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        for (int i = 0; i < 3; i++) {
            nota = teclado.nextDouble();
            mediaEvaluaciones += nota;
        }
        System.out.println("La media de las evaluaciones de la peli es: " + mediaEvaluaciones/3  );
    }
}
