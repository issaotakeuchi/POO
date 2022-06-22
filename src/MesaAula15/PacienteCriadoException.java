package MesaAula15;

public class PacienteCriadoException extends Exception {
    public PacienteCriadoException(){
        super("data de internacao incorreta. Posterior a data de hoje ou data de alta anterior a data de internacao");
    }
}
