package APi_BookNowService_livro.BookNow.DTO;
import APi_BookNowService_livro.BookNow.model.Arquivos.ArquivosLivro;
import APi_BookNowService_livro.BookNow.model.Livro.LivroClasse;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record DadosCadastrarLivros(
        Long idLivro,
        @NotBlank
        String NomeLivro,
        @NotBlank
        String descricao,
        @NotBlank
        String Autor,
        @NotNull
        Date dataPublicacao,
        @NotBlank
        String classificacaoLivro,
        ArquivosLivro arquivos,
        @NotNull
        Integer pontos
) {
        public DadosCadastrarLivros(LivroClasse livro) {
               this(livro.getIdLivro(),livro.getNomeLivro(),livro.getDescricao(),livro.getAutor(),livro.getDataPublicacao(),livro.getClassificacaoLivro(),livro.getArquivos(),livro.getPontos());
        }
}