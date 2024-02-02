import java.util.ArrayList;

public class Especialidades {
	private String idEspecialidade, nmEspecialidade;

	public String getIdEspecialidade() {
		return idEspecialidade;
	}

	public void setIdEspecialidade(String idEspecialidade) {
		this.idEspecialidade = idEspecialidade;
	}

	public String getNmEspecialidade() {
		return nmEspecialidade;
	}

	public void setNmEspecialidade(String nmEspecialidade) {
		this.nmEspecialidade = nmEspecialidade;
	}
	
	public Especialidades (String idEspecialidade, String nmEspecialidade) {
		this.idEspecialidade = idEspecialidade;
		this.nmEspecialidade = nmEspecialidade;
	}
	public Especialidades () {
		
	}
	@Override
	public String toString() {
		return (this.getIdEspecialidade() + " - " + this.getNmEspecialidade() );
	}
}


