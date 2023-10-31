package br.com.XtremeGym.dao;

import br.com.XtremeGym.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserDao {
    public void createUser(User user){
        String sql= "Insert into USUARIO (NOME, CPF, EMAIL, SENHA) values (?, ?, ?, ?)";

        try{

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("Sucesso em conectar");

            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getCpf());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getSenha());

            preparedStatement.execute();

            System.out.println("Sucesso em inserir");

            connection.close();
        }catch (Exception e){
            System.out.println("Erro");
        }
    }
}
