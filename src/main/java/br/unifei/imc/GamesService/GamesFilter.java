package br.unifei.imc.GamesService;

import br.unifei.imc.model.Games;

import java.util.List;
import java.util.stream.Collectors;

public class GamesFilter {
    public List<Games> filterGamesByPlatform(List<Games> games, Platforms platform) {
        return games.stream().filter(game -> game.getPlatform().equals(platform.toString())).collect(Collectors.toList());
    }

    public List<Games> filterGamesByPublishers(List<Games> games, Publishers publisher) {
        return games.stream().filter(game -> game.getPublisher().equals(publisher.toString())).collect(Collectors.toList());
    }
}
