package APi_BookNowService_livro.BookNow.service.Livro;

import APi_BookNowService_livro.BookNow.service.DTO.DadosAtualizarLivros;
import APi_BookNowService_livro.BookNow.service.DTO.DadosCadastrarLivros;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity(name = "livros")
@Table(name = "livros")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class LivroClasse {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private String classificacao_livro;
    private String autor;
    private Date datapublicacao;
    @Embedded
    private  ArquivosLivro arquivos;
    private Integer pontos;

    public LivroClasse(DadosCadastrarLivros dados) {
        this.id=dados.id();
        this.nome=dados.nome();
        this.descricao=dados.descricao();
        this.classificacao_livro=dados.classificacao_livro();
        this.autor=dados.autor();
        this.datapublicacao=dados.datapublicacao();
        this.arquivos=dados.arquivos();
        this.pontos=dados.pontos();
    }

    public void atualiza(DadosAtualizarLivros dados) {

        if(dados.nome()!=null){
            this.nome=dados.nome();
        }
        else if(dados.descricao()!=null){
            this.descricao=dados.descricao();
        }
        else if(dados.arquivos()!=null){
            this.arquivos=dados.arquivos();
        }
    }
}
