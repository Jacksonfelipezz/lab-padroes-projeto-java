package com.jackson.gof.facade;

import com.jackson.gof.subsistema1.crm.CrmService;
import com.jackson.gof.subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){

        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliete(nome, cep, cidade, estado);
    }
}
