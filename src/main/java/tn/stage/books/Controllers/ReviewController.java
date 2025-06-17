package tn.stage.books.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.stage.books.Entities.Review;
import tn.stage.books.Services.ReviewService;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @PostMapping("/addReview/{id}")
    Review addReview(@RequestBody Review review, @PathVariable Long id) {
        return reviewService.addReview(review,id);
    }

    @PutMapping("/updateReview/{id}")
    Review updateReview(@RequestBody Review review, @PathVariable Long id) {
        return reviewService.updateReview(review,id);
    }

    @GetMapping("/retreiveAllCategories")
    List<Review> retreiveAllCategories() {
        return reviewService.retreiveAllReviews();
    }

    @GetMapping("/retreiveReview{id}")
    Review retreiveReview(@PathVariable long id) {
        return reviewService.retreiveReview(id);
    }

    @DeleteMapping("/deleteReview/{id}")
    void deleteReview(@PathVariable long id){
        reviewService.deleteReview(id);
    }
}
