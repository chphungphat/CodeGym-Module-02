package builder;

import entity.BoughtGame;
import entity.Game;

import java.time.LocalDate;

public interface IBoughGameBuilder {
    IBoughGameBuilder game(Game game);
    IBoughGameBuilder playedTime(int playedTime);
    IBoughGameBuilder lastPlayedTime(LocalDate lastPlayedTime);
    BoughtGame build();
}
