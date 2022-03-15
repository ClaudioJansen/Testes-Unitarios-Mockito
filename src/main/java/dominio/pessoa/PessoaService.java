package dominio.pessoa;

import infraestrutura.pessoa.Pessoa;
import infraestrutura.pessoa.PessoaRepository;

public class PessoaService {

    private PessoaRepository pessoaRepository;

    public void salvarPessoa(Pessoa pessoa){
        save(pessoa);
    }

    public void save(Pessoa pessoa){
        pessoaRepository.validarCampos(pessoa);
        pessoaRepository.save(pessoa);
    }



}
