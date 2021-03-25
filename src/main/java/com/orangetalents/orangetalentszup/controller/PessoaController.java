package com.orangetalents.orangetalentszup.controller;

import com.orangetalents.orangetalentszup.requests.PessoaPostRequestBody;
import com.orangetalents.orangetalentszup.response.PessoaPostResponseBody;
import com.orangetalents.orangetalentszup.service.PessoaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("pessoas")
public class PessoaController {
    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping(path ="/cadastro")
    public ResponseEntity<PessoaPostResponseBody> criarNovaPessoa(@Valid @RequestBody PessoaPostRequestBody pessoaPostRequestBody){
        return new ResponseEntity<>(pessoaService.criarNovaPessoa(pessoaPostRequestBody), HttpStatus.CREATED);
    }
}
