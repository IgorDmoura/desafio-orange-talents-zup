package com.orangetalents.orangetalentszup.repository;

import com.orangetalents.orangetalentszup.domain.Vacina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacinaRepository extends JpaRepository<Vacina,Long> {
    Vacina findVacinaById(Long ID);
}
