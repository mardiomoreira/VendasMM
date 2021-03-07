/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DaoProdutos;
import java.util.ArrayList;
import model.ModelProdutos;

/**
 *
 * @author Mardio Moreira
 */
public class ControllerProdutos {

    private DAO.DaoProdutos daoProdutos = new DaoProdutos();

    /**
     * Salvar produtos controller
     *
     * @param pModelProdutos
     * @return
     */
    public int salvarProdutoController(ModelProdutos pModelProdutos) {
        return this.daoProdutos.salvaProdutosDAO(pModelProdutos);

    }

    /**
     * excluir um produto pelo codigo
     *
     * @param pIdProduto
     * @return
     */
    public boolean excluirProdutoController(int pIdProduto) {
        return this.daoProdutos.excluirProdutoDAO(pIdProduto);
    }
/**
 * alterar um produto
 * @param pModelProdutos
 * @return 
 */
    public boolean alterarProdutoController(ModelProdutos pModelProdutos) {
        return this.daoProdutos.alterarProdutoDAO(pModelProdutos);
    }
    /**
     * retornar protudo pelo código
     * @param pIdProduto
     * @return model produto
     */
    public ModelProdutos retornarProdutoController(int pIdProduto){
        return this.daoProdutos.retornarProdutoDAO(pIdProduto);
    }
    /**
     * retornar protudo pelo código
     * @param pNomeProduto
     * @return model produto
     */
    public ModelProdutos retornarProdutoController(String pNomeProduto){
        return this.daoProdutos.retornarProdutoDAO(pNomeProduto);
    }
    /**
     * retornar uma lista de produtos
     * @return lista model produtos
     */
    public ArrayList<ModelProdutos> retornarListaProdutoController(){
        return this.daoProdutos.retornarListaProdutosDao();
    }
}
