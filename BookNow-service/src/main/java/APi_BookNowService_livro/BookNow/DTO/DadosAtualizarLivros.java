package APi_BookNowService_livro.BookNow.DTO;


import APi_BookNowService_livro.BookNow.model.Arquivos.ArquivosLivro;

public record DadosAtualizarLivros(String nome, String descricao, ArquivosLivro arquivos, Integer pontos){
}
