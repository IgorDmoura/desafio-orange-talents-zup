package com.orangetalents.orangetalentszup.requests;

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
}
