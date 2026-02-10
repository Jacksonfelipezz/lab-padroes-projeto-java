package com.jackson.gof.subsistema1.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarCliete(String nome, String cep, String estado, String cidade) {
        System.out.println("Cliente salvo no sistema CRM:");
        System.out.println(nome + " " + cep + " " + estado + " " + cidade);
    }
}
