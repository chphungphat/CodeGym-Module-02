package entity;

import java.time.LocalDate;
import java.util.List;

public class Game {
    private static int count = 1;

    protected int id;
    protected String name;
    protected long price;
    protected String developer;
    protected LocalDate releaseDate;
    protected List<String> gametags;
    protected List<Review> reviewList;

    public Game() {};

    public Game(String name, long price, String developer, LocalDate releaseDate, List<String> gametags, List<Review> reviewList) {
        this.id = count++;
        this.name = name;
        this.price = price;
        this.developer = developer;
        this.releaseDate = releaseDate;
        this.gametags = gametags;
        this.reviewList = reviewList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<String> getGametags() {
        return gametags;
    }

    public List<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<Review> reviewList) {
        this.reviewList = reviewList;
    }

    public String printGametags() {
        String text = "";
        for (String element : gametags) {
            text += element + " ";
        }
        return text;
    }

    public void setGametags(List<String> gametags) {
        this.gametags = gametags;
    }

    @Override
    public String toString() {
        return id + " " + name + "\n"
                + "Price: " + price + " " + "Developer: " + developer + "\n"
                + "Release Date: " + releaseDate + "\n"
                + "Gametags: " + printGametags() + "\n";
    }

    public String[] toArray() {
        return new String[] {}
    }
}
