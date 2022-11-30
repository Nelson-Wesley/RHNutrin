
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.crud;


public class crudDAO {

    
    public void crud(crud p) {
        
        //VAR DE CONEXÃO
        Connection con = ConnectionFactory.getConnection();
        
        //prepara os scripts SQL e executa
        PreparedStatement stmt = null;

        //ADD OS VALORES PELO GET NO SQL "?"
        try {
            stmt = con.prepareStatement("INSERT INTO entrevistado (nome,cpf,dataNascimento,endereco,endereco_entrevistado_idendereco_entrevistado,Capacitacoes,exeriencias,Nome_mae,Nome_pai,idade,Carteira_trabalho,identidade_genero,escolaridade,telefone_idtelefone,cargo_pleteado,Ultima_empresa_trabalhada)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
 
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getCpf());
            stmt.setInt(3, p.getDatadeaniversario());
            stmt.setString(4, p.getendereco());
            stmt.setInt(5, p.getId());
            stmt.setString(6, p.getEscolaridade());
            stmt.setString(7, p.getExperiencia());
            stmt.setString(8, p.getNomedamae());
            stmt.setString(9, p.getNomedopai());
            stmt.setInt(10, p.getIdade());
            stmt.setInt(11, p.getcarteiradetrabalho());
            stmt.setString(12, p.getIdentidadedegenero());
            stmt.setString(13, p.getEscolaridade());
            stmt.setInt(14, p.gettelefone());
            stmt.setString(15, p.getcargoesperado());
            stmt.setString(16, p.getUltimolocaltrabalhado());
            
            

            //EXECUTANDO O COMANDO SQL
            stmt.executeUpdate();

            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            //AQUI FECHO O STMT E O CON
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    //VAMOS LISTAR A TROPA QUE ESTAR NO BD
    public List<crud> Listar() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement pstm = null;
       
        //VAI PEGAR O RESULTADO DO SQL COMO UM ARRAY
        ResultSet rts = null;

        //criando lista de pessoa
        List<crud> pessoas = new ArrayList<>();

        try {
            pstm = con.prepareStatement("SELECT * FROM entrevistado");
            rts = pstm.executeQuery();
                    
            //VAI PEGAR OS VALORES NESSE LAÇO DO rts E PASSAR 
            while (rts.next()) {

                //INSTANCIANDO O OBJETO PESSOA
                crud pessoa = new crud();

          //VAMOS PEGAR OS VALORES (GET) DO rts E PASSAR PARA AS VARIAVEIS (SET)
                pessoa.setId(rts.getInt("idEntrevistado"));
                pessoa.setNome(rts.getString("nome"));
                pessoa.setIdade(rts.getInt("idade"));
                pessoa.setExperiencia(rts.getString("exeriencias"));
                pessoa.setIdentidadedegenero(rts.getString("identidade_genero"));
                pessoa.setDatadeaniversario(rts.getInt("dataNascimento"));
                pessoa.setNomedopai(rts.getString("nome_pai"));
                //add na lista pessoa
                pessoas.add(pessoa);
            }

        } catch (SQLException ex) {
            Logger.getLogger(crudDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro: "+ex);
        } finally {
            //FECHANDO CONEXÃO DESSA GALERA AI
            ConnectionFactory.closeConnection(con, pstm, rts);
        }

        return pessoas;

    }
    public List<crud> listarNome(String nom) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<crud> pessoas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM entrevistado WHERE nome LIKE ?");
            stmt.setString(1, "%"+nom+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                crud pessoa = new crud();

                pessoa.setId(rs.getInt("idEntrevistado"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setIdade(rs.getInt("idade"));
                pessoa.setExperiencia(rs.getString("experiencia"));
                pessoa.setIdentidadedegenero(rs.getString("identidade_genero"));
                pessoa.setEscolaridade(rs.getString("Capacitacoes"));
                pessoa.setNomedopai(rs.getString("nome_pai"));
                pessoas.add(pessoa);
            }

        } catch (SQLException ex) {
            Logger.getLogger(crudDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro: "+ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return pessoas;

    }

    public void atualizar(crud p) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE entrevistado SET nome = ? ,idade = ?,uf = ? WHERE id = ?");
            stmt.setString(1, p.getNome());
            stmt.setInt(2, p.getIdade());
            stmt.setString(3, p.getUf());
            //importante passar o id da linha
            stmt.setInt(4, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    public void delete(crud p) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM pessoa WHERE id = ?");
            //SETANDO O ID DA LINHA SEÇECIONADA
            stmt.setInt(1, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

}
