package com.Proyecto.PruebaAA3.services;

import com.Proyecto.PruebaAA3.model.Aprendiz;

public interface AprendizService {
   Aprendiz newAprendiz (Aprendiz newAprendiz);
   Iterable <Aprendiz> getAll();
   Aprendiz modifyAprendiz (Aprendiz aprendiz);
   Boolean delateAprendiz (Long iduser);
   
}
