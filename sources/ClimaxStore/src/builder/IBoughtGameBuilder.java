package builder;

import entity.BoughtGame;
import entity.Game;

import java.time.LocalDate;

public interface IBoughtGameBuilder {
    IBoughtGameBuilder game(Game game);
    IBoughtGameBuilder playedTime(int playedTime);
    IBoughtGameBuilder lastPlayedTime(LocalDate lastPlayedTime);
    BoughtGame build();
}
