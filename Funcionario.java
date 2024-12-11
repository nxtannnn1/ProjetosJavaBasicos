import java.util.Scanner;

public class Funcionario extends Pessoa {

	private String id;
	private String cargo;


	public Funcionario(String nome, String rg, String sexo, String cpf, int idade, String id, String cargo) {
		super(nome,rg,sexo,cpf,idade);
		this.id=id;
		this.cargo=cargo;
	}

	public void setNome(Scanner sc) {
		System.out.println("Informe seu nome");
		this.nome=sc.nextLine();
	}

	public void setRg(Scanner sc) {
		System.out.println("\nInforme seu rg");
		this.rg=sc.nextLine();
	}

	public void setIdade(Scanner sc) {
		System.out.println("\nInforme sua idade");
		this.idade=sc.nextInt();
		sc.nextLine();

	}

	public void setCPF(Scanner sc) {
		System.out.println("\nInforme seu cpf");
		this.cpf=sc.nextLine();
	}


}
