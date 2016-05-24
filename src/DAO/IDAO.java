/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author mensi
 * @param <T>
 */
public interface IDAO<T> {

    void insert(T t);

    void delete(T t);

    List<T> displayAll();

    T displayById(int id);

    void update(T t);

}
