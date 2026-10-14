package clinicaveterinaria.interfaces;

import java.time.LocalDate;

import clinicaveterinaria.model.Cita;
import clinicaveterinaria.model.Mascota;
import clinicaveterinaria.model.Veterinario;



public interface IVeterinarioService {
        void crearVeterinario(Veterinario veterinario);

      Veterinario obtenerVeterinario(int id);

        void actualizarVeterinario(Veterinario veterinario);

        void eliminarVeterinario(int id);

        Cita reservarCita(Mascota mascota, Veterinario veterinario, LocalDate fecha);



}
