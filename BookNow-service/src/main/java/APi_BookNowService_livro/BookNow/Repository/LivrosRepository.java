package APi_BookNowService_livro.BookNow.Repository;

import APi_BookNowService_livro.BookNow.model.Livro.LivroClasse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivrosRepository extends JpaRepository<LivroClasse, Long> {
}
