package br.univille.poo.jdbc.dao;

import br.univille.poo.jdbc.model.Pessoa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO extends BaseDAO {

    public void insert(Pessoa pessoa){
        String sql = " insert into pessoa(nome,sobrenome) "
                + " values(?, ?) ";

        // try-with-resources
        try(PreparedStatement preparedStatement = prepareStatement(sql)){

            preparedStatement.setString(1,pessoa.getNome());
            preparedStatement.setString(2,pessoa.getSobrenome());
            preparedStatement.execute();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void updateById(Pessoa pessoa){
        String sql = " update pessoa set nome = ?, sobrenome = ? where id = ? ";

        // try-with-resources
        try(PreparedStatement preparedStatement = prepareStatement(sql)){

            preparedStatement.setString(1,pessoa.getNome());
            preparedStatement.setString(2,pessoa.getSobrenome());
            preparedStatement.setInt(3,pessoa.getId());
            preparedStatement.execute();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteById(Pessoa pessoa){
        String sql = " delete from tarefa where id = ? ";

        try(PreparedStatement preparedStatement = prepareStatement(sql)){

            preparedStatement.setInt(1,pessoa.getId());

            preparedStatement.execute();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public List<Pessoa> getAll(){
        List<Pessoa> lista = new ArrayList<>();

        String sql = " select id, nome, sobrenome from pessoa";

        try(PreparedStatement preparedStatement = prepareStatement(sql)){

            ResultSet result = preparedStatement.executeQuery();
            while(result.next()){
                Pessoa pessoa = new Pessoa();

                pessoa.setId(result.getInt(1));
                pessoa.setNome(result.getString(2));
                pessoa.setSobrenome(result.getString(3));

                lista.add(pessoa);
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

        return lista;
    }

    public Pessoa getById(int id){
        Pessoa pessoa = new Pessoa();

        String sql = " select id, nome, sobrenome from pessoa where id = ?";

        try(PreparedStatement preparedStatement = prepareStatement(sql)){

            preparedStatement.setInt(1, id);

            ResultSet result = preparedStatement.executeQuery();
            if(result.next()){
                pessoa = new Pessoa();

                pessoa.setId(result.getInt(1));
                pessoa.setNome(result.getString(2));
                pessoa.setSobrenome(result.getString(3));
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

        return pessoa;
    }


}