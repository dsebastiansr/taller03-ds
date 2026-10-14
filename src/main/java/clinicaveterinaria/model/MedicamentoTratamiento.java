package clinicaveterinaria.model;

public class MedicamentoTratamiento extends Tratamiento {
    
    private String indicaciones;

    public MedicamentoTratamiento(int id, TipoTratamiento tipo, String descripcion, double costo, String indicaciones) {
        super(id, tipo, descripcion, costo);
        this.indicaciones = indicaciones;
    }

    @Override
    public double calcularCostoFinal() {
        return this.getCosto() * 1.10;
    }

    @Override
    public String obtenerIndicaciones() {
        return "Asministrar segun receta";
    }

    

}
