import java.time.LocalDate;

public class Cachorro {
    private String nome;
    private String raca;
    private Integer anoNascimento;
    private Double peso;
    private Boolean possuiChip;
    private Boolean estaFerido;

    public Cachorro(String nome, String raca, Integer anoNascimento, Double peso, Boolean possuiChip, Boolean estaFerido) {
        this.nome = nome;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.possuiChip = possuiChip;
        this.estaFerido = estaFerido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(Integer anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Boolean getPossuiChip() {
        return possuiChip;
    }

    public void setPossuiChip(Boolean possuiChip) {
        this.possuiChip = possuiChip;
    }

    public Boolean getEstaFerido() {
        return estaFerido;
    }

    public void setEstaFerido(Boolean estaFerido) {
        this.estaFerido = estaFerido;
    }

    public Integer idadeCachorro(){
        return LocalDate.now().getYear() - this.getAnoNascimento();
    }
    public Boolean validar() {
        return this.getPossuiChip();
    }

    public Boolean aptoParaAdotar() {
        return this.getEstaFerido() == false && this.getPeso() > 5;
        }
}
