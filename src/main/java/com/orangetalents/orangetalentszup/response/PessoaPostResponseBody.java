package com.orangetalents.orangetalentszup.response;

import java.time.LocalDate;

public class PessoaPostResponseBody {
    private Long id;
    private String email;
    private LocalDate nascimento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
}
