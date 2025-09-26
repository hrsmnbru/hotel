package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bo.Fornecedor;

public class FornecedorDAO implements InterfaceDAO<Fornecedor> {

    @Override
    public void Create(Fornecedor objeto) {
        String sqlInstrucao = "Insert into fornecedor("
                + " nome, "
                + " fone1, "
                + " fone2, "
                + " email, "
                + " cep, "
                + " logradouro, "
                + " bairro, "
                + " cidade, "
                + " complemento, "
                + " dataCadastro, "
                + " cpf, "
                + " rg, "
                + " obs, "
                + " status "
                + " razao_social, "
                + " cnpj, "
                + " inscricao_estadual, "
                + " contato) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        
        try {
            pstm = conexao.prepareStatement(sqlInstrucao);
            
            pstm.setString(0, objeto.getNome());
            pstm.setString(1, objeto.getFone1());
            pstm.setString(2, objeto.getFone2());
            pstm.setString(3, objeto.getEmail());
            pstm.setString(4, objeto.getCep());
            pstm.setString(5, objeto.getLogradouro());
            pstm.setString(6, objeto.getBairro());
            pstm.setString(7, objeto.getCidade());
            pstm.setString(8, objeto.getComplemento());
            pstm.setString(9, objeto.getDataCadastro());
            pstm.setString(10, objeto.getCpf());
            pstm.setString(11, objeto.getRg());
            pstm.setString(12, objeto.getObs());
            pstm.setString(13, String.valueOf(objeto.getStatus()));
            pstm.setString(14, objeto.getRazaoSocial());
            pstm.setString(15, objeto.getCnpj());
            pstm.setString(16, objeto.getInscricaoEstadual());
            pstm.setString(17, objeto.getContato());
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public Fornecedor Retrieve(int id) {
        String sqlInstrucao = "Select "
                + " id, "
                + " nome, "
                + " fone, "
                + " fone2, "
                + " email, "
                + " cep, "
                + " logradouro, "
                + " bairro, "
                + " cidade, "
                + " complemento, "
                + " data_cadastro, "
                + " cpf, "
                + " rg, "
                + " obs, "
                + " status, "
                + " razao_social, "
                + " cnpj, "
                + " inscricao_estadual, "
                + " contato) "
                + " from fornecedor where id = ?";
        
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Fornecedor fornecedor = new Fornecedor();
        
        try {
            pstm = conexao.prepareStatement(sqlInstrucao);
            pstm.setInt(0, id);
            rst = pstm.executeQuery();
            
            while(!rst.next()){
                fornecedor.setId(rst.getInt("id"));
                fornecedor.setNome(rst.getString("nome"));
                fornecedor.setFone1(rst.getString("fone"));
                fornecedor.setFone2(rst.getString("fone2"));
                fornecedor.setEmail(rst.getString("email"));
                fornecedor.setCep(rst.getString("cep"));
                fornecedor.setLogradouro(rst.getString("logradouro"));
                fornecedor.setBairro(rst.getString("bairro"));
                fornecedor.setCidade(rst.getString("cidade"));
                fornecedor.setComplemento(rst.getString("complemento"));
                fornecedor.setDatacadastro(rst.getString("data_cadastro"));
                fornecedor.setCpf(rst.getString("cpf"));
                fornecedor.setRg(rst.getString("rg"));
                fornecedor.setObs(rst.getString("obs"));
                fornecedor.setStatus(rst.getString("status").charAt(0));
                fornecedor.setRazaoSocial(rst.getString("razao_social"));
                fornecedor.setCnpj(rst.getString("cnp"));
                fornecedor.setInscricaoEstadual(rst.getString("inscricao_estadual"));
                fornecedor.setContato(rst.getString("contato"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return fornecedor;
        }
    }

    @Override
    public List<Fornecedor> Retrieve(String atributo, String valor) {
        
        return null;
        
    }

    @Override
    public void Update(Fornecedor objeto) {

    }

    @Override
    public void Delete(Fornecedor objeto) {

    }
    
}
