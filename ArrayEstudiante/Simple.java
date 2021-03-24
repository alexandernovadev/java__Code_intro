class Simple
{

    public static void main(String[] args) {
        String[] cars = 
        { "Juan" ,
        "Pedro",
        "Maria",
        "Jesus",
        "Alejandra",
        "Dayse",
        "Marlen",
        "Carlos",
        "Daniel", 
        "Alex"};


        // Listar
        for (int i =0; i<cars.length; i++)
        {
            System.out.println("-> :"+ cars[i]);
        }
        System.out.println("\n\n >INVERTIDOS\n");
         // Inverir
   
         for (int w = cars.length -1 ; w>=0; w--)
         {
             var d = 0;
             System.out.println("-> :"+ cars[w]);
         }
    }
}