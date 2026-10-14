package clinicaveterinaria.model;

public class TratamientoVacuna extends Tratamiento{

    private String indicaciones;

    private String salaIndicaciones;

    private Double impuesto;

    public TratamientoVacuna(int id, TipoTratamiento tipo, String descripcion, double costo){
        super(id,tipo,descripcion,costo);
        this.indicaciones = "Observar fieber durante dos horas";
        this.salaIndicaciones = "Preparar refrigeracion y jeringas.";
        this.impuesto = 1.12;
    }

    @Override
    public double calcularCostoFinal() {
        return this.getCosto() + 5.0;
    }

    @Override
    public String obtenerIndicaciones() {
        return indicaciones;
    }

    @Override 
    public double getImpuesto(){
        return impuesto;
    }

    @Override 
    public String getSalaIndicaciones(){
        return salaIndicaciones;
    }
    
}
