package clinicaveterinaria.model;

public class FisioterapiaTratamiento extends Tratamiento{

    private String indicaciones;

    public FisioterapiaTratamiento(int id, TipoTratamiento tipo, String descripcion, double costo, String indicaciones) {
        super(id, tipo, descripcion, costo);
        this.indicaciones = indicaciones;
    }

    @Override
    public double calcularCostoFinal() {
        return this.getCosto() * 0.95;
    }

    @Override
    public String obtenerIndicaciones() {
        return "Repetir ceciones 2 veces por semana";
    }

    
}
