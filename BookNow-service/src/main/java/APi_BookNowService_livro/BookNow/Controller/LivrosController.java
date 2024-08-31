package APi_BookNowService_livro.BookNow.Controller;
import APi_BookNowService_livro.BookNow.DTO.DadosAtualizarLivros;
import APi_BookNowService_livro.BookNow.DTO.DadosCadastrarLivros;
import APi_BookNowService_livro.BookNow.Repository.LivrosRepository;
import APi_BookNowService_livro.BookNow.service.LivroService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
@Tag(name="Livros",description="API de Livros")
public class LivrosController {

    @Autowired
    private LivrosRepository repository;
    @Autowired

    private LivroService servico;

    @PostMapping
    @Operation(summary = "Criar livro" ,description = "Cria um livro")
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrar(@RequestBody @Valid DadosCadastrarLivros dados){
        servico.cadastrarDados(dados);
    }
    @GetMapping
    @Operation(summary = "Listar os livros" ,description = "Carrega todos os livros cadastrados")
    @ResponseStatus(HttpStatus.OK)
    public List<DadosCadastrarLivros> listarLivros(){
        return servico.retornarTodosLivros();
    }
    @GetMapping("/teste")
    @Operation(summary = "Teste de endpoint", description = "Endpoint de teste")
    @ResponseStatus(HttpStatus.OK)
    public String teste() {
        return "Hello";
    }
    @Operation(summary = "Atualizar livro",description = "Atualiza o nome,descricao,arquivos,e pontos de um livro cadastrado através de um ID")
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void atualizar(@RequestBody @Valid DadosAtualizarLivros dados, @PathVariable long id){
       servico.atualizarDados(dados,id);
    }
    @Operation(summary = "Deletar livro",description = " Deletar o livro  através de um ID")
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable long id){
        servico.deletarDados(id);
    }
}
