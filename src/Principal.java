import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws ParseException {
		Scanner acesso = new Scanner(System.in);
        // Declarando usuário e senha de acesso
        String usuariologin = "teste";
        String senhalogin = "123";

        System.out.print("Digite o nome do usuário: ");
        String usuariodigitado = acesso.nextLine();

        System.out.print("Inserir senha: ");
        String senhadigitada = acesso.nextLine();

        //Variavel do menu e opções
        int opcao = 0;
        
        if (usuariodigitado.equals(usuariologin) && senhadigitada.equals(senhalogin)){
            System.out.println("Bem-vindo, usuário logado com sucesso!!!");
            
            ListaPaciente lista = new ListaPaciente();
            ListaEspecialidades  listaesp = new ListaEspecialidades(); 
            List<Consulta> consultas = new ArrayList<>();
        
        do {
        	System.out.println("\n################ MENU INICIAL ################");
            System.out.println("Digite 1 - Pacientes");
            System.out.println("Digite 2 - Especialidades");
            System.out.println("Digite 3 - Agendar consulta");
            System.out.println("Digite 4 - Pacientes Agendados");
            System.out.println("Digite 0 - Para sair!!");
            
            opcao = acesso.nextInt();
            
            switch (opcao) {
            
            case 1:
            	for (Paciente pac : lista.listapaciente){
           		 System.out.println("Paciente: " + pac.toString());
            	
            }
            	break;
            
            case 2: 
            	for (Especialidades esp : listaesp.listaespc)
           		 System.out.println("Especialidade: " + esp.toString());
            	
            	break;
            	
            case 3:
            	Menu menu = new Menu();
        		menu.agendarConsulta(lista, listaesp, consultas);
        		break;
        		
            case 4:
            	System.out.println(consultas);
            
        		break;
        		
            case 0:
            	System.out.println("Saindo do programa. Até logo!!");
            	break;
            	
            default:
            	System.out.println("Opção invalida!"); 
            	break;
            	
            }
            	  	
        } while (opcao != 0);
        	
        } else {
            System.out.println("Usuário e ou senha inválidos. Acesso negado.");
            acesso.close();
            return;
            
        } while (true);
        
       
	}
}

            