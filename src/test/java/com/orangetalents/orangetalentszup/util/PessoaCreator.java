package com.orangetalents.orangetalentszup.util;

import com.orangetalents.orangetalentszup.domain.Pessoa;
import com.orangetalents.orangetalentszup.requests.PessoaPostRequestBody;
import com.orangetalents.orangetalentszup.response.PessoaPostResponseBody;

import java.time.LocalDate;
import java.time.Month;

public class PessoaCreator {

    public static PessoaPostRequestBody createPessoaToBeSaved(){
        return new PessoaPostRequestBody( "Igor", "igor.dmoura01@gmail.com", "64888216010",
                        LocalDate.of(2021, Month.MARCH,23));
    }

    public static PessoaPostRequestBody createValidPessoa(){
        return new PessoaPostRequestBody("Igor", "igor.dmoura01@gmail.com", "64888216010",
                LocalDate.of(2021, Month.MARCH,23));
    }
}
