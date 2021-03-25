package com.orangetalents.orangetalentszup.controller;

import com.orangetalents.orangetalentszup.domain.Pessoa;
import com.orangetalents.orangetalentszup.requests.PessoaPostRequestBody;
import com.orangetalents.orangetalentszup.response.PessoaPostResponseBody;
import com.orangetalents.orangetalentszup.service.PessoaService;
import com.orangetalents.orangetalentszup.util.PessoaCreator;
import com.orangetalents.orangetalentszup.util.PessoaPostRequetBodyCreator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.time.Month;

@ExtendWith(SpringExtension.class)
class PessoaControllerTest {

    @InjectMocks
    private PessoaController pessoaController;
    @Mock
    private PessoaService pessoaServiceMock;

    @BeforeEach
    public void setUp() {
        BDDMockito.when(pessoaServiceMock.criarNovaPessoa(ArgumentMatchers.any(PessoaPostRequestBody.class)))
                .thenReturn(new PessoaPostResponseBody(1L, "Igor",
                        "igor.dmoura01@gmail.com", "64888216010", LocalDate.of(2021, Month.MARCH, 23)));
    }


    @Test
    @DisplayName("Teste de criação de Pessoas")
    void create_ReturnsPessoa_WhenSuccessful() {

        PessoaPostResponseBody pessoa = pessoaController.criarNovaPessoa(PessoaPostRequetBodyCreator.createPessoaToBeSaved()).getBody();

        Assertions.assertThat(pessoa).isNotNull();
        Assertions.assertThat(pessoa).isEqualTo(new PessoaPostResponseBody(1L, "Igor",
                "igor.dmoura01@gmail.com", "64888216010", LocalDate.of(2021, Month.MARCH, 23)));
    }

}