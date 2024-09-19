package br.com.pessoaserie.relatorio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Logger;

import br.com.pessoaserie.Pessoa;
import br.com.pessoaserie.Serie;

public class Relatorio {
    private static final Logger logger = Logger.getLogger(Relatorio.class.getName());

    static {
        
        logger.setLevel(java.util.logging.Level.WARNING);
    }

    public static void gerarRelatorioPessoas(List<Pessoa> pessoas) {
        logger.info("Gerando relatório de pessoas..."); 
        System.out.println("*******************************");
        System.out.println(" Relatório de Pessoas ");
        System.out.println("*******************************");
        for (Pessoa pessoa : pessoas) {
            System.out.println("ID: " + pessoa.getId());
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade() + " anos");
            System.out.println("Série (ID): " + pessoa.getSerieId());
            System.out.println();
        }
        System.out.println("*******************************");
        System.out.println(" Relatório Finalizado");
        System.out.println("*******************************");
    }

    public static void gerarRelatorioSeries(List<Serie> series) {
        logger.info("Gerando relatório de séries..."); 
        System.out.println("*******************************");
        System.out.println(" Relatório de Séries ");
        System.out.println("*******************************");
        for (Serie serie : series) {
            System.out.println("ID: " + serie.getId());
            System.out.println("Nome: " + serie.getNome());
            System.out.println("Gênero: " + serie.getGenero());
            System.out.println("Temporadas: " + serie.getTemporadas());
            System.out.println();
        }
        System.out.println("*******************************");
        System.out.println(" Relatório Finalizado");
        System.out.println("*******************************");
    }

    public static void gerarRelatorioEmArquivo(List<Pessoa> pessoas, List<Serie> series) {
        Path diretorio = Paths.get("temp");
        if (Files.notExists(diretorio)) {
            try {
                Files.createDirectory(diretorio);
                logger.info("Diretório 'temp' criado.");
            } catch (IOException e) {
                logger.severe("Erro ao criar o diretório 'temp': " + e.getMessage());
                return;
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("temp/relatorio.txt"))) {
            writer.write("*******************************\n");
            writer.write(" Relatório de Pessoas \n");
            writer.write("*******************************\n");
            for (Pessoa pessoa : pessoas) {
                writer.write("ID: " + pessoa.getId() + "\n");
                writer.write("Nome: " + pessoa.getNome() + "\n");
                writer.write("Idade: " + pessoa.getIdade() + " anos\n");
                writer.write("Série (ID): " + pessoa.getSerieId() + "\n");
                writer.write("\n");
            }

            writer.write("*******************************\n");
            writer.write(" Relatório de Séries \n");
            writer.write("*******************************\n");
            for (Serie serie : series) {
                writer.write("ID: " + serie.getId() + "\n");
                writer.write("Nome: " + serie.getNome() + "\n");
                writer.write("Gênero: " + serie.getGenero() + "\n");
                writer.write("Temporadas: " + serie.getTemporadas() + "\n");
                writer.write("\n");
            }

            writer.write("*******************************\n");
            writer.write(" Relatório Finalizado\n");
            writer.write("*******************************\n");

            System.out.println("Relatório gerado e salvo em 'temp/relatorio.txt'.");
            logger.info("Relatório gerado e salvo em 'temp/relatorio.txt'.");
        } catch (IOException e) {
            logger.severe("Erro ao gerar o relatório: " + e.getMessage());
        }
    }
}
