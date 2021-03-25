package com.orangetalents.orangetalentszup.repository;

import com.orangetalents.orangetalentszup.controller.PessoaController;
import com.orangetalents.orangetalentszup.domain.Pessoa;
import com.orangetalents.orangetalentszup.domain.Vacina;
import com.orangetalents.orangetalentszup.requests.PessoaPostRequestBody;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.validation.ConstraintViolationException;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.Month;

@DataJpaTest
@DisplayName("Testes para o VacinaRepository")
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
class VacinaRepositoryTest {
    @Autowired
    private VacinaRepository vacinaRepository;
    @Autowired
    private PessoaRepository pessoaRepository;


    @Test
    @DisplayName("Teste de vacinação de pessoas")
    void save_PersistsVacina_WhenSuccessful(){
        Pessoa pessoa = new Pessoa(null,"Igor","igor.dmoura01@gmail.com","64888216010",
                LocalDate.of(2021,Month.MARCH,23));

       pessoaRepository.save(pessoa);

        Vacina vacinatoBeSaved = new Vacina(null,"CoronaVac",
                LocalDate.of(2021, Month.MARCH,23),pessoa);

        Vacina teste = vacinaRepository.save(vacinatoBeSaved);

        Assertions.assertThat(teste).isNotNull();
    }

}