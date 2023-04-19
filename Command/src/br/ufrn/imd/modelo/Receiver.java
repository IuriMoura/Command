package br.ufrn.imd.modelo;

import java.util.List;
import java.util.ArrayList;

public class Receiver {
    private List<String> logs = new ArrayList<>();

    public void copy() {
        // Implementa a operação copia
        logs.add("Copy command executed");
    }

    public void save() {
        // Implementa a operação salvar
        logs.add("Save command executed");
    }

    public void print() {
        // Implementa a operação imprimir
        logs.add("Print command executed");
    }

    // Retornar a lista de logs
    public List<String> getLogs() {
        return logs;
    }
}
