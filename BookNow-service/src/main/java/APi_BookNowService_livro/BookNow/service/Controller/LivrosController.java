package APi_BookNowService_livro.BookNow.service.Controller;

import APi_BookNowService_livro.BookNow.service.DTO.DadosAtualizarLivros;
import APi_BookNowService_livro.BookNow.service.DTO.DadosCadastrarLivros;
import APi_BookNowService_livro.BookNow.service.Livro.LivroClasse;
import APi_BookNowService_livro.BookNow.service.Repository.LivrosRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
@Tag(name="Livros",description="a Api de Livros")
public class LivrosController {

    @Autowired
    private LivrosRepository repository;

    @PostMapping
    @Transactional
    @Operation(summary = "Criar livro" ,description = "Cria um livro")
    public void cadastrar(@RequestBody @Valid DadosCadastrarLivros dados){
        repository.save(new LivroClasse(dados));
    }
    @GetMapping
    @Operation(summary = "Listar os livros" ,description = "Carrega todos os livros cadastrados")
    public List<DadosCadastrarLivros> listar(){
        return repository.findAll().stream().map(DadosCadastrarLivros::new).toList();
    }
    @Operation(summary = "Atualizar livro",description = "Atualiza o nome,descricao,arquivos,e pontos de um livro cadastrado através de um ID")
    @PutMapping("/{id}")
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizarLivros dados, @PathVariable long id){
        LivroClasse livro=repository.getReferenceById(id);
        livro.atualiza(dados);
    }
    @Operation(summary = "Deletar livro",description = " Deletar o livro  através de um ID")
    @DeleteMapping("/{id}")
    @Transactional
    public void deletar(@PathVariable long id){
        repository.deleteById(id);
    }
}
