import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;


class Invertir
{
    ArrayList <String> students = new ArrayList<String>();

    
    public Invertir()
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
        invertir();
    }
    
    public void listar()
    {
        pintar();
    }

    public void invertir()
    {
        Collections.sort(students, Collections.reverseOrder() );
        // Collections.reverseOrder(this.students);
        pintar();
    }

    public void pintar()
    {
        for(String i: students)
        {
            System.out.println("->: "+ i);
        }
        System.out.println("\n\n\n");
    }

    public static void main(String[] args) 
    {
        Invertir main = new Invertir();
        
    }
}