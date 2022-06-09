package MesaAula12;

public class Administrativo extends Funcionario{
    private String turno;
    private double adicionalNoturno;
    public Administrativo(String nome, double salario, String turno, double adicionalNoturno) {
        super(nome, salario);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    @Override
    public void addAumento() {

    }

    @Override
    public double ganhoAnual() {
        return (getSalario()*12) + (getAdicionalNoturno()*12);
    }

    @Override
    public void exibeDados() {

    }
}
