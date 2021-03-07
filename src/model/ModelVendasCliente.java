/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Mardio Moreira
 */
public class ModelVendasCliente {
    
    private ModelVendas modelvendas;
    private ModelCliente modelCliente;
    private ArrayList<ModelVendasCliente> listaModelVendasClientes;

    /**
     * @return the modelvendas
     */
    public ModelVendas getModelvendas() {
        return modelvendas;
    }

    /**
     * @param modelvendas the modelvendas to set
     */
    public void setModelvendas(ModelVendas modelvendas) {
        this.modelvendas = modelvendas;
    }

    /**
     * @return the modelCliente
     */
    public ModelCliente getModelCliente() {
        return modelCliente;
    }

    /**
     * @param modelCliente the modelCliente to set
     */
    public void setModelCliente(ModelCliente modelCliente) {
        this.modelCliente = modelCliente;
    }

    /**
     * @return the listaModelVendasClientes
     */
    public ArrayList<ModelVendasCliente> getListaModelVendasClientes() {
        return listaModelVendasClientes;
    }

    /**
     * @param listaModelVendasClientes the listaModelVendasClientes to set
     */
    public void setListaModelVendasClientes(ArrayList<ModelVendasCliente> listaModelVendasClientes) {
        this.listaModelVendasClientes = listaModelVendasClientes;
    }
    
    
}
