package builder;

import entity.BoughtGame;
import entity.Game;

import java.time.LocalDate;

public class BoughtGameBuilder implements IBoughtGameBuilder {
    private Game game;
    private int playedTime;
    private LocalDate lastPlayedTime;

    private static final BoughtGameBuilder boughtGameBuilder = new BoughtGameBuilder();

    private BoughtGameBuilder() {}

    public static BoughtGameBuilder getInstance() {
        return boughtGameBuilder;
    }

    @Override
    public IBoughtGameBuilder game(Game game) {
        this.game = game;
        return this;
    }

    @Override
    public IBoughtGameBuilder playedTime(int playedTime) {
        this.playedTime = playedTime;
        return this;
    }

    @Override
    public IBoughtGameBuilder lastPlayedTime(LocalDate lastPlayedTime) {
        this.lastPlayedTime = lastPlayedTime;
        return this;
    }

    @Override
    public BoughtGame build() {
        return new BoughtGame(game, playedTime, lastPlayedTime);
    }
}
