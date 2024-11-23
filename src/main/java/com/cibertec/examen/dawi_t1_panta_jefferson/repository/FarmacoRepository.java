package com.cibertec.examen.dawi_t1_panta_jefferson.repository;

import com.cibertec.examen.dawi_t1_panta_jefferson.model.Farmaco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmacoRepository extends JpaRepository<Farmaco, Integer> {
}
