package com.orangetalents.orangetalentszup.service;

import com.orangetalents.orangetalentszup.domain.Vacina;
import com.orangetalents.orangetalentszup.mapper.VacinaMapper;
import com.orangetalents.orangetalentszup.mapper.VacinaResponseMapper;
import com.orangetalents.orangetalentszup.repository.VacinaRepository;
import com.orangetalents.orangetalentszup.requests.VacinaPostRequestBody;
import com.orangetalents.orangetalentszup.response.VacinaPostResponseBody;
import org.springframework.stereotype.Service;

@Service
public class VacinaService {
    private final VacinaRepository vacinaRepository;
    private final VacinaResponseMapper vacinaResponseMapper;
    private final VacinaMapper vacinaMapper;

    public VacinaService(VacinaRepository vacinaRepository, VacinaResponseMapper vacinaResponseMapper, VacinaMapper vacinaMapper) {
        this.vacinaRepository = vacinaRepository;
        this.vacinaResponseMapper = vacinaResponseMapper;
        this.vacinaMapper = vacinaMapper;
    }

    public VacinaPostResponseBody criarNovaVacina(VacinaPostRequestBody vacinaPostRequestBody){
        Vacina vacina = vacinaMapper.toVacina(vacinaPostRequestBody);
        vacina = vacinaRepository.save(vacina);
        return vacinaResponseMapper.toVacinaPostResponseBody(vacina);
    }
}
