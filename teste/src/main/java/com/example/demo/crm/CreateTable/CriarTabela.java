package com.example.demo.crm.CreateTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CriarTabela {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/nome-do-banco-de-dados";
        String usuario = "nome-do-usuario";
        String senha = "senha-do-usuario";

        try (Connection conexao = DriverManager.getConnection(url, usuario, senha)) {
            Statement declaracao = conexao.createStatement();

            String sql = "CREATE TABLE nome-da-tabela ( "
                    + "id INT NOT NULL AUTO_INCREMENT, "
                    + "nome VARCHAR(255), "
                    + "idade INT, "
                    + "PRIMARY KEY (id))";

            declaracao.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

