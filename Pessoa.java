import java.util.Scanner;

public class Pessoa {

	private String nome;
	private String rg;
	private String sexo;
	private String cpf;
	private int idade;

	public Pessoa (String nome, String rg, String sexo, String cpf, int idade) {
		this.nome=nome;
		this.rg=rg;
		this.sexo=sexo;
		this.cpf=cpf;
		this.idade=idade;
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

	public void setSexo(Scanner sc) {

		do {

			System.out.println("\nInforme seu sexo!\n(H)-Homem ou (M)-Mulher\nInforme aqui: ");
			this.sexo=sc.nextLine().toUpperCase();

			if(!this.sexo.equals("H") && !this.sexo.equals ("M")) {
				System.out.print("\nFavor selecionar uma opcao valida!\nAperte ENTER para retornar!");
				sc.nextLine();
			}

			this.sexo=this.sexo.toLowerCase();
		} while(!this.sexo.equals("h") && !this.sexo.equals ("m"));

	}

	public String getSexo() {
		return this.sexo.toUpperCase();
	}

	public String getCPF() {
		return this.cpf;
	}

	public String getRG() {
		return this.rg;
	}

	public String getNome() {
		return this.nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void mostrarInfosPessoais(Pessoa pessoa) {
		System.out.print("\nRelatorio da pessoa:\n");
		System.out.print("Nome: "+pessoa.getNome());
		System.out.print("\nRG: "+pessoa.getRG());
		System.out.print("\nIdade: "+pessoa.getIdade());
		System.out.print("\nSexo: "+pessoa.getSexo());
		System.out.print("\nCPF: "+pessoa.getCPF());
	}

}
