import java.util.*;

public class Cereales extends Producto implements IAlimento, ICalorias {

    private String tipoCereal;
    private Date caducidad;

    private final int CALORIAS_ESPELTA = 5;
    private final int CALORIAS_MAIZ = 8;
    private final int CALORIAS_TRIGO = 12;
    private final int CALORIAS_GENERAL = 15;

    final Map<String, Integer> CALORIAS_CEREAL = Map.of(
            "Espelta", CALORIAS_ESPELTA,
            "Maiz", CALORIAS_MAIZ,
            "Trigo", CALORIAS_TRIGO
    );

    public Cereales(String marca, float precio, String tipoCereal) {
        super(marca, precio);
        this.tipoCereal = tipoCereal;
    }

    public String getTipoCereal() {
        return tipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }


    @Override
    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    @Override
    public Date getCaducidad() {
        return caducidad;
    }

    @Override
    public int getCalorias() {
        int calorias = 0;
        if (CALORIAS_CEREAL.containsKey(tipoCereal)) {
            calorias += CALORIAS_CEREAL.get(tipoCereal);
        } else {
            calorias = CALORIAS_GENERAL;
        }
        return calorias;
    }

    @Override
    public String toString() {
        return "Cereales [" + super.toString() + ", Tipo de cereal: " + tipoCereal + "]";
    }
}