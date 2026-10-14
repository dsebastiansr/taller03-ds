package clinicaveterinaria.model;

public class MedicamentoTratamiento extends Tratamiento {
    
    private String indicaciones;

    private Double impuesto;

    public MedicamentoTratamiento(int id, TipoTratamiento tipo, String descripcion, double costo, String indicaciones) {
        super(id, tipo, descripcion, costo);
        this.indicaciones = "Asministrar segun receta";
        this.impuesto = 1.08;
    }

    @Override
    public double calcularCostoFinal() {
        return this.getCosto() * 1.10;
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
