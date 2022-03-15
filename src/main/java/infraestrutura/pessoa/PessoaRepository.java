package infraestrutura.pessoa;

public class PessoaRepository {

    public void validarCampos(Pessoa pessoa){
        if(pessoa.getEmail() == null || pessoa.getNome() == null)
            throw new RuntimeException("Os campos nao podem ser nulos...");
    }

    public void save(Pessoa pessoa) {
        //salvar no banco
    }
}
