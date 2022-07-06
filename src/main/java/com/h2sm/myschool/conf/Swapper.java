package com.h2sm.myschool.conf;

public interface Swapper<E,D> {
    public D entityToDTO(E entity);
    public E DTOtoEntity(D dto);
}
