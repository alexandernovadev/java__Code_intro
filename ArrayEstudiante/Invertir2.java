import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;


class Invertir2
{
    ArrayList <String> students = new ArrayList<String>();

    
    public Invertir2()
    {
        students.add("Alex");
        students.add("Belice");
        students.add("Marco");
        students.add("Alejandra");
        students.add("Alberto");
        students.add("Zion");
        students.add("Kellogs");
        students.add("Marina");
        students.add("Monica");
        students.add("Sara");


        listar();
   
    }
    
    public void listar()
    {
        pintar();
    }


    public void pintar()
    {
        System.out.println("NORMALES");
        for(String i: students)
        {
            System.out.println("->: "+ i);
        }

        System.out.println("sixe "+ students.size());
        System.out.println("\n \nInvertidos");
        for (int g = students.size() -1 ; g>=0; g--)
        {
            System.out.println("->: "+ students.get(g));
        }

        
    }

    public static void main(String[] args) 
    {
        Invertir2 main = new Invertir2();
        
    }
}