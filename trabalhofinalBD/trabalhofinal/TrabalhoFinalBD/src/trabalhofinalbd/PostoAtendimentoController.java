
package trabalhofinalbd;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rebeca
 */
public class PostoAtendimentoController {
    public void createPostoAtendimento(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para a criar um novo Funcionario: ");
        System.out.print("codigopostoatendimento: ");
        int codigopostoatendimento = input.nextInt();
        System.out.print("fone: ");
        int fone = input.nextInt();
        System.out.print("bairro: ");
        String bairro = input.next();
        System.out.print("rua: ");
        String rua = input.next();    
        System.out.print("numeroendereco: ");
        int numeroendereco = input.nextInt();        
        System.out.println("Posto de Atendimento criado com sucesso!!");
        
        PostoAtendimentoBean pa = new PostoAtendimentoBean(codigopostoatendimento, fone, bairro, rua, numeroendereco);
        PostoAtendimentoModel.create(pa, con);
        System.out.println("Posto de Atendimento criado com sucesso!!");     
    }

    void listarPostoAtendimento(Connection con) throws SQLException {
        HashSet all = PostoAtendimentoModel.listAll(con);
        Iterator<PostoAtendimentoBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
