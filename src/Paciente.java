import java.util.ArrayList;
import java.util.List;

public class Paciente {
	
	private String nmPaciente, cpf, dtNascimento;
    public String getNmPaciente() {
        return nmPaciente;
    }

    public void setNmPaciente(String nmPaciente) {
        this.nmPaciente = nmPaciente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public Paciente(String nmPaciente, String cpf, String dtNascimento) {

	    this.nmPaciente = nmPaciente;
	    this.cpf = cpf;
	    this.dtNascimento = dtNascimento;
    }

    public  Paciente(){

    }
    
    @Override
    public String toString(){
        return (this.getNmPaciente() + " - " + this.getCpf() + " - " + this.getDtNascimento());
    }
}

