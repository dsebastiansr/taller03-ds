package clinicaveterinaria.model;

public class CirugiaTratamiento extends Tratamiento {

    private String indicaciones;

    private String salaIndicaciones;

    private Double impuesto;

    public CirugiaTratamiento(int id, TipoTratamiento tipo, String descripcion, Double costo) {
        super(id,tipo,descripcion,costo);
        this.indicaciones = "Ayuno previo y control postoperatorio";
        this.salaIndicaciones = "Preparar quirofano y anestesia.";
        this.impuesto = 1.35;
    }

    @Override
    public double calcularCostoFinal() {
        return this.getCosto() * 1.25 + 80.0;
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
