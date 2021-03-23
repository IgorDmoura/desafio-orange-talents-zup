package com.orangetalents.orangetalentszup.mapper;

import com.orangetalents.orangetalentszup.domain.Pessoa;
import com.orangetalents.orangetalentszup.response.PessoaPostResponseBody;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PessoaResponseMapper{
    PessoaPostResponseBody toPessoaPostResponseBody(Pessoa pessoa);
}
