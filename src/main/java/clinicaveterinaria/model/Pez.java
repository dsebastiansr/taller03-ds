package clinicaveterinaria.model;

import clinicaveterinaria.interfaces.INadador;

public class Pez extends Animal implements INadador {
    public Pez(int id, String nombre) {
        super(id, nombre, TipoAnimal.PEZ);
    }

    @Override 
    public void nadar() {
        System.out.println(getNombre() + " esta nadando");
    }
}