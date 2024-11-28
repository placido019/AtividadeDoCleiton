package CarteiraDigital;

public class UniparCoins {
	Double saldo;

	//Construtor
	public UniparCoins() {
		this.saldo = 0.0;
	}
	
	public void adicionarSaldo(Double valor) {
		System.out.println("Adicionando " + valor + " UniparCoins a sua carteira.");
		saldo += valor;
	}
	
	public void realizarPagamento(Double valor) {
		System.out.println("Realizando pagamento de: " + valor);
		saldo -= valor;
	}
	
	public Double verificarSaldo() {
		return saldo;
	}
	
	public Double historicoTransacoes() {
		return null; // Trabalhar na lista depois
	}
	
	public void menu() {
        System.out.println("Escolha uma opção: ");
		System.out.println("1 - Adicionar saldo");
		System.out.println("2 - Realizar pagamento");
		System.out.println("3 - Verificar saldo");
		System.out.println("4 - Sair");
	}
}
