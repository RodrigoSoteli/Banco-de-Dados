package trabalhofinalbd;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PostoAtendimentoModel {

    static void create(PostoAtendimentoBean p, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("INSERT INTO postoatendimento (codigopostoatendimento, fone, bairro, rua, numeroendereco) VALUES (?,?,?,?,?)");
            st.setInt(1, p.getCodigopostoatendimento());
            st.setInt(2, p.getFone());
            st.setString(3, p.getBairro());
            st.setString(4, p.getRua());
            st.setInt(5, p.getNumeroendereco());
            st.execute();
            st.close();
    }
    
    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            String sql = "SELECT codigopostoatendimento, fone, bairro, rua, numeroendereco FROM postoatendimento";
            ResultSet result = st.executeQuery(sql);
            while(result.next()) {
                list.add(new PostoAtendimentoBean(result.getInt(1), result.getInt(2), result.getString(3), 
                result.getString(4), result.getInt(5)));
            }
        return list;
    }    
}

