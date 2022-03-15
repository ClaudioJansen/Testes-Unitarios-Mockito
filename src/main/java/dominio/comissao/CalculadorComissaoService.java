package dominio.comissao;

import infraestrutura.comissao.Venda;
import infraestrutura.comissao.VendaRepository;

import java.math.BigDecimal;

public class CalculadorComissaoService {

    private VendaRepository vendaRepository;

    public BigDecimal calculaTotal(String cpf){
        Venda vendas = vendaRepository.findByCpfAndPeriodo(cpf);

        return vendas.getVendas();
    }

}
