package com.orangetalents.orangetalentszup.mapper;

import com.orangetalents.orangetalentszup.domain.Vacina;
import com.orangetalents.orangetalentszup.response.VacinaPostResponseBody;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VacinaResponseMapper {

    VacinaPostResponseBody toVacinaPostResponseBody(Vacina vacina);
}
