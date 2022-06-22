package MesaAula15;

public class PacienteAltaException extends Exception {
    public PacienteAltaException(){
        super("data de alta anterior a data de internacao");
    }
}
