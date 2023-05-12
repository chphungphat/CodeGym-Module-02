package service;

public class ReviewService {
    private static final ReviewService reviewService = new ReviewService();

    private ReviewService() {}

    public static ReviewService getInstance() {
        return reviewService;
    }
}
