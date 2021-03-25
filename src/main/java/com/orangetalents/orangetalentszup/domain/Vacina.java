package com.orangetalents.orangetalentszup.domain;

import com.orangetalents.orangetalentszup.requests.PessoaPostRequestBody;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDate;

@Entity
public class Vacina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nomeVacina;
    @Past
    @NotNull
    private LocalDate dataVacina;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

    public Vacina(Long id, String nomeVacina, LocalDate dataVacina, @NotNull Pessoa pessoa) {
        this.id = id;
        this.nomeVacina = nomeVacina;
        this.dataVacina = dataVacina;
        this.pessoa = pessoa;
    }

    public Vacina() {
    }

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
