
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
public class FuncionariosController {
    public void createFuncionarios(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para a criar um novo Funcionario: ");
        System.out.print("nome: ");
        String nome = input.next();
        System.out.print("cpf: ");
        int cpf = input.nextInt();
        System.out.print("crm: ");
        int crm = input.nextInt();
        System.out.print("codigopostoatendimento: ");
        int codigopostoatendimento = input.nextInt();      
       
        
        FuncionariosBean fu = new FuncionariosBean(nome, cpf, crm, codigopostoatendimento);
        FuncionariosModel.create(fu, con);
        System.out.println("Funcionario criado com sucesso!!");     
    }

    void listarFuncionarios(Connection con) throws SQLException {
        HashSet all = FuncionariosModel.listAll(con);
        Iterator<FuncionariosBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

   /* void listarFuncionariosPostoAtendimento(Connection con) throws SQLException {
        HashSet all = FuncionariosModel.listAllWithPostoAtendimento(con);
        Iterator<FuncionariosBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }*/
}
