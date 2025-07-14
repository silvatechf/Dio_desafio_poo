// src/com/example/iphone/interfaces/NavegadorInternet.java
package com.example.iphone.interfaces;

public interface NavegadorInternet {
    //exibe pag web apartir de um url
    void exibirPagina(String url);

    //add nova aba
    void adicionarNovaAba();

    //atualiza pagina atual
    void atualizarPagina();
}
