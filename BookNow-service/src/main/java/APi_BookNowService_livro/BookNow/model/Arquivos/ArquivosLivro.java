package APi_BookNowService_livro.BookNow.model.Arquivos;

import APi_BookNowService_livro.BookNow.DTO.DadosCadastrarArquivos;
import jakarta.persistence.Embeddable;
import jakarta.validation.Valid;
import lombok.*;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class  ArquivosLivro {
    private String imagem;
    private String ebook;


    public ArquivosLivro(@Valid DadosCadastrarArquivos dados){
        this.imagem=dados.imagem();
        this.ebook=dados.ebook();
    }
}
