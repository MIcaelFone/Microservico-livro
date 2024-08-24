package APi_BookNowService_livro.BookNow.service.Controller;

import APi_BookNowService_livro.BookNow.service.DTO.DadosAtualizarLivros;
import APi_BookNowService_livro.BookNow.service.DTO.DadosCadastrarLivros;
import APi_BookNowService_livro.BookNow.service.Livro.LivroClasse;
import APi_BookNowService_livro.BookNow.service.Repository.LivrosRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivrosController {

    @Autowired
    private LivrosRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastrarLivros dados){
        repository.save(new LivroClasse(dados));
    }
    @GetMapping
    public List<DadosCadastrarLivros> listar(){
        return repository.findAll().stream().map(DadosCadastrarLivros::new).toList();
    }
    @PutMapping("/{id}")
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizarLivros dados, @PathVariable long id){
        LivroClasse livro=repository.getReferenceById(id);
        livro.atualiza(dados);
    }
    @DeleteMapping("/{id}")
    @Transactional
    public void deletar(@PathVariable long id){
        repository.deleteById(id);
    }
}
