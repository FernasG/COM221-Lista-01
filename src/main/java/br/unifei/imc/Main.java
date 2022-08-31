package br.unifei.imc;

import java.util.List;
import br.unifei.imc.CSVService.CSVReader;
import br.unifei.imc.model.Games;

public class Main {
    public static void main(String[] args) {
        List<Games> games = CSVReader.readCSV("src/main/java/br/unifei/imc/games.csv");

        System.out.println(games);
    }
}
