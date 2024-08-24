package APi_BookNowService_livro.BookNow.service.Repository;

import APi_BookNowService_livro.BookNow.service.Livro.LivroClasse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivrosRepository extends JpaRepository<LivroClasse, Long> {
}
