package tn.stage.books.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.stage.books.Entities.Review;
import tn.stage.books.Repositories.BookRepository;
import tn.stage.books.Repositories.ReviewRepository;
import java.util.List;

@Service
public class ReviewService implements IReviewService {
    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    BookRepository bookRepository;

    @Override
    public Review addReview(Review review, Long id) {
        review.setBook(bookRepository.findById(id).get());
        return reviewRepository.save(review);
    }

    @Override
    public Review updateReview(Review review, Long id) {
        review.setBook(bookRepository.findById(id).get());
        return reviewRepository.save(review);
    }

    @Override
    public void deleteReview(Long id) {
        reviewRepository.findById(id).get().setBook(null);
        reviewRepository.deleteById(id);
    }

    @Override
    public List<Review> retreiveAllReviews() {
        return reviewRepository.findAll();
    }

    @Override
    public Review retreiveReview(long id) {
        return reviewRepository.findById(id).get();
    }
}
