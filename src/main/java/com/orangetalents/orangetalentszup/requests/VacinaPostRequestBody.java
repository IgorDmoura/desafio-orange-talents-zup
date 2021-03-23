package com.orangetalents.orangetalentszup.requests;

import com.orangetalents.orangetalentszup.domain.Pessoa;
import com.orangetalents.orangetalentszup.domain.Vacina;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class VacinaPostRequestBody {
    @NotBlank(message = "O campo 'nome da vacina' não pode estar vazio")
    private String nomeVacina;
    @NotBlank(message = "O campo 'email da pessoa' não pode estar vazio")
    @Email
    private String email;
    @Past(message = "A data de vacina deve estar no passado")
    @NotNull(message = "O campo 'data da vacina' não pode estar vazio")
    private LocalDate dataVacina;

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataVacina() {
        return dataVacina;
    }

    public void setDataVacina(LocalDate dataVacina) {
        this.dataVacina = dataVacina;
    }
}
