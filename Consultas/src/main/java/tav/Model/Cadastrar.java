package tav.Model;

import java.util.Date;
import java.util.Scanner;


public class Cadastrar {

	public static void main(String[] args) {
		int op;
		String nome = null, cpf = null, crm = null, siglaEstado = null, especialidade = null, endereco = null, sexo = null, funcao = null, setor = null, coren = null;
		int idade = 0, numTrabalho = 0, dia, hora;
		Scanner sc = new Scanner(System.in);

		Paciente p = new Paciente(nome, cpf, endereco, sexo, idade); // Array que armazena os pacientes
		Medico m = new Medico(nome, cpf, endereco, sexo, idade, crm, siglaEstado, especialidade); // Array que armazena os médicos
		
		do {
		System.out.println("-------------------------");
		System.out.println("MENU PRINCIPAL");
		System.out.println("-------------------------");
		System.out.println("1 - CADASTRAR PACIENTE");
		System.out.println("2 - CADASTRAR MÉDICO");
		System.out.println("3 - AGENDAR (1- CONSULTA, 2- EXAME, 3-INTERNAÇÃO");
		System.out.println("0 - SAIR");
		System.out.println("Digite sua opção: ");
		op = sc.nextInt();
		
		switch (op) {
		case 1:
			System.out.println("Digite o nome: ");
			nome = sc.next();
			p= new Paciente(nome, cpf, endereco, sexo, idade);
			p.setNome(nome);
			sc.nextLine();// Limpar o Buffer do Teclado
			

			System.out.println("Digite o CPF do paciente: ");
			cpf = sc.next();
			p.setCpf(cpf);
			sc.nextLine();

			System.out.println("Digite o endereço do paciente: ");
			endereco = sc.next();
			p.setEndereco(endereco);
			sc.nextLine();

			System.out.println("Qual o sexo: ");
			sexo = sc.next();
			p.setSexo(sexo);
			sc.nextLine();

			System.out.println("Qual a idade: ");
			idade = sc.nextInt();
			p.setIdade(idade);
			sc.nextLine();
			
			System.out.println(p);
			
			break;
		case 2:
			System.out.println("Digite o nome: ");
			nome = sc.next();
			m= new Medico(nome, cpf, crm, endereco, idade, sexo, siglaEstado, especialidade);
			m.setNome(nome);
			sc.nextLine();

			System.out.println("Digite o CPF do médico(a): ");
			cpf = sc.next();
			m.setCpf(cpf);
			sc.nextLine();
			
			System.out.println("Digite o CRM do médico(a): ");
			crm = sc.next();
			m.setCrm(crm);
			sc.nextLine();
			
			System.out.println("Digite o endereço do médico(a): ");
			endereco = sc.next();
			m.setEndereco(endereco);
			sc.nextLine();
			
			System.out.println("Qual o sexo: ");
			sexo = sc.next();
			m.setSexo(sexo);
			sc.nextLine();
			
			System.out.println("Qual a idade: ");
			idade = sc.nextInt();
			m.setIdade(idade);
			sc.nextLine();
			
			System.out.println("Digite a sigla do CRM: ");
			siglaEstado = sc.next();
			m.setSiglaEstado(siglaEstado.toUpperCase());
			sc.nextLine();
			
			System.out.println("Digite a Especialidade do médico(a): ");
			especialidade = sc.next();
			m.setEspecialidade(especialidade);
			sc.nextLine();
			
			System.out.println(m);
			
			break;
		case 3:
			int tipo;
			System.out.println("Tipo de Agendamento: ");
			tipo = sc.nextInt();
			
			switch (tipo) {
			case 1: // tipo consulta
				System.out.println("Digite o nome do Paciente: ");
				nome = sc.next();
				p.setNome(nome);
				sc.nextLine();// Limpar o Buffer do Teclado
				
				System.out.println("Digite o nome do Médico: ");
				nome = sc.next();
				m = new Medico(nome, cpf, crm, endereco, idade, sexo, siglaEstado, especialidade);
				m.setNome(nome);
				sc.nextLine();
				
				System.out.println("Digite a Especialidade do médico(a): ");
				especialidade = sc.next();
				m.setEspecialidade(especialidade);
				sc.nextLine();
				
				System.out.println("Data da Consulta: ");
				dia = sc.nextInt();
				
				System.out.println("Hora da Consulta: ");
				hora = sc.nextInt();
				
				Agendamento consulta = new Agendamento();
				consulta.agendaConsulta(p, m, dia, hora);
				break;
			
			case 2: // tipo exame
				System.out.println("Digite o nome do Paciente: ");
				nome = sc.next();
				p.setNome(nome);
				sc.nextLine();// Limpar o Buffer do Teclado
				
				System.out.println("Data do Exame: ");
				dia = sc.nextInt();
				
				System.out.println("Hora do Exame: ");
				hora = sc.nextInt();
				
				Agendamento exame = new Agendamento();
				exame.agendaExame(p, dia, hora);
				break;
			
			case 3: // tipo internação
				System.out.println("Digite o nome do Paciente: ");
				nome = sc.next();
				p.setNome(nome);
				sc.nextLine();// Limpar o Buffer do Teclado
				
				System.out.println("Digite o nome do Médico: ");
				nome = sc.next();
				m= new Medico(nome, cpf, crm, endereco, idade, sexo, siglaEstado, especialidade);
				m.setNome(nome);
				sc.nextLine();
				
				System.out.println("Data da Internação: ");
				dia = sc.nextInt();
				
				System.out.println("Hora da Internação: ");
				hora = sc.nextInt();
				
				Agendamento internacao = new Agendamento();
				internacao.agendaInternacao(p, m, dia, hora);
				break;
			}
			case 0:
				System.out.println("Saindo do sistema!");
				break;
			default:
				System.out.println("Insira um valor valido");
		}
		} while (op !=0);
		sc.close();
		
		}
}
	



