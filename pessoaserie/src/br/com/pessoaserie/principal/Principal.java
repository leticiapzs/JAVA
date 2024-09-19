package br.com.pessoaserie.principal;

import br.com.pessoaserie.Pessoa;
import br.com.pessoaserie.Serie;
import br.com.pessoaserie.io.LeitorArquivo;
import br.com.pessoaserie.relatorio.Relatorio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {
    private static final Logger logger = Logger.getLogger(Principal.class.getName());
    private static List<Pessoa> pessoas = new ArrayList<Pessoa>();
    private static List<Serie> series = new ArrayList<Serie>();
    @SuppressWarnings("unused")
	private static final String FILE_NAME = "temp/pessoa_serie.txt";
    @SuppressWarnings("unused")
	private static final String RELATORIO_FILE = "temp/relatorio.txt";

    public Principal() {
    }

    public static void main(String[] args) {
        logger.setLevel(Level.WARNING);
        Scanner scanner = new Scanner(System.in);
        carregarDados();
        boolean running = true;

        while(running) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    Relatorio.gerarRelatorioPessoas(pessoas);
                    break;
                case 2:
                    Relatorio.gerarRelatorioSeries(series);
                    break;
                case 3:
                    Relatorio.gerarRelatorioEmArquivo(pessoas, series);
                    exibirRelatorio("temp/relatorio.txt");
                    break;
                case 4:
                    logger.info("Encerrando o programa.");
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("Menu Principal:");
        System.out.println("1. Exibir Relatório de Pessoas");
        System.out.println("2. Exibir Relatório de Séries");
        System.out.println("3. Imprimir Relatório");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void carregarDados() {
        List<String> linhas = LeitorArquivo.lerArquivo("temp/pessoa_serie.txt");
        Iterator<String> var2 = linhas.iterator();

        while(var2.hasNext()) {
            String linha = (String)var2.next();
            String[] dados = linha.split(",");
            if (dados.length < 5) {
                System.out.println("Linha com formato incorreto: " + linha);
            } else if (dados[0].equals("Pessoa")) {
                pessoas.add(new Pessoa(Integer.parseInt(dados[1]), dados[2], Integer.parseInt(dados[3]), Integer.parseInt(dados[4])));
            } else if (dados[0].equals("Serie")) {
                series.add(new Serie(Integer.parseInt(dados[1]), dados[2], dados[3], Integer.parseInt(dados[4])));
            }
        }

        logger.info("Dados carregados do arquivo.");
    }

    private static void exibirRelatorio(String caminhoArquivo) {
        List<String> linhas = LeitorArquivo.lerArquivo(caminhoArquivo);
        Iterator<String> var3 = linhas.iterator();

        while(var3.hasNext()) {
            String linha = (String)var3.next();
            System.out.println(linha);
        }

    }
}