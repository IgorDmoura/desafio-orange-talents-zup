package com.orangetalents.orangetalentszup.controller;

import com.orangetalents.orangetalentszup.domain.Pessoa;
import com.orangetalents.orangetalentszup.domain.Vacina;
import com.orangetalents.orangetalentszup.requests.VacinaPostRequestBody;
import com.orangetalents.orangetalentszup.response.PessoaPostResponseBody;
import com.orangetalents.orangetalentszup.response.VacinaPostResponseBody;
import com.orangetalents.orangetalentszup.service.PessoaService;
import com.orangetalents.orangetalentszup.service.VacinaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@RestController
@RequestMapping("vacinas")
public class VacinaController {
    private final VacinaService vacinaService;
    private final PessoaService pessoaService;

    public VacinaController(VacinaService vacinaService, PessoaService pessoaService) {
        this.vacinaService = vacinaService;
        this.pessoaService = pessoaService;
    }

    @PostMapping(path = "/cadastro")
    public ResponseEntity<VacinaPostResponseBody> criarNovaVacina(@RequestBody VacinaPostRequestBody vacinaPostRequestBody){
        return new ResponseEntity<>(vacinaService.criarNovaVacina(vacinaPostRequestBody),HttpStatus.CREATED);

    }
}
