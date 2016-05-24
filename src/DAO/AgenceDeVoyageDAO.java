/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DbProvider.DbProvider;
import Entities.AgenceDeVoyage;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author mensi
 */
public class AgenceDeVoyageDAO implements IDAO<AgenceDeVoyage> {

    private Statement statement;
    private PreparedStatement preparedstatement;
    private DbProvider dbProvider;
    private ResultSet resultSet;

    public AgenceDeVoyageDAO() throws IOException, SQLException {
        dbProvider.GetInstance();
    }

    @Override
    public void insert(AgenceDeVoyage t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(AgenceDeVoyage t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AgenceDeVoyage> displayAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AgenceDeVoyage displayById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(AgenceDeVoyage t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
