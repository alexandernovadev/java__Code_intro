package Ventas;

class Persona
{

    private String nombre;
    private String apellido;
    private String genero;
    private int documento;
    private String fecha;

    public Persona(){}
    
    public Persona(String n,String a,String g,Integer d,String f)
    {
    	this.nombre = n;
    	this.apellido = a;
    	this.genero= g;
    	this.documento=d;
    	this.fecha =f;
    }


    public String getNombre(){return nombre;}
    public String getApellido(){return apellido;}
    public String getGenero(){return genero;}
    public int getDocumento(){return documento;}  
    public String getFecha(){return fecha;} 
    
    public void setNombre(String nombre){this.nombre = nombre.toLowerCase();}
    public void setApellido(String apellido){this.apellido = apellido;}
    public void setGenero(String genero){this.genero  = genero;}
    public void setDocumento(Integer documento){this.documento = documento;}
    public void setFecha(String fecha){this.fecha = fecha;}

    public String getFullName() {
    	return nombre.toUpperCase() + " "+ apellido.toUpperCase();
    }
}