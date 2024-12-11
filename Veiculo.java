import java.util.Scanner;

public class Veiculo {

	private String marca;
	private String modelo;
	private String ano;
	private String cor;
	private double gasolina;
	private String select;

	public Veiculo(String marca, String modelo, String ano, String cor, double gasolina) {
		this.marca=marca;
		this.modelo=modelo;
		this.ano=ano;
		this.cor=cor;
		this.gasolina=gasolina;
	}

	public void setMarca(Scanner sc) {
		System.out.println("\nInforme a marca do veiculo: ");
		this.marca=sc.nextLine();
	}

	public void setModelo(Scanner sc) {
		System.out.println("\nInforme o modelo do veiculo: ");
		this.modelo=sc.nextLine();
	}

	public void setAno(Scanner sc) {
		System.out.println("\nInforme o ano do carro: ");
		this.ano=sc.nextLine();
	}

	public void setCor(Scanner sc) {
		System.out.println("\nInforme a cor do veiculo: ");
		this.cor=sc.nextLine();
	}

	public String setTipoGasolina(Scanner sc) {

		do {

			System.out.println("\nSelecione (GC) para comum ou (GA) para aditivada: ");
			select=sc.nextLine().toLowerCase();

			if(!select.equals("gc") && !select.equals ("ga")) {
				System.out.print("\nFavor selecionar uma opcao valida!\nAperte ENTER para retornar!");
				sc.nextLine();
			}

			else {
				System.out.print("\nOpcao valida!\nAperte ENTER para prosseguir!");
				sc.nextLine();
			}

		} while(!select.equals("gc") && !select.equals ("ga"));

		return select;
	}

	public String getSelect() {
		return select;
	}

	public double setGasolina(Scanner sc) {

		do {

			System.out.println("\nInforme quantos litros de gasolina deseja: ");
			this.gasolina=sc.nextDouble();
			if (this.gasolina<=0) {
				System.out.println("\nFavor informar uma quantidade maior que zero!");
			}
			else
			{
				System.out.println("\nAbastecendo...");
			}

		} while(this.gasolina<=0);
		return this.gasolina;
	}

	public double verGasolina(Veiculo carro) {

		String x1=getSelect();

		double total_Gasto;

		if(x1.equals("ga")) {
			total_Gasto=carro.getGasolina()*5.8;
		}
		else {
			total_Gasto=carro.getGasolina()*4.2;
		}

		System.out.println("Total abastecido: "+carro.getGasolina()+" litros\nGasto com gasolina: R$"+ String.format("%.2f",total_Gasto));
		return total_Gasto;
	}

	public String getMarca() {
		return this.marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public String getAno() {
		return this.ano;
	}

	public String getCor() {
		return this.cor;
	}

	public double getGasolina() {
		return this.gasolina;
	}

	public void mostrarInfosVeiculos(Veiculo carro) {
		System.out.print("\n\nRelatorio do carro:\n");
		System.out.print("Marca: "+carro.getMarca());
		System.out.print("\nModelo: "+carro.getModelo());
		System.out.print("\nAno: "+carro.getAno());
		System.out.print("\nCor: "+carro.getCor());
	}

	public static void exibirValores() {
		System.out.println("\n\nValores da Gasolina\nComum: R$4,20\nGasolina Aditivada: R$5,80");
	}

}
