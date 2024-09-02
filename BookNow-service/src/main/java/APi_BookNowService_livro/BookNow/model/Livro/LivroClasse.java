package APi_BookNowService_livro.BookNow.model.Livro;

import APi_BookNowService_livro.BookNow.DTO.DadosAtualizarLivros;
import APi_BookNowService_livro.BookNow.DTO.DadosCadastrarLivros;
import APi_BookNowService_livro.BookNow.model.Arquivos.ArquivosLivro;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity(name = "livros")
@Table(name = "livros")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
@Builder
public class LivroClasse {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idLivros")
    private Long idLivro;
    @Column(name="NomeLivro",unique = true)
    private String NomeLivro;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "Autor")
    private String Autor;
    @Column(name = "dataPublicacao")
    private Date dataPublicacao;
    @Column(name = "classificacaoLivro")
    private String classificacaoLivro;
    @Embedded
    private ArquivosLivro arquivos;
    private Integer pontos;

    public LivroClasse(DadosCadastrarLivros dados) {
        this.idLivro=dados.idLivro();
        this.NomeLivro=dados.NomeLivro();
        this.descricao=dados.descricao();
        this.classificacaoLivro=dados.classificacaoLivro();
        this.Autor=dados.Autor();
        this.dataPublicacao=dados.dataPublicacao();
        this.arquivos=dados.arquivos();
        this.pontos=dados.pontos();
    }



    public void atualiza(DadosAtualizarLivros dados) {
        if(dados.nome()!=null){
            this.NomeLivro=dados.nome();
        }
        if(dados.descricao()!=null){
            this.descricao=dados.descricao();
        }
        if(dados.arquivos()!=null){
            this.arquivos=dados.arquivos();
        }
        if(dados.pontos()!=null) {
            this.pontos=dados.pontos();
        }
    }
}
