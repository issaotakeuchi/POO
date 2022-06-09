package MesaAula12;

public abstract  class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(
            String nome,
            double salario
    )
    {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public abstract void addAumento();

    public abstract double ganhoAnual();

    public abstract void exibeDados();

}

