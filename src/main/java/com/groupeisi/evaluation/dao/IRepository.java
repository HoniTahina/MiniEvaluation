package com.groupeisi.evaluation.dao;

import java.util.List;

public interface IRepository <T>{
    boolean save(T t);
    boolean delete(long id,T t);
    boolean update(T t);
    List<T> list(T t);
    T get(long id,T t);
}
