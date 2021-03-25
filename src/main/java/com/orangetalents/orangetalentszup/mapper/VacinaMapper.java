package com.orangetalents.orangetalentszup.mapper;

import com.orangetalents.orangetalentszup.domain.Vacina;
import com.orangetalents.orangetalentszup.requests.VacinaPostRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface VacinaMapper {

    @Mapping(target = "id",ignore = true)
    Vacina toVacina(VacinaPostRequestBody vacinaPostRequestBody);
}
