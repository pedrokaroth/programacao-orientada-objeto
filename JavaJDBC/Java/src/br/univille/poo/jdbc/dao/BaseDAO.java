package br.univille.poo.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Data Access Object
public class BaseDAO {

    protected Connection getConnection(){
        return FabricaDeConexoes.getInstance().getConnection();
    }


    protected PreparedStatement prepareStatement(String sql) throws SQLException {
        return getConnection().prepareStatement(sql);
    }

    protected java.sql.Date mapToSqlDate(java.util.Date data){
        java.sql.Date sqlData = null;
        if(data != null){
            sqlData  = new java.sql.Date(data.getTime());
        }
        return sqlData;
    }

    protected java.util.Date mapToUtilDate(java.sql.Date data){
        java.util.Date utilData = null;
        if(data != null){
            utilData  = new java.util.Date(data.getTime());
        }
        return utilData;
    }

}
