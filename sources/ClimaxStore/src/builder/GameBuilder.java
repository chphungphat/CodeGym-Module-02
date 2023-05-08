package builder;

import entity.Game;
import entity.Review;

import java.time.LocalDate;
import java.util.List;

public class GameBuilder implements IGameBuilder{
    protected int id;
    protected String name;
    protected long price;
    protected String developer;
    protected LocalDate releaseDate;
    protected List<String> gametags;
    protected List<Review> reviewList;

    @Override
    public IGameBuilder id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public IGameBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public IGameBuilder price(long price) {
        this.price = price;
        return this;
    }

    @Override
    public IGameBuilder developer(String developer) {
        this.developer = developer;
        return this;
    }

    @Override
    public IGameBuilder releaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    @Override
    public IGameBuilder gametags(List<String> gametags) {
        this.gametags = gametags;
        return this;
    }

    @Override
    public IGameBuilder reviewList(List<Review> reviewList) {
        this.reviewList = reviewList;
        return this;
    }

    @Override
    public Game build() {
        return new Game(id, name, price, developer, releaseDate, gametags, reviewList);
    }

}