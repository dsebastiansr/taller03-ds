package clinicaveterinaria.service;

import clinicaveterinaria.interfaces.IVeterinarioService;
import clinicaveterinaria.interfaces.IBaseDatos;


public class Clinica {
    private final IVeterinarioService veterinarioService;
    private final IBaseDatos baseDatos;

    public Clinica(IVeterinarioService veterinarioService, IBaseDatos baseDatos) {
        this.veterinarioService = veterinarioService;
        this.baseDatos = baseDatos;
    }
}

