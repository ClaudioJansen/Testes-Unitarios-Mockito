package dominio.comissao;

import infraestrutura.comissao.Venda;
import infraestrutura.comissao.VendaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.mockito.ArgumentMatchers.anyString;

@RunWith(MockitoJUnitRunner.class)
public class CalculadorComissaoServiceTest {

    @Mock
    private VendaRepository vendaRepository;

    @InjectMocks
    private CalculadorComissaoService calculadorComissaoService;

    @Test
    public void testaCalcularComissao(){
        Venda vendas = new Venda();
        vendas.setVendas(BigDecimal.TEN);

        Mockito.when(vendaRepository.findByCpfAndPeriodo(anyString())).thenReturn(vendas);

        BigDecimal totalVenda = calculadorComissaoService.calculaTotal("123.456.789-00");

        assert(totalVenda).equals(BigDecimal.TEN);
    }
}
