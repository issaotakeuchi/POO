package MesaAula12;

public class Assistente extends Funcionario {
    private String numeroMatricula;

    public Assistente(String nome, double salario, String numeroMatricula) {
        super(nome, salario);
        this.numeroMatricula = numeroMatricula;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public void addAumento() {

    }

    @Override
    public double ganhoAnual() {

        return 0;
    }

    @Override
    public void exibeDados() {
        System.out.println("o numero de matricula é " + getNumeroMatricula());

    }
}
