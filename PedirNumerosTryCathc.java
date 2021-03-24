import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.InputMismatchException;


public class PedirNumerosTryCathc {

    private int aux, i, j;
    private int [] numeros =  new int [6];

    Scanner sc  = new Scanner(System.in);
    PedirNumeros()
    {
        pedir(0);
        burbuja();
    }

    void pedir(Integer numero)
    {
        for (int i = numero; i < numeros.length; i++) {
            System.out.println("Digite numero ["+ i +"]");
    
            try {
                numeros[i] = sc.nextInt();
            } catch (Exception e) {
                System.out.println("error "+ e);
                i--;
                sc.nextLine();
                continue;
            }
            
        }
    }

    void burbuja()
    {
        for (i = 0; i < numero.length - 1; i++) {
            for (j = 0; j < numero.length - i - 1; j++) {
                if (numero[j + 1] < numero[j]) {
                    int aux = numero[j + 1];
                    numero[j + 1] = numero[j];
                    numero[j] = aux;
                }
            }
        }
    }

    void imprimir()
    {
        for (int k = 0; k < numero.length + 3 ; k++) {
            try {
                System.out.println(numero[k] + " ");
            } catch (Exception e) {
                System.out.println("Aca la exepcion -> " + e);
            }
        }
    }

    public static void main(String[] args) {
        PedirNumerosTryCathc s = new PedirNumerosTryCathc();
    }
    
}