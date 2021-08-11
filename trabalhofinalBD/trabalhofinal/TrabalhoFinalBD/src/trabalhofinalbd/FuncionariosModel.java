package trabalhofinalbd;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rebeca
 */
public class FuncionariosModel {

    static void create(FuncionariosBean f, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("INSERT INTO funcionarios (nome, cpf, crm, codigopostoatendimento) "
                    + "VALUES (?,?,?,?)");
            st.setString(1, f.getNome());
            st.setInt(2, f.getCpf());
            st.setInt(3, f.getCrm());
            st.setInt(4, f.getCodigopostoatendimento());
            st.execute();
            st.close();
    }
    
    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            String sql = "SELECT nome, cpf, crm, codigopostoatendimento FROM funcionarios";
            ResultSet result = st.executeQuery(sql);
            while(result.next()) {
                list.add(new FuncionariosBean(result.getString(1), result.getInt(2), result.getInt(3), 
                result.getInt(4)));
            }
        return list;
    }    

  /*  static HashSet listAllWithPostoAtendimento(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
        st = con.createStatement();
        String sql = "SELECT nome, cpf, crm, funcionarios.codigopostoatendimento, fone, bairro, rua, numeroendereco  FROM funcionarios NATURAL JOIN postoatendimento";
        ResultSet result = st.executeQuery(sql);
        while(result.next()) {
            FuncionariosBean fu = new FuncionariosBean(result.getString(1), result.getInt(2), result.getInt(3),
                    result.getInt(4));
            PostoAtendimentoBean a = new PostoAtendimentoBean(result.getInt(4), result.getInt(5), result.getString(6), result.getString(7), result.getInt(8));
            fu.setPostoAtendimento(a);
            list.add(fu);
        }
        return list;  
    } */
}

