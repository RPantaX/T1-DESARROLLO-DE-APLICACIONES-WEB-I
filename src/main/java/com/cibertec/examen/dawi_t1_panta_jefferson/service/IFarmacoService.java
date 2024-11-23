package com.cibertec.examen.dawi_t1_panta_jefferson.service;

import com.cibertec.examen.dawi_t1_panta_jefferson.model.Farmaco;

import java.util.List;

public interface IFarmacoService {
    List<Farmaco> getAllFarmacos();
    Farmaco getFarmacoById(int idFarmaco);
    void saveFarmaco(Farmaco farmaco);
    void updateFarmaco(Farmaco farmaco);
}
