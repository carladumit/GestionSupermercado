public class Detergente extends Producto implements IDescuento, ILiquido {

    private float descuentoPorcentaje;
    private float volumen;
    private String tipoEnvase;

    public Detergente(String marca, float precio) {
        super(marca, precio);
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
        return (super.getPrecio() * descuentoPorcentaje);
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
    public String toString() {
        return "Detergente [" + super.toString() + "]";
    }
}




