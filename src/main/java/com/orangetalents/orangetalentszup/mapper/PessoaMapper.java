package com.orangetalents.orangetalentszup.mapper;

import com.orangetalents.orangetalentszup.domain.Pessoa;
import com.orangetalents.orangetalentszup.requests.PessoaPostRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PessoaMapper{

    @Mapping(target = "id",ignore = true)
    Pessoa toPessoa(PessoaPostRequestBody PessoaPostRequestBody);
}
