package com.orangetalents.orangetalentszup.service;

import com.orangetalents.orangetalentszup.domain.Pessoa;
import com.orangetalents.orangetalentszup.domain.Vacina;
import com.orangetalents.orangetalentszup.mapper.VacinaMapper;
import com.orangetalents.orangetalentszup.mapper.VacinaResponseMapper;
import com.orangetalents.orangetalentszup.repository.PessoaRepository;
import com.orangetalents.orangetalentszup.repository.VacinaRepository;
import com.orangetalents.orangetalentszup.requests.VacinaPostRequestBody;
import com.orangetalents.orangetalentszup.response.VacinaPostResponseBody;
import org.springframework.stereotype.Service;

@Service
public class VacinaService {
    private final VacinaRepository vacinaRepository;
    private final VacinaResponseMapper vacinaResponseMapper;
    private final VacinaMapper vacinaMapper;
    private final PessoaRepository pessoaRepository;

    public VacinaService(VacinaRepository vacinaRepository, VacinaResponseMapper vacinaResponseMapper, VacinaMapper vacinaMapper, PessoaRepository pessoaRepository) {
        this.vacinaRepository = vacinaRepository;
        this.vacinaResponseMapper = vacinaResponseMapper;
        this.vacinaMapper = vacinaMapper;
        this.pessoaRepository = pessoaRepository;
    }

    public VacinaPostResponseBody criarNovaVacina(VacinaPostRequestBody vacinaPostRequestBody){
        Vacina vacina = vacinaPostRequestBody.toVacina();
        Pessoa pessoa = pessoaRepository.findById(vacina.getPessoa().getId()).get();
        vacina = vacinaRepository.save(vacina);
        vacina.setPessoa(pessoa);
        return vacinaResponseMapper.toVacinaPostResponseBody(vacina);
    }
}
