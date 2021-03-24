import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

class Principal
{

    Scanner s = new Scanner(System.in);
    ArrayList <Estudiante> student = new ArrayList<Estudiante>();

    public Principal()
    {
     
        llenarDatosPruebas();

        char o = 'w';
        while (o != 'z')
        {
            o = menu();

            switch (o) {
                case 'a':
                    inscribir();
                    break;
                case 'b':
                    listar();
                    break;
                case 'c':
                    consultarStudent();
                    break;
                case 'd':
                    System.out.println("\n======ORDEN NOMBRE ASCENDENTE======");
                    System.out.println("\n___________________________________");
                    pintar("ASC", "nombre");
                    break;
                case 'e':
                    System.out.println("\n======ORDEN NOMBRE DESCENDENTE======");
                    System.out.println("\n___________________________________");
                    pintar("DESC", "nombre");
                    break;
                case 'f':
                    System.out.println("\n======ORDEN CODES ASCENDENTE======");
                    System.out.println("\n___________________________________");
                    pintar("ASC", "code");
                    break;
                case 'g':
                    System.out.println("\n======ORDEN CODES DESCEDENTE======");
                    System.out.println("\n___________________________________");
                    pintar("DESC", "code");
                    break;

                case 'h':
                    System.out.println("\n======ORDEN PROMEDIOS ASCEDENTE======");
                    System.out.println("\n___________________________________");
                    pintar("ASC", "promedio");
                    break;

                case 'i':
                    System.out.println("\n======ORDEN PROMEDIOS DESCEDENTE======");
                    System.out.println("\n___________________________________");
                    pintar("DESC", "promedio");
                    break;
                
                case 's':
                    o = 8;
                    break;

                default:
                    System.out.println("SELECCIONE UNA OPCION VALIDA!!!");
                    o=0;
                    break;
            }
        }
    }


    //  TESTS DATA
    public void llenarDatosPruebas()
    {
        //                                NOMBRE   CODE   ID      Promed.
        Estudiante test1 = new Estudiante("Alex"   , 1  , 10751 , 4.99f);
        Estudiante test2 = new Estudiante("PaCo"   , 22 , 20752 , 5.00f);
        Estudiante test3 = new Estudiante("Andrea" , 35 , 10751 , 4.31f);
        Estudiante test4 = new Estudiante("Wilmer" , 46 , 30751 , 3.59f);
        // Estudiante test5 = new Estudiante("PeDro"  , 47 , 10759 , 3.21f);
        // Estudiante test6 = new Estudiante("Sara"   , 49 , 40751 , 4.12f);
        // Estudiante test7 = new Estudiante("Keylor" , 63 , 10104 , 2.13f);

        student.add(test1);
        student.add(test2);
        student.add(test3);
        student.add(test4);
        // student.add(test5);
        // student.add(test6);
        // student.add(test7);
    }
    // TESTS DATA 

    public char menu()
    {
        System.out.println("--[PRESS M], VER MENU--");
        String m=s.next();
 
        System.out.println("\n\n===========MENU===========");
        System.out.println("| a. Inscribir \n| b. Listar \n| c. Consultar");
        System.out.println("| d. Orden Nombres ASCENDENTE \n| e. Orden Nombres DESCENDENTE");
        System.out.println("| f. Orden Codes ASCENDENTE \n| g. Orden Codes DESCENDENTE");
        System.out.println("| h. Orden Promedios ASCENDENTE \n| i. Orden Promedios DESCENDENTE");
        System.out.println("| S. Salir");
        System.out.println("===========MENU===========\n");

        System.out.println("DIGITE OPCION: ");
        String opcion = s.next();
        return opcion.charAt(0);    
    }

    public void inscribir()
    {
        Estudiante nuevo = new Estudiante();

        System.out.println("\n======GUARDAR======");
        System.out.println("Nombre: ");
        nuevo.setNombre(s.next());
        System.out.println("Codigo: ");
        nuevo.setCodigo(s.nextInt());
        System.out.println("Identificaion: ");
        nuevo.setIdentificacion(s.nextInt());
        System.out.println("Promedio: ");
        nuevo.setPromedio(s.nextFloat());

        student.add(nuevo);
    }

