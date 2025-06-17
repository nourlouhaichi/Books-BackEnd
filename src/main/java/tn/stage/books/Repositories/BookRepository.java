package tn.stage.books.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.stage.books.Entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
