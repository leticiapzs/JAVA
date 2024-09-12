package br.com.poo.lista_dois;

import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Estoque {
    private static final Logger logger = Logger.getLogger(Estoque.class.getName());

    // Dados simulados do banco de dados
    private static final String[] produtos = {"Produto A", "Produto B", "Produto C", "Produto D"};
    private static final int[] estoque = {10, 0, 5, 0}; // Quantidade em estoque

    static {
        // Configura o Logger
        ConsoleHandler consoleHandler = new ConsoleHandler();
        // Define um formatter personalizado para remover o INFO e a data/hora
        consoleHandler.setFormatter(new SimpleFormatter() {
            @Override
            public String format(java.util.logging.LogRecord record) {
                return record.getMessage() + System.lineSeparator();
            }
        });
        logger.addHandler(consoleHandler);
        logger.setLevel(Level.ALL); // Configura o nível de log para ALL para garantir que todas as mensagens sejam exibidas

        // Remove os handlers padrão para não exibir data e hora
        for (java.util.logging.Handler handler : Logger.getLogger("").getHandlers()) {
            Logger.getLogger("").removeHandler(handler);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            logger.info("Menu:");
            logger.info("1. Listar Produtos com estoque");
            logger.info("2. Listar Produtos sem estoque");
            logger.info("3. Sair");
            logger.info("Escolha uma opção (1, 2, 3):");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    listarProdutosComEstoque();
                    break;
                case 2:
                    listarProdutosSemEstoque();
                    break;
                case 3:
                    logger.info("Deseja realmente sair? (Sim/Não)");
                    String resposta = scanner.nextLine();
                    if (resposta.equalsIgnoreCase("Sim")) {
                        sair = true;
                        logger.info("Saindo do programa.");
                    }
                    break;
                default:
                    logger.info("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void listarProdutosComEstoque() {
        logger.info("Produtos com estoque:");
        for (int i = 0; i < produtos.length; i++) {
            if (estoque[i] > 0) {
                logger.info(produtos[i] + " - Quantidade: " + estoque[i]);
            }
        }
    }

    private static void listarProdutosSemEstoque() {
        logger.info("Produtos sem estoque:");
        for (int i = 0; i < produtos.length; i++) {
            if (estoque[i] == 0) {
                logger.info(produtos[i]);
            }
        }
    }
}
