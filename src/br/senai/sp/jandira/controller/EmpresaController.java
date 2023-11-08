package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.Model.Conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpresaController {
    public void consultarFuncionarios () throws SQLException {
        Conexao conexao= new Conexao();
        Connection objConnection = conexao.getConnection();
        Statement statement = objConnection.createStatement();

        String queryConsulta = "SELECT * FROM funcionarios";

        ResultSet resultSet = statement.executeQuery(queryConsulta);

        while (resultSet.next()){
            String idFuncionario = resultSet.getInt("idFuncionario");
            String nome = resultSet.getNString("nome");
            String cargo = resultSet.getNString("cargo");
            String departamento = resultSet.getNString("departamento");
            String salario = resultSet.getDouble("salario");
        }
    }
}
