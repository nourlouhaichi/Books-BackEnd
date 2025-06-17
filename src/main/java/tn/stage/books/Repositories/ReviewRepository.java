package tn.stage.books.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.stage.books.Entities.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review,Long> {

}
