package com.cibertec.examen.dawi_t1_panta_jefferson.service;

import com.cibertec.examen.dawi_t1_panta_jefferson.model.Farmaco;
import com.cibertec.examen.dawi_t1_panta_jefferson.repository.FarmacoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class FarmacoService implements IFarmacoService {

    private final FarmacoRepository repository;


    @Override
    public List<Farmaco> getAllFarmacos() {
        return repository.findAll();
    }

    @Override
    public Farmaco getFarmacoById(int idFarmaco) {
        return repository.findById(idFarmaco).orElse(null);
    }

    @Override
    public void saveFarmaco(Farmaco farmaco) {
        repository.save(farmaco);
    }

    @Override
    public void updateFarmaco(Farmaco farmaco) {
        repository.save(farmaco);
    }
}
