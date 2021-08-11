package trabalhofinalbd; 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author rebeca
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        Conexao c = new Conexao();
        Connection con = c.getConnection();
        int op = 0;
        do{
            op = menu();
            try {
                switch (op) {
                    case 1: new PostoAtendimentoController().createPostoAtendimento(con);
                            break;
                    case 2: new FuncionariosController().createFuncionarios(con);
                            break;
                    case 3: new PostoAtendimentoController().listarPostoAtendimento(con);
                            break;
                    case 4: new FuncionariosController().listarFuncionarios(con);
                            break;
                  /*  case 5: new FuncionariosController().listarFuncionariosPostoAtendimento(con);
                            break;*/
                }
            }catch(SQLException ex) {
                //ex.printStackTrace();
                System.out.println(ex.getMessage());
                continue;
            }
        } while(op>0 && op<6);  
        con.close();
    }    
    
    private static int menu() {
        System.out.println("");
        System.out.println("Informe o nÃºmero da opÃ§Ã£o que desejas executar: ");
        System.out.println("1 - Inserir um novo Posto de Atendimento");
        System.out.println("2 - Inserir um novo Funcionario");
        System.out.println("3 - Exibir todos os Postos de Atendimento");
        System.out.println("4 - Exibir todos os Funcionarios");
        System.out.println("5 - Exibir todos os Funcionarios e seus respectivos Postoso de Atendimento");
        System.out.println("Digite qualquer outro valor para sair");
        System.out.print("Sua opÃ§Ã£o: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
