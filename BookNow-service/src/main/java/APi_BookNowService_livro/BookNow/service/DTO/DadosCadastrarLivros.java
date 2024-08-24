package APi_BookNowService_livro.BookNow.service.DTO;

import APi_BookNowService_livro.BookNow.service.Livro.ArquivosLivro;
import APi_BookNowService_livro.BookNow.service.Livro.LivroClasse;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record DadosCadastrarLivros(
        Long id,
        @NotBlank
        @Column(unique = true)
        String nome,
        @NotBlank
        String descricao,
        @NotBlank
        String autor,
        @NotNull
        Date datapublicacao,
        @NotBlank
        String classificacao_livro,
        ArquivosLivro arquivos,
        @NotNull
        Integer pontos
) {
        public DadosCadastrarLivros(LivroClasse livro) {
               this(livro.getId(),livro.getNome(),livro.getDescricao(),livro.getDescricao(),livro.getDatapublicacao(),livro.getAutor(),livro.getArquivos(),livro.getPontos());
        }

}