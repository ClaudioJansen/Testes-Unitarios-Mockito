package dominio.pessoa;

import infraestrutura.pessoa.Pessoa;
import infraestrutura.pessoa.PessoaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PessoaServiceTest {

    @Mock
    private PessoaRepository pessoaRepository;

    @InjectMocks
    private PessoaService pessoaService;

    @Test
    public void testeSalvarComSucesso(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joao");
        pessoa.setEmail("joao@gmail.com");

        pessoaService.salvarPessoa(pessoa);
        Mockito.verify(pessoaRepository, Mockito.times(1)).save(pessoa);
    }

    @Test
    public void testeNaoSalvarComSucesso(){
        Pessoa pessoa = new Pessoa();

        Mockito.doThrow(new RuntimeException()).when(pessoaRepository).validarCampos(pessoa);
        Mockito.verify(pessoaRepository, Mockito.times(0)).save(pessoa);
        Mockito.verifyNoInteractions(pessoaRepository);
    }
}
