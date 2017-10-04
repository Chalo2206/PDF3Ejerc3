package pdf3ejer3;

import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class PDF3Ejer3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N;
        int contMas = 0; 
        int contMenos = 0;
        double media = 0;
        //Leer el número de personas
        do{
            System.out.print("Número de personas: ");
            N = sc.nextInt();
        }while(N<=0);
        //Se crea el array de tamaño N
        double[] alto = new double[N];
        //Leer alturas
        System.out.println("Lectura de la altura de las personas: ");
        for (int i = 0; i < N; i++) {
            System.out.print("persona " + (i+1) + " = ");
            alto[i] = sc.nextDouble();
            media = media + alto[i]; //se suma la estatura leída para calcular la media
        }
        //Calcular la media
        media = media / N;
        //recorremos el array para ver cuantos hay más altos
        //que la media y cuantos más bajos
        for (int i = 0; i < alto.length; i++) {
            if (alto[i] > media){ //si la estatura es mayor que la media
                contMas++;
            } else if (alto[i] < media){ //si es menor
                contMenos++;
            }
        }
        //Mostrar resultados
        System.out.println("Estatura media : " + media);
        System.out.println("estatura superior a la media : " + contMas);
        System.out.println("estatura inferior a la media : " + contMenos);
    }
    
}
