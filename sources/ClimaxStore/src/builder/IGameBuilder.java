package builder;

import entity.Game;
import entity.Review;

import java.time.LocalDate;
import java.util.List;

public interface IGameBuilder {
    IGameBuilder id(int id);
    IGameBuilder name(String name);
    IGameBuilder price(long price);
    IGameBuilder developer(String developer);
    IGameBuilder releaseDate(LocalDate releaseDate);
    IGameBuilder gametags(List<String> gametags);
    IGameBuilder reviewList(List<Review> reviewList);
    Game build();
}