package clinicaveterinaria.interfaces;



import java.time.LocalDate;
import clinicaveterinaria.model.Cita;
import clinicaveterinaria.model.Mascota;
import clinicaveterinaria.model.Veterinario;


public interface ICitaService{
        void crearCita(Cita cita);

        Cita obtenerCita(int id);

        void cancelarCita(int id);

        Cita reservarCita(Mascota mascota, Veterinario veterinario, LocalDate fecha);

        void diagnosticar(Cita cita, String diagnostico);
    }