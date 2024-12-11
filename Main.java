import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Bem-vindo ao Posto P5!");

		//Inicializacao de objetos e seus atributos
		Pessoa pessoa1 = new Pessoa("","","","",0);
		Veiculo carro1 = new Veiculo("","","","", 0);

		//Metodos Setters

		pessoa1.setNome(sc);
		pessoa1.setRg(sc);
		pessoa1.setIdade(sc);
		pessoa1.setSexo(sc);
		pessoa1.setCPF(sc);

		carro1.setMarca(sc);
		carro1.setModelo(sc);
		carro1.setAno(sc);
		carro1.setCor(sc);

		//Metodos Setters

		//Metodos Getters

		pessoa1.mostrarInfosPessoais(pessoa1);
		carro1.mostrarInfosVeiculos(carro1);

		//Metodos Getters

		carro1.exibirValores();
		carro1.setTipoGasolina(sc);
		carro1.setGasolina(sc);
		carro1.verGasolina(carro1);

	}

}
