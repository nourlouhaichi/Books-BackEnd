package tn.stage.books.Services;
import tn.stage.books.Entities.Review;
import java.util.List;

public interface IReviewService {

    public Review addReview(Review review, Long id);
    public Review updateReview(Review review, Long id);
    public void deleteReview(Long id);
    public List<Review> retreiveAllReviews();
    public Review retreiveReview(long id);

}
