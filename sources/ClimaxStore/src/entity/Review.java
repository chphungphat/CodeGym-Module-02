package entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;


public class Review {
    private int userReviewID;
    private int gameID;
    private String review;
    private double rating;
    private LocalDate reviewDate;

    public Review() {}

    public Review(int userReviewID, int gameID, String review, double rating, LocalDate reviewDate) {
        this.userReviewID = userReviewID;
        this.gameID = gameID;
        this.review = review;
        this.rating = rating;
        this.reviewDate = reviewDate;
    }

    public int getUserReviewID() {
        return userReviewID;
    }

    public void setUserReviewID(int userReviewID) {
        this.userReviewID = userReviewID;
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public LocalDate getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate;
    }

    @Override
    public String toString() {
        return review + "\n"
                + "Rating: " + rating + "/10" + "\n"
                + "Review Date: " + reviewDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
