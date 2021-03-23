package com.orangetalents.orangetalentszup.response;

import com.orangetalents.orangetalentszup.domain.Pessoa;

import java.time.LocalDate;

public class VacinaPostResponseBody {
    private Long id;
    private String nomeVacina;
    private LocalDate dataVacina;
    private Pessoa pessoa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public LocalDate getDataVacina() {
        return dataVacina;
    }

    public void setDataVacina(LocalDate dataVacina) {
        this.dataVacina = dataVacina;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
