import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Menu {
	
	public void agendarConsulta(ListaPaciente listaPacientes, ListaEspecialidades listaEspecialidades, List<Consulta> consultas) throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione um paciente:");
        for (Paciente pac : listaPacientes.listapaciente) {
            System.out.println(listaPacientes.listapaciente.indexOf(pac) + 1 + ". " + pac.getNmPaciente());
        }
        int indicePaciente = sc.nextInt() - 1;

        System.out.println("Selecione uma especialidade:");
        for (Especialidades esp : listaEspecialidades.listaespc) {
            System.out.println(listaEspecialidades.listaespc.indexOf(esp) + 1 + ". " + esp.getNmEspecialidade());
        }
        int indiceEspecialidade = sc.nextInt() - 1;
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Digite a data desejada");
        Date dt = formato.parse(sc.next());
       
      
        // Adiciona a consulta à lista de consultas
        Consulta consulta = new Consulta(
                listaPacientes.listapaciente.get(indicePaciente),
                listaEspecialidades.listaespc.get(indiceEspecialidade),
                dt);
        
        consulta.setData(dt);
        
        consultas.add(consulta);

        System.out.println("Consulta agendada com sucesso para o paciente " +
                consulta.getNmPaciente().getNmPaciente() +
                " na especialidade " + consulta.getNmEspecialidade().getNmEspecialidade() +
                " para a data " + dt);
    }
}
