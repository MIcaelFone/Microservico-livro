package APi_BookNowService_livro.BookNow.service.Livro;

import APi_BookNowService_livro.BookNow.service.DTO.DadosCadastrarArquivos;
import jakarta.persistence.Embeddable;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ArquivosLivro {
    private String imagem;
    private String ebook;


    public ArquivosLivro(@Valid DadosCadastrarArquivos daods){
        this.imagem=daods.imagem();
        this.ebook=daods.ebook();
    }
}
