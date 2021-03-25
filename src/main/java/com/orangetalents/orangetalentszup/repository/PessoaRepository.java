package com.orangetalents.orangetalentszup.repository;

import com.orangetalents.orangetalentszup.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa,Long> {
    Boolean existsPessoaByEmail(String email);
    Boolean existsPessoaByCpf(String cpf);

}
