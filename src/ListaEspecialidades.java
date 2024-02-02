import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEspecialidades {

	Scanner sc = new Scanner(System.in);
	 Especialidades espec = new Especialidades();
	 int escolhaEspec = 0;
	 Menu mn = new Menu();
	 List<Especialidades> listaespc;

	 public ListaEspecialidades(){
		 listaespc = new ArrayList<>();
		 listaespc.add(new Especialidades("01","Dermatologia"));
		 listaespc.add(new Especialidades("02","Cardiologia"));
		 listaespc.add(new Especialidades("03","Clinica Geral"));
		 listaespc.add(new Especialidades("04","Ortopedia"));
		 listaespc.add(new Especialidades("05","Oftalmologia"));
		 
	 }
}