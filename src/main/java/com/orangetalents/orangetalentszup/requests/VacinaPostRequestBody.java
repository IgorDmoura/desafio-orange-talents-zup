package com.orangetalents.orangetalentszup.requests;

import com.orangetalents.orangetalentszup.domain.Pessoa;
import com.orangetalents.orangetalentszup.domain.Vacina;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDate;

public class VacinaPostRequestBody {
    @NotBlank(message = "O campo 'nome da vacina' não pode estar vazio")
    private String nomeVacina;
    @Past(message = "A data de vacina deve estar no passado")
    @NotNull(message = "O campo 'data da vacina' não pode estar vazio")
    private LocalDate dataVacina;
    @NotNull(message = "O campo 'idPessoa' não pode estar nulo")
    private Long idPessoa;

    public VacinaPostRequestBody(@NotBlank(message = "O campo 'nome da vacina' não pode estar vazio") String nomeVacina, @Past(message = "A data de vacina deve estar no passado") @NotNull(message = "O campo 'data da vacina' não pode estar vazio") LocalDate dataVacina, @NotBlank(message = "O campo 'idPessoa' não pode estar vazio") Long idPessoa) {
        this.nomeVacina = nomeVacina;
        this.dataVacina = dataVacina;
        this.idPessoa = idPessoa;
    }

    public VacinaPostRequestBody() {
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

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public Vacina toVacina() {
        return new Vacina(null,nomeVacina,dataVacina,new Pessoa(idPessoa,null,null,null,null));
    }
}
