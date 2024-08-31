package APi_BookNowService_livro.BookNow.service;
import APi_BookNowService_livro.BookNow.DTO.DadosAtualizarLivros;
import APi_BookNowService_livro.BookNow.DTO.DadosCadastrarLivros;
import APi_BookNowService_livro.BookNow.Repository.LivrosRepository;
import APi_BookNowService_livro.BookNow.model.Livro.LivroClasse;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Service
public class LivroService {
    private LivrosRepository repository;
    private LivroClasse livros;
    @Transactional
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarDados(DadosCadastrarLivros dados){
      var cadastro= repository.save(new LivroClasse(dados));
    }
    @Transactional
    @ResponseStatus(HttpStatus.OK)
    public void atualizarDados(DadosAtualizarLivros dados,Long id){
        LivroClasse livro=repository.getReferenceById(id);
        livro.atualiza(dados);
    }
    @Transactional
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarDados(Long id){
        repository.deleteById(id);
    }
    @Transactional
    @ResponseStatus(HttpStatus.OK)
    public List<DadosCadastrarLivros> retornarTodosLivros(){
        return repository.findAll().stream().map(DadosCadastrarLivros :: new).toList();
    }

}
