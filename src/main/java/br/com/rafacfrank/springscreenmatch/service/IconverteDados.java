package br.com.rafacfrank.springscreenmatch.service;

public interface IconverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
