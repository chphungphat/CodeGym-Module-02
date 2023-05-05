package entity;

import java.time.LocalDate;
import java.util.List;

public class BoughtGame extends Game{
    private int playedTime;

    public BoughtGame(int playedTime) {
        this.playedTime = playedTime;
    }

    public BoughtGame(int id, String name, long price, String developer, LocalDate releaseDate, List<String> gametags, int playedTime) {
        super(id, name, price, developer, releaseDate, gametags);
        this.playedTime = playedTime;
    }

    public BoughtGame(int id, String name, long price, String developer, LocalDate releaseDate, List<String> gametags) {
        super(id, name, price, developer, releaseDate, gametags);
        this.playedTime = 0;
    }

    public int getPlayedTime() {
        return playedTime;
    }

    public void setPlayedTime(int playedTime) {
        this.playedTime = playedTime;
    }

    @Override
    public String toString() {
        return super.toString() + "Time played: " + playedTime + " hours" + "\n";
    }
}
