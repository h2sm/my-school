package com.h2sm.myschool.conf;

public interface EntitySwapper<E,D> {
    public D entityToDTO(E entity);
    public E DTOtoEntity(D dto);
}
