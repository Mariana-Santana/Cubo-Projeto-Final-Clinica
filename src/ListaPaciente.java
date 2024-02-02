import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaPaciente {

	Scanner sc = new Scanner(System.in);
	 Paciente pcte = new Paciente();
	 int escolhaPcte = 0;
	 Menu mn = new Menu();
	 List<Paciente> listapaciente;

	 public ListaPaciente(){
		 listapaciente = new ArrayList<>();
		 listapaciente.add(new Paciente("Caetano Veloso", "82763411010", "07/08/1942"));
		 listapaciente.add(new Paciente("Wanessa da Mata", "43115751060", "10/02/1976"));
		 listapaciente.add(new Paciente("Maria Bethânia", "34957489033", "18/06/1946"));
		 listapaciente.add(new Paciente("Gilberto Gil", "44075242005", "26/06/1942"));
		 listapaciente.add(new Paciente("Marisa Monte", "68134865003", "01/07/1966"));
		 listapaciente.add(new Paciente("Otto Ferreira", "15805309076", "28/06/1968"));
	 }
}
	 

