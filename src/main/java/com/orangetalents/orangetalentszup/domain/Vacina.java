package com.orangetalents.orangetalentszup.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Vacina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,length = 30)
    private String nomeVacina;
    @Column(unique = true, nullable = false, length = 50)
    private String email;
    @Column(nullable = false)
    private LocalDate dataVacina;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

    public Vacina(Long id, String nomeVacina, String email, LocalDate dataVacina, @NotNull Pessoa pessoa) {
        this.id = id;
        this.nomeVacina = nomeVacina;
        this.email = email;
        this.dataVacina = dataVacina;
        this.pessoa = pessoa;
    }

    @Deprecated
    public Vacina() {
    }

    public static Vacina findById(Vacina vacina, Pessoa pessoa){
        Vacina vacinatemp = new Vacina();
        vacinatemp.setNomeVacina(vacina.getNomeVacina());
        vacinatemp.setPessoa(pessoa);
        vacinatemp.setEmail(pessoa.getEmail());
        vacinatemp.setDataVacina(vacina.getDataVacina());
        return vacina;
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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
