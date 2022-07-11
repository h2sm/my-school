package com.h2sm.myschool.mapper;

public interface EntitySwapper<E,D> {
    public D entityToDTO(E entity);
    public E DTOtoEntity(D dto);
}
