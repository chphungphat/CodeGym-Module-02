package entity;

import java.time.LocalDate;
import java.util.List;

public class BoughtGame extends Game{
    private int playedTime;
    private LocalDate lastPlayedTime;

    public BoughtGame() {}

    public BoughtGame(int playedTime, LocalDate lastPlayedTime) {
        this.playedTime = playedTime;
        this.lastPlayedTime = lastPlayedTime;
    }

    public BoughtGame(int id, String name, long price, String developer, LocalDate releaseDate, List<String> gametags, List<Review> reviewList, int playedTime, LocalDate lastPlayedTime) {
        super(id, name, price, developer, releaseDate, gametags, reviewList);
        this.playedTime = playedTime;
        this.lastPlayedTime = lastPlayedTime;
    }

    public BoughtGame(Game game, int playedTime, LocalDate lastPlayedTime) {
        super(game.getId(), game.getName(), game.getPrice(),
                game.getDeveloper(), game.getReleaseDate(), game.getGametags(),
                game.getReviewList());
        this.playedTime = playedTime;
        this.lastPlayedTime = lastPlayedTime;
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
