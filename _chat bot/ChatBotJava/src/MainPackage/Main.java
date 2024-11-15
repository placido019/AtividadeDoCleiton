package MainPackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean verificacao = true;

        ChatBot bot = new ChatBot();
        System.out.println("------ Seja bem-vindo ao ChatBot V1.0 -------");
        System.out.println("ChatBot: " + bot.apresentacao());

        while (verificacao) {
            System.out.print("Voce: ");
            String input = sc.nextLine();

            if (input == null || input.isEmpty()) {
                System.out.println("ChatBot: " + bot.naoEntendi());
            }

            System.out.println("-------- ChatBot v1.0 --------");

            if (bot.saudacao(input) != null) {
                System.out.println("ChatBot: " + bot.saudacao(input));
            } else if (bot.nome(input) != null) {
                System.out.println("ChatBot: " + bot.nome(input));
            } else if (bot.comoEsta(input) != null) {
                System.out.println("ChatBot: " + bot.comoEsta(input));
            } else {
                System.out.println("ChatBot: " + bot.naoEntendi());
            }

            if (input.equalsIgnoreCase("sair")) {
                System.out.println("Obrigado por usar o ChatBot, até logo!");
                verificacao = false;
            }
        }
        sc.close();
    }
}
