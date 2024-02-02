import java.util.Date;

public class Consulta {
	
	private Paciente paciente;
	private Especialidades especialidade;
	private Date data;
	
	public Consulta (Paciente paciente, Especialidades especialidade, Date date) {
		this.paciente = paciente;
		this.especialidade = especialidade;
		this.data = data;
	}
	
	public Paciente getNmPaciente() {
		return paciente;
		
	}
	
	public Especialidades getNmEspecialidade() {
		return especialidade;
	}
	
	public Date getdata() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
		
	}
		
	@Override
	public String toString() {
		return "Consulta [Paciente: " + paciente.getNmPaciente() + ", Especialidade: " + especialidade.getNmEspecialidade() +
				", Data: " + data + "]";
	}

	
	}


