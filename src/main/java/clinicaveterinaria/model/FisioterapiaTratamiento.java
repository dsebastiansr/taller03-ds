package clinicaveterinaria.model;

public class FisioterapiaTratamiento extends Tratamiento{

    private String indicaciones;

    private Double impuesto;

    public FisioterapiaTratamiento(int id, TipoTratamiento tipo, String descripcion, double costo) {
        super(id, tipo, descripcion, costo);
        this.indicaciones = "Repetir ceciones 2 veces por semana";
        this.impuesto = 1.05;
    }

    @Override
    public double calcularCostoFinal() {
        return this.getCosto() * 0.95;
    }

    @Override
    public String obtenerIndicaciones() {
        return indicaciones;
    }
    
    @Override 
    public double getImpuesto(){
        return impuesto;
    }

}
