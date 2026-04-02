import java.util.Date;

public class Vino extends Producto implements ICalorias, ILiquido, IDescuento{

    private String tipoVino;
    private int gradosAlcohol;

    private float descuentoPorcentaje;
    private float volumen;
    private String tipoEnvase;


    public Vino(String marca, float precio, String tipoVino, int gradosAlcohol) {
        super(marca, precio);
        this.tipoVino = tipoVino;
        this.gradosAlcohol = gradosAlcohol;
    }


    public String getTipoVino() {
        return tipoVino;
    }

    public void setTipoVino(String tipoVino) {
        this.tipoVino = tipoVino;
    }

    public int getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(int gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
    }


    @Override
    public void setDescuento(float descuento) {
        descuentoPorcentaje = descuento;
    }

    @Override
    public float getDescuento() {
        return descuentoPorcentaje;
    }

    @Override
    public float getPrecioDescuento() {
        return (getPrecio() * descuentoPorcentaje);
    }


    @Override
    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

    @Override
    public float getVolumen() {
        return volumen;
    }

    @Override
    public void setTipoEnvase(String tipoEnvase) {
        this.tipoEnvase = tipoEnvase;
    }

    @Override
    public String getTipoEnvase() {
        return tipoEnvase;
    }

    @Override
    public int getCalorias() {
        return gradosAlcohol * 10;
    }

    @Override
    public String toString() {
        return "Vino [" + super.toString() + ", Tipo de vino: " + tipoVino + ", Graduación alcohólica: "+ gradosAlcohol + "ª]";
    }
}
