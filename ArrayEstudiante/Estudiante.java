class Estudiante
{

    private String nombre;
    private int codigo;
    private int identificacion;
    private float promedio;

    public Estudiante(){}

    public Estudiante(String n, Integer c, Integer i, Float p)
    {
        this.nombre = n.toLowerCase();
        this.codigo = c;
        this.identificacion = i;
        this.promedio= p;
    }

    public String getNombre(){return nombre;}
    public int getCodigo(){return codigo;}
    public int getIdentificacion(){return identificacion;}
    public float getPromedio(){return promedio;}  
    
    public void setNombre(String nombre){this.nombre = nombre.toLowerCase();}
    public void setCodigo(Integer codigo){this.codigo = codigo;}
    public void setIdentificacion(Integer identificacion){this.identificacion  = identificacion;}
    public void setPromedio(Float promedio){this.promedio = promedio;}


}