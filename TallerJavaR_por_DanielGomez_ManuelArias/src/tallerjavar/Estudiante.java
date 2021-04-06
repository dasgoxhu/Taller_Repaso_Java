package tallerjavar;

public class Estudiante 
{
    private String Cedula,Nombre,Apellidos,Direccion;
    private boolean Becado = false;
    private double Matricula;
    public Estudiante(String Cedula, String Nombre, String Apellidos, String Direccion, boolean Becado,double Matricula) 
    {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
        this.Becado = Becado;
        setMatricula(Matricula);    
    }

    public String getCedula() 
    {
        return Cedula;
    }

    public void setCedula(String Cedula) 
    {
        this.Cedula = Cedula;
    }

    public String getNombre()
    {
        return Nombre;
    }

    public void setNombre(String Nombre) 
    {
        this.Nombre = Nombre;
    }

    public String getApellidos() 
    {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) 
    {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() 
    {
        return Direccion;
    }

    public void setDireccion(String Direccion) 
    {
        this.Direccion = Direccion;
    }

    public boolean isBecado() 
    {
        return Becado;
    }

    public void setBecado(boolean Becado) 
    {
        this.Becado = Becado;
    }

    public double getMatricula() 
    {
        return Matricula;
    }

    public void setMatricula(double Matricula) 
    {
        if(Becado)
        {
            this.Matricula = Matricula * 0.10; 
        }
        else
        {
        this.Matricula = Matricula; 
        }
    }   
}
