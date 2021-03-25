package com.orangetalents.orangetalentszup.repository;

import com.orangetalents.orangetalentszup.domain.Pessoa;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.validation.ConstraintViolationException;
import java.time.LocalDate;
import java.time.Month;

@DataJpaTest
@DisplayName("Testes para o PessoaRepository")
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
class PessoaRepositoryTest {
    @Autowired
    private PessoaRepository pessoaRepository;

    @Test
    @DisplayName("Teste de criação de pessoas")
    void save_PersistsPessoa_WhenSuccessful(){
        Pessoa pessoaToBeSaved = new Pessoa
                (1L, "Igor", "igor.dmoura01@gmail.com", "61175414069",
                        LocalDate.of(2021, Month.MARCH,23));

        Pessoa pessoaSaved = this.pessoaRepository.save(pessoaToBeSaved);
        Assertions.assertThat(pessoaSaved).isNotNull();
        Assertions.assertThat(pessoaSaved.getId()).isNotNull();
        Assertions.assertThat(pessoaSaved.getNome()).isEqualTo(pessoaToBeSaved.getNome());
        Assertions.assertThat(pessoaSaved.getEmail()).isEqualTo(pessoaToBeSaved.getEmail());
        Assertions.assertThat(pessoaSaved.getCpf()).isEqualTo(pessoaToBeSaved.getCpf());
        Assertions.assertThat(pessoaSaved.getNascimento()).isEqualTo(pessoaToBeSaved.getNascimento());
    }

    @Test
    @DisplayName("Teste gera exceção ConstraintViolationException quando o nome está vazio")
    void save_ThrowConstraintViolationException_WhenNameisEmpty(){
        Pessoa pessoa = new Pessoa
                (1L, "", "igor.dmoura01@gmail.com", "11436354121",
                        LocalDate.of(2021, Month.MARCH,23));

        Assertions.assertThatThrownBy(()-> this.pessoaRepository.save(pessoa))
                .isInstanceOf(ConstraintViolationException.class);
    }

    @Test
    @DisplayName("Teste gera exceção ConstraintViolationException quando o cpf está vazio")
    void save_ThrowConstraintViolationException_WhenCPFisEmpty(){
        Pessoa pessoa = new Pessoa
                (1L, "Igor", "igor.dmoura01@gmail.com", "",
                        LocalDate.of(2021, Month.MARCH,23));

        Assertions.assertThatThrownBy(()-> this.pessoaRepository.save(pessoa))
                .isInstanceOf(ConstraintViolationException.class);
    }

    @Test
    @DisplayName("Teste gera exceção ConstraintViolationException quando o email está vazio")
    void save_ThrowConstraintViolationException_WhenEmailIsEmpty(){
        Pessoa pessoa = new Pessoa
                (1L, "Igor", "", "11430072058",
                        LocalDate.of(2021, Month.MARCH,23));

        Assertions.assertThatThrownBy(()-> this.pessoaRepository.save(pessoa))
                .isInstanceOf(ConstraintViolationException.class);
    }
}