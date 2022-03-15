package infraestrutura.comissao;

import java.math.BigDecimal;

public class VendaRepository {

    public Venda findByCpfAndPeriodo(String cpf) {
        Venda venda = new Venda();

        venda.setVendas(BigDecimal.TEN);

        return venda;
    }
}
