package clinicaveterinaria.model;

public class TratamientoVacuna extends Tratamiento{

    private String indicaciones;

    public TratamientoVacuna(int id, TipoTratamiento tipo, String descripcion, double costo, String indicaciones){
        super(id,tipo,descripcion,costo);
        this.indicaciones = indicaciones;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    @Override
    public double calcularCostoFinal() {
        return this.getCosto() + 5.0;
    }

    @Override
    public String obtenerIndicaciones() {
        return "Observar fieber durante dos horas";
    }

    
}
