package br.com.pessoaserie.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class LeitorArquivo {
    static final String PATH_BASICO = "./temp/";
    static final String EXTENSAO = ".txt";

    private static final Logger logger = Logger.getLogger(LeitorArquivo.class.getName());

    static {
        
        logger.setLevel(java.util.logging.Level.WARNING);
    }

    public static List<String> lerArquivo(String caminhoArquivo) {
        List<String> linhas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                linhas.add(linha);
            }
            
            logger.info("Arquivo lido com sucesso: " + caminhoArquivo);
        } catch (IOException e) {
            
            logger.severe("Erro ao ler o arquivo: " + e.getMessage());
        }
        return linhas;
    }

    public static void leitor(String string) {
       
    }
}
