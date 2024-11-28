package CarteiraDigital;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UniparCoins uni = new UniparCoins();

        uni.menu();

        boolean loop = true;
        
        while (loop) {
            System.out.print("Digite sua decisão: ");
            int decisao = sc.nextInt(); 

            if (decisao == 1) {
             uni.adicionarSaldo(null);
            } else if (decisao == 2) {
             uni.realizarPagamento(null);
            } else if (decisao == 3) {
             System.out.println("Seu saldo é de: " + uni.verificarSaldo());
            } else if (decisao == 4) {
                System.out.println("---- Obrigado por usar a nossa carteira digital Unipar Coins! ----");
                loop = false; // Sai do loop
                
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        sc.close();
    }
}
