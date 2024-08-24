package APi_BookNowService_livro.BookNow.service.DTO;

import jakarta.validation.constraints.NotBlank;



public record DadosCadastrarArquivos(

        String imagem,
        @NotBlank
        String ebook) {
}
