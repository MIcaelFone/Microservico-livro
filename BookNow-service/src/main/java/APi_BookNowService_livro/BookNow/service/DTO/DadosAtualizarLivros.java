package APi_BookNowService_livro.BookNow.service.DTO;

import APi_BookNowService_livro.BookNow.service.Livro.ArquivosLivro;

public record DadosAtualizarLivros(String nome, String descricao, ArquivosLivro arquivos,Integer pontos){
}
