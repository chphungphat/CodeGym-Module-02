package builder;

import entity.BoughtGame;
import entity.Game;

import java.time.LocalDate;

public class BoughGameBuilder implements IBoughGameBuilder {
    private Game game;
    private int playedTime;
    private LocalDate lastPlayedTime;

    @Override
    public IBoughGameBuilder game(Game game) {
        this.game = game;
        return this;
    }

    @Override
    public IBoughGameBuilder playedTime(int playedTime) {
        this.playedTime = playedTime;
        return this;
    }

    @Override
    public IBoughGameBuilder lastPlayedTime(LocalDate lastPlayedTime) {
        this.lastPlayedTime = lastPlayedTime;
        return this;
    }

    @Override
    public BoughtGame build() {
        return new BoughtGame(game, playedTime, lastPlayedTime);
    }
}
