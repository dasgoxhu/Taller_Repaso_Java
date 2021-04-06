
package tallerjavar;


public class Clasestren {
    
    private String ID;
    private String Marca;
    private String Modelo;
    private int año;
    private boolean velocidad;
    
public Clasestren(String ID, String Marca, String Modelo, int año, boolean velocidad ){
this.ID = ID;
this.Marca = Marca;
this.Modelo = Modelo;
this.año = año;
this.velocidad = velocidad;
}

public String MetodoModelo(int año)
{
    if (this.año >= 2022)
        return "Modelo futuro";
    else if (this.año == 2021 )
        return "Ultimo modelo";
    else if (this.año == 2020)
        return "Modelo nuevo";
    else if (this.año >= 2017)
        return "Modelo reciente";
    else
        return "Modelo antiguo";            
}

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isVelocidad() {
        return velocidad;
    }

    public void setVelocidad(boolean velocidad) {
        this.velocidad = velocidad;
    }
    
    
    
}

