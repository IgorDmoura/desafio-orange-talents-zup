package com.orangetalents.orangetalentszup.controller;

import com.orangetalents.orangetalentszup.requests.VacinaPostRequestBody;
import com.orangetalents.orangetalentszup.response.VacinaPostResponseBody;
import com.orangetalents.orangetalentszup.service.PessoaService;
import com.orangetalents.orangetalentszup.service.VacinaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("vacinas")
public class VacinaController {
    private final VacinaService vacinaService;


    public VacinaController(VacinaService vacinaService, PessoaService pessoaService) {
        this.vacinaService = vacinaService;
    }

    @PostMapping(path = "/cadastro")
    public ResponseEntity<VacinaPostResponseBody> criarNovaVacina(@Valid @RequestBody VacinaPostRequestBody vacinaPostRequestBody){
        return new ResponseEntity<>(vacinaService.criarNovaVacina(vacinaPostRequestBody),HttpStatus.CREATED);

    }
}
