package br.unifei.imc;

import java.util.List;
import br.unifei.imc.model.Games;
import br.unifei.imc.CSVService.CSVReader;
import br.unifei.imc.GamesService.Platforms;
import br.unifei.imc.GamesService.Publishers;
import br.unifei.imc.GamesService.GamesFilter;

public class Main {
    public static void main(String[] args) {
        GamesFilter gamesService = new GamesFilter();
        List<Games> games = CSVReader.readCSV("src/main/java/br/unifei/imc/games.csv");

        List<Games> gamesByPlatform = gamesService.filterGamesByPlatform(games, Platforms.N64);
        List<Games> gamesByPublishers = gamesService.filterGamesByPublishers(games, Publishers.Ubisoft);

        System.out.println("Platform:");
        for (Games game: gamesByPlatform) {
            System.out.println(String.format("%s - %s - %s", game.getName(), game.getPlatform(), game.getYear()));
        }

        System.out.println("\nPublishers:");
        for (Games game: gamesByPublishers) {
            System.out.println(String.format("%s - %s - %s", game.getName(), game.getPublisher(), game.getYear()));
        }
    }
}
