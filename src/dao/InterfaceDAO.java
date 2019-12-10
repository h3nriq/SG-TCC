/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
/**
 *
 * @author paulo
 */
public interface InterfaceDAO {
 
    public void create(Object obj);

    public Object read(int id);
            
    public void update(Object obj);

    public void delete(int id);
}
 