package clinicaveterinaria.model;

import clinicaveterinaria.interfaces.ICaminador;
import clinicaveterinaria.interfaces.INadador;

public class Gato extends Animal implements ICaminador, INadador {
    public Gato(int id, String nombre) {
        super(id, nombre, TipoAnimal.GATO);
    }

    @Override
    public void nadar() {
        System.out.println(getNombre() + " esta nadando.");
    }

    @Override 
    public void caminar() {
        System.out.println(getNombre() + " esta caminando.");
    }
}
