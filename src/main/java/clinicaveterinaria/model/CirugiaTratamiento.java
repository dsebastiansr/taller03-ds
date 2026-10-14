package clinicaveterinaria.model;

public class CirugiaTratamiento extends Tratamiento {

    private String indicaciones;

    public CirugiaTratamiento(int id, TipoTratamiento tipo, String descripcion, Double costo, String indicaciones) {
        super(id,tipo,descripcion,costo);
        this.indicaciones = indicaciones;
    }

    @Override
    public double calcularCostoFinal() {
        return this.getCosto() * 1.25 + 80.0;
    }

    @Override
    public String obtenerIndicaciones() {
        return "Ayuno previo y control postoperatorio";
    }
}
