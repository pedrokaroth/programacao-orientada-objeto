import br.univille.poo.jdbc.dao.PessoaDAO;
import br.univille.poo.jdbc.model.Pessoa;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:banco_de_dados.db");
            
            PessoaDAO dao = new PessoaDAO();

            //INSERT

            Pessoa pessoa = new Pessoa();
            /*
            pessoa.setNome("Pedro Afonso");
            pessoa.setSobrenome("Roth Dimbarre");
            dao.insert(pessoa);

            pessoa.setNome("Arthur");
            pessoa.setSobrenome("Becker");
            dao.insert(pessoa);

            pessoa.setNome("Bruna");
            pessoa.setSobrenome("Brodbeck");
            dao.insert(pessoa);
            */


            //SELECT
            /*
            List<Pessoa> lista = dao.getAll();
            System.out.println(lista);
            */

            //UPDATE
            /*
            pessoa.setId(16);
            pessoa.setNome("Matheus");
            pessoa.setSobrenome("Alisson");
            dao.updateById(pessoa);
            */

            //DELETE
            pessoa.setId(30);
            dao.deleteById(pessoa);

            List<Pessoa> lista = dao.getAll();
            System.out.println(lista);




            
        }catch (ClassNotFoundException e){
            System.out.println("Deu erro classe não encontrada!");
            e.printStackTrace();
        }catch(SQLException e){
            System.out.println("Deu erro!");
            e.printStackTrace();
        }
    }
}
