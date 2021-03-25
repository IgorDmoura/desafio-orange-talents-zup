package com.orangetalents.orangetalentszup.util;

import com.orangetalents.orangetalentszup.domain.Pessoa;
import com.orangetalents.orangetalentszup.requests.PessoaPostRequestBody;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDate;
import java.time.Month;

public class PessoaPostRequetBodyCreator {

    public static PessoaPostRequestBody createPessoaToBeSaved(){
        return new PessoaPostRequestBody( "Igor", "igor.dmoura01@gmail.com", "61175414069",
                LocalDate.of(2021, Month.MARCH,23));
    }
}
