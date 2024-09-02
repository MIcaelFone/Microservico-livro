package APi_BookNowService_livro.BookNow.service;
import APi_BookNowService_livro.BookNow.DTO.DadosAtualizarLivros;
import APi_BookNowService_livro.BookNow.DTO.DadosCadastrarLivros;
import APi_BookNowService_livro.BookNow.Repository.LivrosRepository;
import APi_BookNowService_livro.BookNow.model.Livro.LivroClasse;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
   @Autowired
    private LivrosRepository repository;

    @Transactional
    public void cadastrarDados(DadosCadastrarLivros dados){
      repository.save(new LivroClasse(dados));
    }
    @Transactional
    public void atualizarDados(DadosAtualizarLivros dados,Long id){
        LivroClasse livro=repository.getReferenceById(id);
        livro.atualiza(dados);
    }
    @Transactional
    public void deletarDados(Long id){
        repository.deleteById(id);
    }
    @Transactional
    public String HelloWord(){
        return "Hello Word";
    }
    @Transactional
    public List<DadosCadastrarLivros> retornarTodosLivros(){
        return repository.findAll().stream().map(DadosCadastrarLivros :: new).toList();
    }

}
