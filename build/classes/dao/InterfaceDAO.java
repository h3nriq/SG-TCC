/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author paulo
 */
public interface InterfaceDAO {
 
    public boolean create(Object obj);

    public boolean read(Object obj);

    public boolean update(Object obj);

    public boolean delete(Object obj);
}
 