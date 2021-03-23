package com.orangetalents.orangetalentszup.repository;

import com.orangetalents.orangetalentszup.domain.Pessoa;
import com.orangetalents.orangetalentszup.domain.Vacina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PessoaRepository extends JpaRepository<Pessoa,Long> {
    Boolean existsPessoaByEmail(String email);
    Boolean existsPessoaByCpf(String cpf);
    Optional<Pessoa> findPessoaByEmail(String email);

}
