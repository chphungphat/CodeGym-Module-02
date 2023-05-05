package entity;

import java.util.List;


public class Review {
    private String review;
    private double rating;
    private int userReviewID;

    public Review() {}

    public Review(String review, double rating, int userReviewID) {
        this.review = review;
        this.rating = rating;
        this.userReviewID = userReviewID;
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

    public int getUserReviewID() {
        return userReviewID;
    }

    public void setUserReviewID(int userReviewID) {
        this.userReviewID = userReviewID;
    }

    public String findUserReview(List<User> userList) {
        for (User element : userList) {
            if (element.getId() == userReviewID) {
                return element.getName();
            }
        }
        return "User not found";
    }

//    @Override
//    public String toString() {
//        return review + "\n"
//                + rating + "\n"
//                + findUserReview(userList) + "\n";
//    }
}
