package MesaAula15;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws PacienteAltaException, PacienteCriadoException {
        try {
            Paciente paciente = new Paciente("Juan","Perez","12345", LocalDate.of(2021, 5, 10));
            paciente.darAlta(LocalDate.of(2021,5,20));

            System.out.println(paciente.getDataInternacao());
            System.out.println(paciente.getDataAlta());

        } catch (PacienteCriadoException | PacienteAltaException e) {
            System.out.println(e.getMessage());
        }





    }
}
