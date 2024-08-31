package APi_BookNowService_livro.BookNow.Controller;
import APi_BookNowService_livro.BookNow.DTO.DadosAtualizarLivros;
import APi_BookNowService_livro.BookNow.DTO.DadosCadastrarLivros;
import APi_BookNowService_livro.BookNow.Repository.LivrosRepository;
import APi_BookNowService_livro.BookNow.model.Livro.LivroClasse;
import APi_BookNowService_livro.BookNow.service.LivroService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
@Tag(name="Livros",description="API de Livros")
public class LivrosController {

    @Autowired
    private LivrosRepository repository;
    private LivroService servico;
    private LivroClasse livro;

    @PostMapping
    @Operation(summary = "Criar livro" ,description = "Cria um livro")
    public void cadastrar(@RequestBody @Valid DadosCadastrarLivros dados){
        servico.cadastrarDados(dados);
    }
    @GetMapping
    @Operation(summary = "Listar os livros" ,description = "Carrega todos os livros cadastrados")
    public void listarLivros(){
        servico.retornarTodosLivros();
    }


    @Operation(summary = "Atualizar livro",description = "Atualiza o nome,descricao,arquivos,e pontos de um livro cadastrado através de um ID")
    @PutMapping("/{id}")
    public void atualizar(@RequestBody @Valid DadosAtualizarLivros dados, @PathVariable long id){
       servico.atualizarDados(dados,id);
    }
    @Operation(summary = "Deletar livro",description = " Deletar o livro  através de um ID")
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable long id){
        servico.deletarDados(id);
    }
}
