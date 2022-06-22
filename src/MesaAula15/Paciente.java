package MesaAula15;

import java.time.LocalDate;
import java.util.Date;

public class Paciente {
    String nome;
    String sobrenome;
    String historiaClinica;
    LocalDate dataInternacao;
    LocalDate dataAlta;


    Paciente(String nome, String sobrenome, String historiaClinica, LocalDate dataInternacao) throws PacienteCriadoException {
        this.nome=nome;
        this.sobrenome=sobrenome;
        dataAlta=null;
        if (dataInternacao.isAfter(LocalDate.now())) {
            throw new PacienteCriadoException();
        }
            this.dataInternacao=dataInternacao;
    }

    public LocalDate getDataInternacao() {
        return dataInternacao;
    }

    public LocalDate getDataAlta() {
        return dataAlta;
    }

    public void setDataInternacao(LocalDate dataInternacao) { this.dataInternacao = dataInternacao; }

    public void setDataAlta(LocalDate dataAlta) { this.dataAlta = dataAlta; }

    public void darAlta(LocalDate dataAlta) throws PacienteAltaException {
        if (dataAlta.isBefore(dataInternacao)) {
            throw new PacienteAltaException();
        }
        setDataAlta(dataAlta);
        System.out.println("ok");
    }
}