    public void listar()
    {
        System.out.println("\n======LISTAR======");
        System.out.println("\n___________________________________");

        if(student.size() == 0)
        {
            System.out.println("\n Agrega ElEMENTOS A LA LISTA");
        }
        else
        {
            int idx =0;
            for (Estudiante estudiante : student) {

                System.out.println("["+ idx +"]"); idx++;
                System.out.println("Nombre: "+ estudiante.getNombre());
                System.out.println("CODE: "+estudiante.getCodigo());   
                System.out.println("ID: "+ estudiante.getIdentificacion());
                System.out.println("Promedio: "+estudiante.getPromedio()); 
                System.out.println("___________________________________\n");
            }
        }
    }

    public void consultarStudent()
    {
     
        System.out.println("\n======CONSULTAR======");


        int i=0;for(Estudiante est: student)
        {
            System.out.println("["+i+"]: \t"+est.getNombre());i++;
        }
        System.out.println("Digite Indice a consultar");
        int indice = s.nextInt();

        System.out.println("\n========RESULTADO========\n");
        System.out.println("NOMBRE: "+student.get(indice).getNombre());
        System.out.println("CODIGO: "+student.get(indice).getCodigo());
        System.out.println("IDENTIFICACION: "+student.get(indice).getIdentificacion());
        System.out.println("PROMEDIO: "+student.get(indice).getPromedio());
        System.out.println("\n========RESULTADO========\n");
    }
    
    public List<Estudiante> orden(String tipo,String cual)
    {
        HashMap<Integer, Estudiante> listaEstudiantes = new HashMap<Integer, Estudiante>();

        // Llena lista
        int i=0;
        for (Estudiante estudiante : student) {
            listaEstudiantes.put(i,estudiante);i++;
        }

       
        List<Estudiante> studentBy = new ArrayList<>(listaEstudiantes.values());

         // ASC O DESC
        if(tipo ==  "ASC")
        {
             // CUAL?  nombre, code, identicacion, promedio  
            switch (cual) {
                case "nombre":
                        Collections.sort(studentBy, Comparator.comparing(Estudiante::getNombre));
                    break;
                case "promedio":
                        Collections.sort(studentBy, Comparator.comparing(Estudiante::getPromedio));
                    break;
                case "code":
                    Collections.sort(studentBy, Comparator.comparing(Estudiante::getCodigo));
                
                case "id":
                    Collections.sort(studentBy, Comparator.comparing(Estudiante::getIdentificacion));
                break;
            
                default:
                    break;
            }
        }else if(tipo == "DESC")
        {
            // CUAL?  nombre, code, identicacion, promedio  
            switch (cual) {
                
                case "nombre":
                        Collections.sort(studentBy, 
                        Collections.reverseOrder(Comparator.comparing(Estudiante::getNombre)));
                    break;
                case "promedio":
                        Collections.sort(studentBy, 
                        Collections.reverseOrder(Comparator.comparing(Estudiante::getPromedio)));
                    break;
                case "code":
                    Collections.sort(studentBy, 
                    Collections.reverseOrder(Comparator.comparing(Estudiante::getCodigo)));
                
                case "id":
                    Collections.sort(studentBy, 
                    Collections.reverseOrder(Comparator.comparing(Estudiante::getIdentificacion)));
                break;
            
                default:
                    break;
            }
        }

        // Retornar valor ya cocinado :D
        return studentBy;
    }

    public void pintar(String tipo, String atributo){
        for (Estudiante student : orden(tipo, atributo)) {
            System.out.println("Nombre: "+student.getNombre());
            System.out.println("Code: "+student.getCodigo());
            System.out.println("ID: "+student.getIdentificacion());
            System.out.println("PROM.: "+student.getPromedio());
            System.out.println("___________________________________");
        }
    }

    public static void main(String[] args) 
    {
        Principal main = new Principal();
        
    }
}